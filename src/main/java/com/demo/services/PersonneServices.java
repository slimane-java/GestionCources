package com.demo.services;

import com.demo.entity.Etudiant;
import com.demo.entity.Personne;
import com.demo.entity.Professeur;

import java.util.List;

public interface PersonneServices {
    Personne addPersonne(Personne personne);
    Personne addPersonne(Etudiant personne);
    Personne addPersonne(Professeur personne);
    List<Personne> list();
}
