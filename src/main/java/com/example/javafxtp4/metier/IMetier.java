package com.example.javafxtp4.metier;

import java.util.List;

public interface IMetier {

    void addProfesseur(Professeur p);
    List<Professeur> getAllProfesseurs();
    List<Professeur> getProfesseursByDepart(int id);
    void delProfesseur(int id);
    List<Professeur> searchProf(String keyWord);

    void addDepartement(Departement d);
    List<Departement> getAllDepartements();
    Departement getDepartementById(int id);
    void delDepartement(int id);
    List<Departement> searchDep(String keyWord);

}
