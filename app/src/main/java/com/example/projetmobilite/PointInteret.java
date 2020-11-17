package com.example.projetmobilite;

import java.util.ArrayList;
import java.util.List;

public class PointInteret {

    private int idPointInteret;
    private String nomPoint;
    private String description;
    private String url;
    private int coordoneesGPS;
    private List<Theme> listeTheme;
    private List<Utilisateur> listeUtilisateur;

    public PointInteret(int idPointInteret, String nomPoint, String description, String url, int coordoneesGPS,List<Theme> listeTheme) {
        this.idPointInteret = idPointInteret;
        this.nomPoint = nomPoint;
        this.description = description;
        this.url = url;
        this.coordoneesGPS = coordoneesGPS;
        this.listeTheme = listeTheme;
        this.listeUtilisateur = new ArrayList<Utilisateur>();
    }

    public int getIdPointInteret() {
        return idPointInteret;
    }

    public String getNomPoint() {
        return nomPoint;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public int getCoordoneesGPS() {
        return coordoneesGPS;
    }

    public void setIdPointInteret(int idPointInteret) {
        this.idPointInteret = idPointInteret;
    }

    public void setNomPoint(String nomPoint) {
        this.nomPoint = nomPoint;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCoordoneesGPS(int coordoneesGPS) {
        this.coordoneesGPS = coordoneesGPS;
    }
}
