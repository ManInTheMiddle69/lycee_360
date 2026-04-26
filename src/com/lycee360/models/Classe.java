package com.lycee360.models;

import java.util.ArrayList;

public class Classe {

    // Champs privés
    private int id;
    private String nom;
    private String niveau;
    private ArrayList<Eleve> eleves;
    private Enseignant enseignant;

    // Constructeur vide
    public Classe() {
        this.eleves = new ArrayList<>();
    }

    // Constructeur complet
    public Classe(int id, String nom, String niveau) {
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
        this.eleves = new ArrayList<>();
    }

    // Méthodes métier
    public void ajouterEleve(Eleve eleve) {
        eleves.add(eleve);
        System.out.println("Élève " + eleve.getNom() + " ajouté à la classe " + nom);
    }

    public void afficherEleves() {
        System.out.println("\n=== Élèves de la classe " + nom + " ===");
        if (eleves.isEmpty()) {
            System.out.println("Aucun élève dans cette classe");
        } else {
            for (Eleve e : eleves) {
                e.afficherDetails();
            }
        }
    }

    public void afficherDetails() {
        System.out.println("---------------------------");
        System.out.println("ID      : " + id);
        System.out.println("Nom     : " + nom);
        System.out.println("Niveau  : " + niveau);
        System.out.println("Élèves  : " + eleves.size());
        if (enseignant != null) {
            System.out.println("Enseignant : " + enseignant.getNom());
        }
        System.out.println("---------------------------");
    }

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getNiveau() { return niveau; }
    public ArrayList<Eleve> getEleves() { return eleves; }
    public Enseignant getEnseignant() { return enseignant; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setNiveau(String niveau) { this.niveau = niveau; }
    public void setEnseignant(Enseignant enseignant) { this.enseignant = enseignant; }
}