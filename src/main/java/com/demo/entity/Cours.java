package com.demo.entity;


public class Cours {
    private int id;
    private String codeCours;
    private String nom;
    private int credits;
    private Professeur professeur;

    public Cours() {
    }

    public Cours(String codeCours, int credits, String nom, Professeur professeur) {
        this.codeCours = codeCours;
        this.credits = credits;
        this.nom = nom;
        this.professeur = professeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public void setCodeCours(String codeCours) {
        this.codeCours = codeCours;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}
