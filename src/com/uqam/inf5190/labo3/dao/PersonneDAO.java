package com.uqam.inf5190.labo3.dao;

import com.uqam.inf5190.labo3.dto.CoordonneeDTO;
import com.uqam.inf5190.labo3.dto.PersonneDTO;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class PersonneDAO {
	private String filePath = "/home/ismail/eclipse/data/personnes.txt";

   ArrayList<PersonneDTO> listePersonnes = new ArrayList<>();
	
   public PersonneDAO() {
   
   }
   
   public ArrayList<PersonneDTO> getAll() {
      
      try {
	     //File myObj = new File("personnes.txt");
		 Scanner myReader = new Scanner(new File(filePath));
		 
		 String prenom;
		 String nom;
		 String adresse;
		 String courriel;
		 
		 while (myReader.hasNextLine()) {
		    		    
		    prenom   = myReader.nextLine();
		    nom      = myReader.nextLine();
		    adresse  = myReader.nextLine();
		    courriel = myReader.nextLine();
		    	
		    listePersonnes.add(new PersonneDTO(prenom,nom, new CoordonneeDTO(adresse,courriel)));
		    
		 }
		 myReader.close();
	  } catch (FileNotFoundException e) {
	     System.out.println("Le fichier est inexistant.");
		 e.printStackTrace();
	  }
   		
	  return listePersonnes;
   }

   public void save(PersonneDTO personne) {
      listePersonnes.add(personne);
   }
      
   public void delete(PersonneDTO personne) {
     listePersonnes.remove(personne);
   }

public void ajouterPersonne(PersonneDTO personne) {
	try {
		File file = new File(filePath);
		FileWriter fw =  new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(personne.getPrenom() + "\n");
		bw.write(personne.getNom() + "\n");
		bw.write(personne.getCoordonnee().getAdresse() + "\n");
		bw.write(personne.getCoordonnee().getCourriel() + "\n");
		
		
		bw.close();
		
	} catch (Exception e) {
		
	}
	return ;
}
      
}
