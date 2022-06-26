package com.example.javafxtp4.metier;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private int id;
    private String nom;
    private List<Professeur> professeurs;

    public Departement() {}

    public Departement(String nom) {
        this.nom = nom;
        this.professeurs = new ArrayList<Professeur>();}

    public Departement(int id,String nom) {
        this.id = id;
        this.nom = nom;
        this.professeurs = new ArrayList<Professeur>();}

    public int getId() {
        return id;}

    public String getNom() {
        return nom;}

    public List<Professeur> getProfesseurs() {
        return professeurs;}

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + "}";
    }
}
