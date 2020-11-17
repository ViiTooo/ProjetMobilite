package com.example.projetmobilite;

public class Message {

    private int idMessage;
    private String texte;

    public Message(int idMessage, String texte) {
        this.idMessage = idMessage;
        this.texte = texte;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public String getTexte() {
        return texte;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
