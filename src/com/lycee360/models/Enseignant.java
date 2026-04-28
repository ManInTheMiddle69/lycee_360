package com.lycee360.models;

public class Enseignant extends Personne {

    // Champs privés
    private String matiere;
    private String email;

    // Constructeur vide
    public Enseignant() {}

    // Constructeur complet
    public Enseignant(int id, String nom, String prenom, int age, String matiere, String email) {
        super(id, nom, prenom, age);
        this.matiere = matiere;
        this.email = email;
    }

    // Méthodes métier
    public void afficherDetails() {
        System.out.println("--------------------------");
        super.afficherDetails();
        System.out.println("Matière : " + matiere);
        System.out.println("Email   : " + email);
        System.out.println("--------------------------");
    }

    // Getters
    public String getMatiere() { return matiere; }
    public String getEmail() { return email; }

    // Setters
    public void setMatiere(String matiere) { this.matiere = matiere; }
    public void setEmail(String email) { this.email = email; }
}
