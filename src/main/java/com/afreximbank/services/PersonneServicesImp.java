package com.afreximbank.services;

import com.afreximbank.entity.Etudiant;
import com.afreximbank.entity.Personne;
import com.afreximbank.entity.Professeur;

import java.util.ArrayList;
import java.util.List;

public class PersonneServicesImp implements PersonneServices {

    private List<Personne> personnes;

    public PersonneServicesImp() {
        this.personnes = new ArrayList<>();
    }

    @Override
    public Personne addPersonne(Personne personne) {
        personnes.add(personne);
        return personne;
    }

    @Override
    public Personne addPersonne(Etudiant etudiant) {
        personnes.add(etudiant);
        return etudiant;
    }

    @Override
    public Personne addPersonne(Professeur professeur) {
        personnes.add(professeur);
        return professeur;
    }

    @Override
    public List<Personne> list() {
        return this.personnes;
    }
}
