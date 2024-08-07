package com.afreximbank.services;

import com.afreximbank.entity.Etudiant;
import com.afreximbank.entity.Personne;
import com.afreximbank.entity.Professeur;

import java.util.List;

public interface PersonneServices {
    Personne addPersonne(Personne personne);
    Personne addPersonne(Etudiant personne);
    Personne addPersonne(Professeur personne);
    List<Personne> list();
}
