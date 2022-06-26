package com.example.javafxtp4.console;

import com.example.javafxtp4.metier.Departement;
import com.example.javafxtp4.metier.IMetier;
import com.example.javafxtp4.metier.IMetierImpl;
import com.example.javafxtp4.metier.Professeur;

public class AppConsole {
    public static void main(String[] args) {
        IMetier metier = new IMetierImpl();

        Departement d1 = new Departement(" Génie Informatique");
        Departement d2 = new Departement(" Génie Finance");
        Departement d3 = new Departement(" Génie Civil");

        metier.addDepartement(d1);
        metier.addDepartement(d2);
        metier.addDepartement(d3);

        metier.getAllDepartements().forEach(d -> {
            System.out.println(d);
        });

        Professeur p1 = new Professeur("Ouhmida", "Asmae", "BK2545", "Rue de x num y", "Asmae@gmail.com",
                "+212600000000", "2008-06-03");
        Professeur p2 = new Professeur("Riad", "Khaldi", "BK7586", "Rue de x num y", "Riad@gmail.com",
                "+212600000000", "2020-06-04");

        metier.addProfesseur(p1);
        metier.addProfesseur(p2);

        metier.getAllProfesseurs().forEach(p -> {
            System.out.println(p);
        });

    }
}
