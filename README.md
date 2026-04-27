**Lycee360 🏫**  
**Description**  
Lycee360 est un système de gestion de lycée qui permet  
   
 à l'administration de gérer les élèves, les enseignants,  
   
 les classes et les absences via une interface console. 
 
**Membres de l'équipe**  
| | | | |  
|-|-|-|-|  
| **Membre** | **Rôle** | **Fonctionnalité** | **Branche** |   
| maram   | Dev      | Gestion des élèves | feature/gestion-eleves |   
| amin    | Dev      | Gestion des enseignants | feature/gestion-enseignants |   
| rayen   | Dev      | Gestion classes + Absences | feature/gestion-classes |   
| yassine | PO+Dev+SM| Tableau de bord Admin | feature/admin-dashboard |   
   
**Fonctionnalités**  
- Gestion des élèves (ajout, affichage, statut)  
- Gestion des enseignants (ajout, recherche)  
- Gestion des classes (création, affectation)  
- Gestion des absences (enregistrement, affichage)  
- Tableau de bord Admin (statistiques)  

**Acteurs**  
- Visiteur  
- Eleve  
- Enseignant  
- Admin  

**Lien Figma**  
https://www.figma.com/site/mB1EZGzlbgVWp2FXzdeS4L/Lycee360?node-id=0-1&t=HsxvUFADK95sW1AY-1


**Comment exécuter**  
cd src  
 javac -encoding UTF-8 com/lycee360/models/*.java  
 java com.lycee360.models.Main  