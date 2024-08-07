package com.afreximbank.entity;

import java.util.List;

public class Etudiant extends Personne {

    private String specialite;
    private int annee;
    private List<CoursNote> coursNotes;

    public Etudiant() {
        super();
    }

    public Etudiant(int id, String nom, int age, String specialite, int annee) {
        super(id, nom, age);
        this.specialite = specialite;
        this.annee = annee;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public List<CoursNote> getCours() {
        return coursNotes;
    }

    public void setCours(List<CoursNote> coursNotes) {
        this.coursNotes = coursNotes;
    }

    @Override
    public void afficherInfo() {

        System.out.println("Etudiant: " + getNom() + " " + getAge() + " " + getSpecialite());

    }
}
