package com.uqam.inf5190.labo3.dto;

import com.uqam.inf5190.labo3.dto.CoordonneeDTO;

public class PersonneDTO {

	private String nom;
    private String prenom;
    private CoordonneeDTO coordonnee;
    
    public PersonneDTO(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
     }
    
    public PersonneDTO(String prenom, String nom, CoordonneeDTO coordonnee) {
       this.nom = nom;
       this.prenom = prenom;
       this.coordonnee = coordonnee;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public CoordonneeDTO getCoordonnee() {
        return coordonnee;
    }
    public void setcoordonnee(CoordonneeDTO coordonnee) {
        this.coordonnee = coordonnee;
    }
}
