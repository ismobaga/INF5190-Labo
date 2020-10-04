package com.uqam.inf5190.labo3.business;

import java.util.ArrayList;

import com.uqam.inf5190.labo3.dto.PersonneDTO;
import com.uqam.inf5190.labo3.dao.PersonneDAO;

public class PersonneBusiness {
    
	PersonneDAO personneDAO = new PersonneDAO();
	
    public PersonneBusiness() {
       
    }
    
    public ArrayList<PersonneDTO> getListePersonnes() {
        return personneDAO.getAll();
    }
   
}
