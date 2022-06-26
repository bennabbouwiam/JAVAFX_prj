package com.example.javafxtp4.metier;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String cin;
    private String adresse;
    private String email;
    private String telephone;
    private String date_recrutement;
    private Departement departement;

    public Professeur(String nom, String prenom, String cin, String adresse, String email, String telephone, String date_recrutement) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.date_recrutement = date_recrutement;
    }

    public Professeur(int id,String nom, String prenom, String cin, String adresse, String email, String telephone, String date_recrutement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.date_recrutement = date_recrutement;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDate_recrutement() {
        return date_recrutement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDate_recrutement(String date_recrutement) {
        this.date_recrutement = date_recrutement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Professeur{nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", adresse=" + adresse + ", email=" + email + ", telephone=" + telephone + ", date_recrutement=" + date_recrutement + "}";
    }
}
