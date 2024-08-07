package com.demo.entity;

public class CoursNote {
    private Cours cours;
    public double note;

    public CoursNote() {
    }

    public CoursNote(Cours cours, double note) {
        this.cours = cours;
        this.note = note;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
