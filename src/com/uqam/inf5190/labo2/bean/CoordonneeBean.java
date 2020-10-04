package com.uqam.inf5190.labo2.bean;

public class CoordonneeBean {
	
	private String adresse;
    private String courriel;
    
    public CoordonneeBean() {
     
     }
    
    public CoordonneeBean(String adresse, String courriel) {
       this.adresse = adresse;
       this.courriel = courriel;
    }
     
    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public String getCourriel() {
        return courriel;
    }
    
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }
    
}
