package com.demo.services;

import com.demo.entity.Cours;
import com.demo.entity.Professeur;

import java.util.List;

public interface CourceServices {
    Cours add(Cours cours);
    Cours assignerProcess(int id, Professeur professeur);
    List<Cours> list();
}
