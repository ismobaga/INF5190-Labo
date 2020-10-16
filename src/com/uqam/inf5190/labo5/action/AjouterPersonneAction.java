package com.uqam.inf5190.labo5.action;

import com.opensymphony.xwork2.ActionSupport;
import com.uqam.inf5190.labo2.bean.PersonneBean;
import com.uqam.inf5190.labo3.business.PersonneBusiness;
import com.uqam.inf5190.labo3.dto.CoordonneeDTO;
import com.uqam.inf5190.labo3.dto.PersonneDTO;

public class AjouterPersonneAction extends ActionSupport {
	private PersonneBean personne;

	/**
	 * 
	 */
	private static final long serialVersionUID = 160675217303609015L;

	public String execute() {
		PersonneBusiness personneBusiness = new PersonneBusiness();

		PersonneDTO personneDTO = new PersonneDTO(personne.getPrenom(), personne.getNom(),
				new CoordonneeDTO(personne.getCoordonnee().getAdresse(), personne.getCoordonnee().getCourriel()));

		personneBusiness.ajouterPersonne(personneDTO);

		return SUCCESS;
	}

	public PersonneBean getPersonne() {
		return personne;
	}

	public void setPersonne(PersonneBean personne) {
		this.personne = personne;
	}

}
