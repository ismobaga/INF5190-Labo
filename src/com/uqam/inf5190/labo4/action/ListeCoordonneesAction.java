package com.uqam.inf5190.labo4.action;

import java.util.ArrayList;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import com.uqam.inf5190.labo2.bean.CoordonneeBean;
import com.uqam.inf5190.labo3.business.PersonneBusiness;
import com.uqam.inf5190.labo3.dto.PersonneDTO;



public class ListeCoordonneesAction extends ActionSupport {
	
	private List listeCoordonnees;
	private Logger LOG = Logger.getLogger(ListeCoordonneesAction.class);

	public String execute() {
		LOG.info("Affichage liste coordonnees ");
		listeCoordonnees = new ArrayList<>();

		PersonneBusiness personneBusiness = new PersonneBusiness();

		ArrayList<PersonneDTO> listePersonnesDTO = personneBusiness.getListePersonnes();

		for (int i = 0; i < listePersonnesDTO.size(); i++) {
			listeCoordonnees.add(new CoordonneeBean(listePersonnesDTO.get(i).getCoordonnee().getAdresse(),
					listePersonnesDTO.get(i).getCoordonnee().getCourriel()));
		}
		

		return SUCCESS;
	}
	public List getListeCoordonnees() {
		return listeCoordonnees;
	}

}
