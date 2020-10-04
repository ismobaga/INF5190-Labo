package com.uqam.inf5190.labo2.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uqam.inf5190.labo2.bean.PersonneBean;
import com.uqam.inf5190.labo3.dto.PersonneDTO;
import com.uqam.inf5190.labo3.business.PersonneBusiness;

import java.util.ArrayList;

/**
 * Servlet implementation class ListePersonnesServlet
 */
@WebServlet("/ListePersonnesServlet")
public class ListePersonnesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListePersonnesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<PersonneBean> listePersonnes = new ArrayList<>();
		
		PersonneBusiness personneBusiness = new PersonneBusiness();
		
		ArrayList<PersonneDTO> listePersonnesDTO = personneBusiness.getListePersonnes();
		
		for(int i = 0; i < listePersonnesDTO.size(); i++) {
			listePersonnes.add(new PersonneBean(listePersonnesDTO.get(i).getPrenom(), listePersonnesDTO.get(i).getNom()));
		}
				
		request.setAttribute("listePersonnes", listePersonnes);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/listePersonnes.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
