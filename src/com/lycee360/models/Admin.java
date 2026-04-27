package com.lycee360.models;

import java.util.ArrayList;

public class Admin extends Personne {

    // Champs privés
    private ArrayList<Eleve> eleves;
    private ArrayList<Enseignant> enseignants;
    private ArrayList<Classe> classes;
    private ArrayList<Absence> absences;

    // Constructeur
    public Admin(int id, String nom, String prenom, int age) {
        super(id, nom, prenom, age);
        this.eleves = new ArrayList<>();
        this.enseignants = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.absences = new ArrayList<>();
    }

    // ==========================================
    // GESTION DES ELEVES
    // ==========================================
    public void ajouterEleve(Eleve eleve) {
        eleves.add(eleve);
        System.out.println("✅ Élève ajouté : " + eleve.getNom() + " " + eleve.getPrenom());
    }

    public void afficherEleves() {
        System.out.println("\n=== LISTE DES ÉLÈVES ===");
        if (eleves.isEmpty()) {
            System.out.println("Aucun élève enregistré");
        } else {
            for (Eleve e : eleves) {
                e.afficherDetails();
            }
        }
    }

    public Eleve rechercherEleve(int id) {
        for (Eleve e : eleves) {
            if (e.getId() == id) {
                return e;
            }
        }
        System.out.println("❌ Élève introuvable !");
        return null;
    }

    public void modifierStatutEleve(int id, String statut) {
        Eleve e = rechercherEleve(id);
        if (e != null) {
            e.modifierStatut(statut);
        }
    }

    // ==========================================
    // GESTION DES ENSEIGNANTS
    // ==========================================
    public void ajouterEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant);
        System.out.println("✅ Enseignant ajouté : " + enseignant.getNom() + " " + enseignant.getPrenom());
    }

    public void afficherEnseignants() {
        System.out.println("\n=== LISTE DES ENSEIGNANTS ===");
        if (enseignants.isEmpty()) {
            System.out.println("Aucun enseignant enregistré");
        } else {
            for (Enseignant ens : enseignants) {
                ens.afficherDetails();
            }
        }
    }

    public Enseignant rechercherEnseignant(int id) {
        for (Enseignant ens : enseignants) {
            if (ens.getId() == id) {
                return ens;
            }
        }
        System.out.println("❌ Enseignant introuvable !");
        return null;
    }

    // ==========================================
    // GESTION DES CLASSES
    // ==========================================
    public void ajouterClasse(Classe classe) {
        classes.add(classe);
        System.out.println("✅ Classe ajoutée : " + classe.getNom());
    }

    public void afficherClasses() {
        System.out.println("\n=== LISTE DES CLASSES ===");
        if (classes.isEmpty()) {
            System.out.println("Aucune classe enregistrée");
        } else {
            for (Classe c : classes) {
                c.afficherDetails();
            }
        }
    }

    // ==========================================
    // GESTION DES ABSENCES
    // ==========================================
    public void ajouterAbsence(Absence absence) {
        absences.add(absence);
        absence.enregistrer();
    }

    public void afficherAbsences() {
        System.out.println("\n=== LISTE DES ABSENCES ===");
        if (absences.isEmpty()) {
            System.out.println("Aucune absence enregistrée");
        } else {
            for (Absence a : absences) {
                a.afficherDetails();
            }
        }
    }

    // ==========================================
    // TABLEAU DE BORD
    // ==========================================
    public void afficherTableauDeBord() {
        int nbPresents = 0;
        int nbAbsents = 0;
        int nbExclus = 0;

        for (Eleve e : eleves) {
            if (e.getStatut().equals("present")) nbPresents++;
            else if (e.getStatut().equals("absent")) nbAbsents++;
            else if (e.getStatut().equals("exclu")) nbExclus++;
        }

        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║       TABLEAU DE BORD ADMIN      ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║  Élèves inscrits  :  " + eleves.size() + "           ║");
        System.out.println("║  Enseignants      :  " + enseignants.size() + "           ║");
        System.out.println("║  Classes          :  " + classes.size() + "           ║");
        System.out.println("║  Absences totales :  " + absences.size() + "           ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║  Présents  :  " + nbPresents + "                  ║");
        System.out.println("║  Absents   :  " + nbAbsents + "                  ║");
        System.out.println("║  Exclus    :  " + nbExclus + "                  ║");
        System.out.println("╚══════════════════════════════════╝");
    }

    // Getters
    public ArrayList<Eleve> getEleves() { return eleves; }
    public ArrayList<Enseignant> getEnseignants() { return enseignants; }
    public ArrayList<Classe> getClasses() { return classes; }
    public ArrayList<Absence> getAbsences() { return absences; }
}