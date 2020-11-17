package com.example.projetmobilite;

import java.util.List;

public class GestionUtilisateur {

    private Utilisateur utilisateur;
    private List<Utilisateur> listeUtilisateur;

    public GestionUtilisateur() {

    }

    public List<Theme> listerThemeUtilisateur(){
       return this.utilisateur.getListeTheme();
    }

    public void addTheme(List<Theme> listeTheme){
        for(Theme theme : listeTheme) {
            this.utilisateur.getListeTheme().add(theme);
        }
    }

    public void deleteTheme(List<Theme> listeTheme){
        for(Theme theme : listeTheme) {
            this.utilisateur.getListeTheme().remove(theme);
        }
    }

    public void creerCompte(int idUtilisateur, String nomUtil, String prenomUtil, String adresseMail, String identifiant, String mdp){
       this.utilisateur = new Utilisateur(idUtilisateur,nomUtil,prenomUtil,adresseMail,identifiant,mdp);
       this.listeUtilisateur.add(this.utilisateur);
    }

    public void connexion(String identifiant, String mdp){
        for(Utilisateur utilisateur : listeUtilisateur){
            if(utilisateur.getIdentifiant().equals(identifiant)){
                if(utilisateur.getMdp().equals(mdp)){
                    this.utilisateur = utilisateur;
                }
            }
        }
    }

    public Utilisateur reglageUtil(){
        return this.utilisateur;
    }

    public void setNomUtil(String nomUtil) {
        this.utilisateur.setNomUtil(nomUtil);
    }

    public void setPrenomUtil(String prenomUtil) {
        this.utilisateur.setPrenomUtil(prenomUtil);
    }

    public void setAdresseMail(String adresseMail) {
        this.utilisateur.setAdresseMail(adresseMail);
    }

    public void setIdentifiant(String identifiant) {
        this.utilisateur.setIdentifiant(identifiant);
    }

    public void setMdp(String mdp) {
        this.utilisateur.setMdp(mdp);
    }

    public void setLienPhoto(String lienPhoto) {
        this.utilisateur.setLienPhoto(lienPhoto);
    }

    public void setCoordoneesGPS(int coordoneesGPS) {
        this.utilisateur.setCoordoneesGPS(coordoneesGPS);
    }
}
