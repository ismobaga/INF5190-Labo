package com.uqam.inf5190.labo2.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uqam.inf5190.labo2.bean.PersonneBean;
import com.uqam.inf5190.labo3.business.PersonneBusiness;
import com.uqam.inf5190.labo3.dto.PersonneDTO;
import com.uqam.inf5190.labo2.bean.CoordonneeBean;

/**
 * Servlet implementation class ListeCoordonneesServlet
 */
@WebServlet("/ListeCoordonneesServlet")
public class ListeCoordonneesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeCoordonneesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<CoordonneeBean> listeCoordonees = new ArrayList<>();
		
		PersonneBusiness personneBusiness = new PersonneBusiness();
		
		ArrayList<PersonneDTO> listePersonnesDTO = personneBusiness.getListePersonnes();
		
		for(int i = 0; i < listePersonnesDTO.size(); i++) {
			listeCoordonees.add(new CoordonneeBean(listePersonnesDTO.get(i).getCoordonnee().getAdresse(),listePersonnesDTO.get(i).getCoordonnee().getCourriel()));
		}
				
		request.setAttribute("listeCoordonnees", listeCoordonees);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/listeCoordonnees.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
