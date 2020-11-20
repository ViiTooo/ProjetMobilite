package com.example.projetmobilite;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

    private int idUtilisateur;
    private String nomUtil;
    private String prenomUtil;
    private String adresseMail;
    private String identifiant;
    private String mdp;
    private String lienPhoto;
    private int coordoneesGPS;
    private List<Theme> listeTheme;

    public Utilisateur(int idUtilisateur, String nomUtil, String prenomUtil, String adresseMail, String identifiant, String mdp) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtil = nomUtil;
        this.prenomUtil = prenomUtil;
        this.adresseMail = adresseMail;
        this.identifiant = identifiant;
        this.mdp = mdp;
        this.listeTheme = new ArrayList<Theme>();

    }
    public Utilisateur() {

    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getNomUtil() {
        return nomUtil;
    }

    public String getPrenomUtil() {
        return prenomUtil;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public String getLienPhoto() {
        return lienPhoto;
    }

    public int getCoordoneesGPS() {
        return coordoneesGPS;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setNomUtil(String nomUtil) {
        this.nomUtil = nomUtil;
    }

    public void setPrenomUtil(String prenomUtil) {
        this.prenomUtil = prenomUtil;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setLienPhoto(String lienPhoto) {
        this.lienPhoto = lienPhoto;
    }

    public void setCoordoneesGPS(int coordoneesGPS) {
        this.coordoneesGPS = coordoneesGPS;
    }

    public List<Theme> getListeTheme() {
        return listeTheme;
    }

    public void setListeTheme(List<Theme> listeTheme) {
        this.listeTheme = listeTheme;
    }
}
