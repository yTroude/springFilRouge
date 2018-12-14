package com.proxiad.formation.spring.exo1;

public class Voiture {
    private String nom;
    private Moteur moteur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public static Voiture create(){
        System.out.println("Creating voiture... Created !");
        return new Voiture();
    }
}
