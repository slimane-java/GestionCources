package com.demo;

import com.demo.entity.Cours;
import com.demo.entity.Etudiant;
import com.demo.entity.Personne;
import com.demo.entity.Professeur;
import com.demo.services.CourceServices;
import com.demo.services.CourceServicesImp;
import com.demo.services.PersonneServices;
import com.demo.services.PersonneServicesImp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CourceServices courceServices = new CourceServicesImp();
        PersonneServices personneServices = new PersonneServicesImp();

        Cours cours = new Cours();
        cours.setId(1);
        cours.setCodeCours("F001");
        cours.setNom("FR");
        cours.setCredits(10);

        Professeur professeur = new Professeur(1, "hassan", 25, "LANG");

        Etudiant etudiant = new Etudiant(2, "karime", 14, "Etudiant", 3);

        courceServices.add(cours);

        courceServices.assignerProcess(1, professeur);

        courceServices.list().forEach(cours1 -> System.out.println("test  " + cours1.getProfesseur().getNom()));

        personneServices.addPersonne(professeur);
        personneServices.addPersonne(etudiant);

        personneServices
                .list()
                .forEach(Personne::afficherInfo);


    }
}