package com.afreximbank;

import com.afreximbank.entity.Cours;
import com.afreximbank.entity.Etudiant;
import com.afreximbank.entity.Personne;
import com.afreximbank.entity.Professeur;
import com.afreximbank.services.CourceServices;
import com.afreximbank.services.CourceServicesImp;
import com.afreximbank.services.PersonneServices;
import com.afreximbank.services.PersonneServicesImp;

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