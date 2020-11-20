package com.example.projetmobilite;

import java.util.ArrayList;
import java.util.List;

public class GestionRecherche {

    private GestionUtilisateur gestionUtilisateur;

    public GestionRecherche() {

    }

    public Utilisateur rechercheUtilParNom(String nomUtil){
        Utilisateur utilisateur = new Utilisateur();
        for(Utilisateur util : this.gestionUtilisateur.getListeUtilisateur()){
            if(util.getNomUtil().equals(nomUtil)){
                utilisateur =  util;
            }
        }
        return utilisateur;
    }

    public List<Utilisateur> rechercheUtilisateurTheme(String nomTheme){
        List<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();
        for(Utilisateur util : this.gestionUtilisateur.getListeUtilisateur()){
            for(Theme theme : util.getListeTheme()){
                if(theme.getNomTheme().equals(nomTheme)) {
                    listeUtilisateur.add(util);
                }
            }
        }
        return listeUtilisateur;
    }



}
