package com.afreximbank.services;

import com.afreximbank.entity.Cours;
import com.afreximbank.entity.Professeur;

import java.util.List;

public interface CourceServices {
    Cours add(Cours cours);
    Cours assignerProcess(int id, Professeur professeur);
    List<Cours> list();
}
