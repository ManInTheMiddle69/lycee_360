package com.lycee360.models;

public class Personne {

    // Champs privés
    private int id;
    private String nom;
    private String prenom;
    private int age;

    // Constructeur vide
    public Personne() {}

    // Constructeur complet
    public Personne(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Méthode afficher
    public void afficherDetails() {
        System.out.println("ID     : " + id);
        System.out.println("Nom    : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Age    : " + age + " ans");
    }

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setAge(int age) { this.age = age; }
}