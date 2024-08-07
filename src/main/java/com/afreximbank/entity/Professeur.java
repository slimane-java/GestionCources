package com.afreximbank.entity;

public class Professeur extends Personne {

    private String departement;

    public Professeur() {}

    public Professeur(int id, String nom, int age, String departement) {
        super(id, nom, age);
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Professeur: " + getNom() + " " + getAge() + " " + getDepartement());
    }
}
