package com.lycee360.models;

public class Eleve extends Personne {

    // Champs privés
    private String classe;
    private String statut; // present, absent, exclu

    // Constructeur vide
    public Eleve() {}

    // Constructeur complet
    public Eleve(int id, String nom, String prenom, int age, String classe, String statut) {
        super(id, nom, prenom, age);
        this.classe = classe;
        this.statut = statut;
    }

    // Méthodes métier
    public void modifierStatut(String nouveauStatut) {
        this.statut = nouveauStatut;
        System.out.println("Statut de " + getNom() + " modifié : " + nouveauStatut);
    }

    public void afficherDetails() {
        System.out.println("---------------------------");
        super.afficherDetails();
        System.out.println("Classe : " + classe);
        System.out.println("Statut : " + statut);
        System.out.println("---------------------------");
    }

    // Getters
    public String getClasse() { return classe; }
    public String getStatut() { return statut; }

    // Setters
    public void setClasse(String classe) { this.classe = classe; }
    public void setStatut(String statut) { this.statut = statut; }
}