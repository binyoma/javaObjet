package com.afpa;

public class Client {
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Ville;

    public Client(String nom, String prenom, String adresse, String ville) {
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
        Ville = ville;
    }

    public Client(String nom, String prenom, String ville) {
        Nom = nom;
        Prenom = prenom;
        Ville = ville;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getVille() {
        return Ville;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Ville='" + Ville + '\'' +
                '}';
    }
}
