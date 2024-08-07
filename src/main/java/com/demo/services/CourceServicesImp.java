package com.demo.services;

import com.demo.entity.Cours;
import com.demo.entity.Professeur;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CourceServicesImp implements CourceServices{

    private List<Cours> coursList;

    public CourceServicesImp() {
        this.coursList = new ArrayList<>();
    }

    @Override
    public Cours add(Cours cours) {
        coursList.add(cours);
        return cours;
    }

    @Override
    public Cours assignerProcess(int id, Professeur professeur) {
        AtomicReference<Cours> result = new AtomicReference<>(new Cours());
        coursList.forEach(cours -> {
            if (cours.getId() == id) {
                cours.setProfesseur(professeur);
                result.set(cours);
            }
        });
        return result.get();
    }

    @Override
    public List<Cours> list() {
        return coursList;
    }
}
