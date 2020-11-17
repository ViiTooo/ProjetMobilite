package com.example.projetmobilite;

public class Theme {

    private int idTheme;
    private String nomTheme;

    public Theme(int idTheme, String nomTheme) {
        this.idTheme = idTheme;
        this.nomTheme = nomTheme;
    }

    public int getIdTheme() {
        return idTheme;
    }

    public String getNomTheme() {
        return nomTheme;
    }

    public void setIdTheme(int idTheme) {
        this.idTheme = idTheme;
    }

    public void setNomTheme(String nomTheme) {
        this.nomTheme = nomTheme;
    }
}
