package com.uqam.inf5190.labo3.dto;

public class CoordonneeDTO {

	private String adresse;
    private String courriel;
    
    public CoordonneeDTO(String adresse, String courriel) {
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
