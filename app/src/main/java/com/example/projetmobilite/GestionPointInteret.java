package com.example.projetmobilite;

import android.os.Build;
import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;

public class GestionPointInteret {


    private List<PointInteret> listepointsInterets;


    private PointInteret pointInteret;

    public GestionPointInteret() {

    }

    public PointInteret getPointInteret() {
        return pointInteret;
    }

    public void setPointInteret(PointInteret pointInteret) {
        this.pointInteret = pointInteret;
    }


    public List<PointInteret> getListepointsInterets() {
        return listepointsInterets;
    }

    public void setListepointsInterets(List<PointInteret> listepointsInterets) {
        this.listepointsInterets = listepointsInterets;
    }

    public void marquerPointInteret(Utilisateur util,int idPointInteret){
        for(PointInteret pointInteret : this.listepointsInterets){
            if(pointInteret.getIdPointInteret()==idPointInteret){
                this.pointInteret=pointInteret;
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            this.pointInteret.getListeUtilisateur().put(util, SystemClock.currentGnssTimeClock().toString());
        }else{
            System.out.println("pb de version");
        }
    }

    public void affichercarte(int idUtilisateur){
        List<PointInteret> listePointInteret = new ArrayList<PointInteret>();
        for(PointInteret pointInteret : this.listepointsInterets){
            for(Utilisateur util : pointInteret.getListeUtilisateur().keySet()){
                if(util.getIdUtilisateur()==idUtilisateur){
                    listePointInteret.add(pointInteret);
                }
            }
        }
    }

}
