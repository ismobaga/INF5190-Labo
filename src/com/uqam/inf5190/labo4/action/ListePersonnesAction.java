package com.uqam.inf5190.labo4.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.uqam.inf5190.labo2.bean.PersonneBean;
import com.uqam.inf5190.labo3.business.PersonneBusiness;
import com.uqam.inf5190.labo3.dto.PersonneDTO;

public class ListePersonnesAction extends ActionSupport {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private ArrayList<PersonneBean> listePersonnes;
	private Logger LOG = Logger.getLogger(ListePersonnesAction.class);

	public String execute() {
		
		LOG.info("Affichage Liste personnes");

		listePersonnes = new ArrayList<>();

		PersonneBusiness personneBusiness = new PersonneBusiness();

		ArrayList<PersonneDTO> listePersonnesDTO = personneBusiness.getListePersonnes();

		for (int i = 0; i < listePersonnesDTO.size(); i++) {
			listePersonnes
					.add(new PersonneBean(listePersonnesDTO.get(i).getPrenom(), listePersonnesDTO.get(i).getNom()));
		}

		return SUCCESS;
	}

	public List getListePersonnes() {
		return listePersonnes;

	}

}
