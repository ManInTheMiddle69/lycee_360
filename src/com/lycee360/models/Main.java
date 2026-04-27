package com.lycee360.models;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Admin admin = new Admin(1, "Directeur", "Lycee360", 45);

    public static void main(String[] args) {

        // Données de test
        initialiserDonnees();

        int choix = -1;
        while (choix != 0) {
            afficherMenuPrincipal();
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    menuEleves();
                    break;
                case 2:
                    menuEnseignants();
                    break;
                case 3:
                    menuClasses();
                    break;
                case 4:
                    menuAbsences();
                    break;
                case 5:
                    admin.afficherTableauDeBord();
                    break;
                case 0:
                    System.out.println("\nAu revoir ! 👋");
                    break;
                default:
                    System.out.println("\n❌ Choix invalide !!!");
            }
        }
    }

    // ==========================================
    // DONNEES DE TEST
    // ==========================================
    static void initialiserDonnees() {
        // Élèves
        Eleve e1 = new Eleve(1, "Ben Ali", "Ahmed", 16, "3ème A", "present");
        Eleve e2 = new Eleve(2, "Trabelsi", "Sarra", 17, "3ème A", "present");
        Eleve e3 = new Eleve(3, "Khelifi", "Youssef", 15, "2ème B", "absent");
        admin.ajouterEleve(e1);
        admin.ajouterEleve(e2);
        admin.ajouterEleve(e3);

        // Enseignants
        Enseignant ens1 = new Enseignant(1, "Karray", "Fatma", 40, "Mathématiques", "f.karray@lycee360.tn");
        Enseignant ens2 = new Enseignant(2, "Mansour", "Khalil", 35, "Arabe", "k.mansour@lycee360.tn");
        admin.ajouterEnseignant(ens1);
        admin.ajouterEnseignant(ens2);

        // Classes
        Classe c1 = new Classe(1, "3ème A", "3ème année");
        Classe c2 = new Classe(2, "2ème B", "2ème année");
        c1.ajouterEleve(e1);
        c1.ajouterEleve(e2);
        c2.ajouterEleve(e3);
        c1.setEnseignant(ens1);
        c2.setEnseignant(ens2);
        admin.ajouterClasse(c1);
        admin.ajouterClasse(c2);

        // Absences
        Absence a1 = new Absence(1, e3, "24/04/2026", false, "Sans motif");
        admin.ajouterAbsence(a1);

        System.out.println("\n✅ Données initialisées avec succès !\n");
    }

    // ==========================================
    // MENU PRINCIPAL
    // ==========================================
    static void afficherMenuPrincipal() {
        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║     LYCEE360 — MENU PRINCIPAL    ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║  1. Gestion des Élèves           ║");
        System.out.println("║  2. Gestion des Enseignants      ║");
        System.out.println("║  3. Gestion des Classes          ║");
        System.out.println("║  4. Gestion des Absences         ║");
        System.out.println("║  5. Tableau de bord Admin        ║");
        System.out.println("║  0. Quitter                      ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.print("Votre choix: ");
    }

    // ==========================================
    // MENU ELEVES
    // ==========================================
    static void menuEleves() {
        int choix = -1;
        while (choix != 0) {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║       GESTION DES ÉLÈVES         ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Afficher tous les élèves     ║");
            System.out.println("║  2. Rechercher un élève          ║");
            System.out.println("║  3. Modifier le statut           ║");
            System.out.println("║  0. Retour                       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    admin.afficherEleves();
                    break;
                case 2:
                    System.out.print("ID de l'élève: ");
                    int id = scanner.nextInt();
                    Eleve e = admin.rechercherEleve(id);
                    if (e != null) e.afficherDetails();
                    break;
                case 3:
                    System.out.print("ID de l'élève : ");
                    int idEleve = scanner.nextInt();
                    System.out.println("Nouveau statut (present / absent / exclu) : ");
                    scanner.nextLine();
                    String statut = scanner.nextLine();
                    admin.modifierStatutEleve(idEleve, statut);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("❌ Choix invalide !!! ");
            }
        }
    }

    // ==========================================
    // MENU ENSEIGNANTS
    // ==========================================
    static void menuEnseignants() {
        int choix = -1;
        while (choix != 0) {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║     GESTION DES ENSEIGNANTS      ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Afficher tous les enseignants║");
            System.out.println("║  2. Rechercher un enseignant     ║");
            System.out.println("║  0. Retour                       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    admin.afficherEnseignants();
                    break;
                case 2:
                    System.out.print("ID de l'enseignant : ");
                    int id = scanner.nextInt();
                    Enseignant ens = admin.rechercherEnseignant(id);
                    if (ens != null) ens.afficherDetails();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("❌ Choix invalide !!! ");
            }
        }
    }

    // ==========================================
    // MENU CLASSES
    // ==========================================
    static void menuClasses() {
        int choix = -1;
        while (choix != 0) {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║       GESTION DES CLASSES        ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Afficher toutes les classes  ║");
            System.out.println("║  0. Retour                       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    admin.afficherClasses();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("❌ Choix invalide!!! ");
            }
        }
    }

    // ==========================================
    // MENU ABSENCES
    // ==========================================
    static void menuAbsences() {
        int choix = -1;
        while (choix != 0) {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║       GESTION DES ABSENCES       ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Afficher toutes les absences ║");
            System.out.println("║  0. Retour                       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Votre choix: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    admin.afficherAbsences();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("❌ Choix invalide!!! ");
            }
        }
    }
}