package com.uqam.inf5190.labo2.bean;

import com.uqam.inf5190.labo2.bean.CoordonneeBean;

public class PersonneBean {

	private String nom;
    private String prenom;
    private CoordonneeBean coordonnee;
    
    public PersonneBean() {
        
     }
    
    public PersonneBean(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
     }
    
    public PersonneBean(String prenom, String nom, CoordonneeBean coordonnee) {
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
    
    public CoordonneeBean getCoordonnee() {
        return coordonnee;
    }
    public void setCoordonnee(CoordonneeBean coordonnee) {
        this.coordonnee = coordonnee;
    }
  
}
