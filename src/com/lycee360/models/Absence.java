package com.lycee360.models;

public class Absence {

    // Champs privés
    private int id;
    private Eleve eleve;
    private String date;
    private boolean justifiee;
    private String motif;

    // Constructeur vide
    public Absence() {}

    // Constructeur complet
    public Absence(int id, Eleve eleve, String date, boolean justifiee, String motif) {
        this.id = id;
        this.eleve = eleve;
        this.date = date;
        this.justifiee = justifiee;
        this.motif = motif;
    }

    // Méthodes métier
    public void enregistrer() {
        System.out.println("Absence enregistrée !");
        System.out.println("Élève  : " + eleve.getNom() + " " + eleve.getPrenom());
        System.out.println("Date   : " + date);
        System.out.println("Motif  : " + motif);
        if (justifiee) {
            System.out.println("Statut : Justifiée ✅");
        } else {
            System.out.println("Statut : Non justifiée ❌");
            eleve.modifierStatut("absent");
        }
    }

    public void afficherDetails() {
        System.out.println("---------------------------");
        System.out.println("ID Absence : " + id);
        System.out.println("Élève      : " + eleve.getNom() + " " + eleve.getPrenom());
        System.out.println("Date       : " + date);
        System.out.println("Justifiée  : " + (justifiee ? "Oui" : "Non"));
        System.out.println("Motif      : " + motif);
        System.out.println("---------------------------");
    }

    // Getters
    public int getId() { return id; }
    public Eleve getEleve() { return eleve; }
    public String getDate() { return date; }
    public boolean isJustifiee() { return justifiee; }
    public String getMotif() { return motif; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setEleve(Eleve eleve) { this.eleve = eleve; }
    public void setDate(String date) { this.date = date; }
    public void setJustifiee(boolean justifiee) { this.justifiee = justifiee; }
    public void setMotif(String motif) { this.motif = motif; }
}