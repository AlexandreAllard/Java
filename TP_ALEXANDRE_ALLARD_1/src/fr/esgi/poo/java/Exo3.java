package fr.esgi.poo.java;

public class Exo3 {
    public static String string;
    int[] tableau = new int[19] = {'a'};

    public Exo3(String string){
        this.string = string;
    }

    // Je parcours la string character par character,
    // je compare chacun de ceux-ci à une consonne,
    // puis je répète le procédé en passant à la consonne suivante...
    public void cptConsonnes(){
    }
        for (int i=0; i<string.length(); i++){
            for (int j=0; j<string.length(); j++){
                 if (string.charAt(j)==tableau[i]){
                     consonne++;
                 }
        }
    }


}



/**
 * SUJET : Compteur de chaque consonne
 *
 * Objectif : Coder une classe qui va permettre de compter le nombre de consonnes (donc différentes de a, e, i, o, u et y) d'une chaine de caractères.
 *
 * A faire :
 * 1. Créer une classe X
 * 2. Définissez un attribut et un constructeur pour définir la chaine de caractères X
 * 3. Codez une méthode qui va renvoyer pour chaque consonne le nombre de consonnes de la chaine de caractères
 *
 * Exemple avec "ceci est une phrase exemple" qui doit renvoyer un tableau où
 * pour le 'b' : tableau[0] = 0
 * pour le 'c' : tableau[1] = 2
 * pour le 'd' : tableau[2] = 0
 * pour le 'f' : tableau[3] = 0
 * pour le 'g' : tableau[4] = 0
 * pour le 'h' : tableau[5] = 1
 * pour le 'j' : tableau[6] = 0
 * pour le 'k' : tableau[7] = 0
 * pour le 'l' : tableau[8] = 1
 * pour le 'm' : tableau[9] = 1
 * pour le 'n' : tableau[10] = 1
 * pour le 'p' : tableau[11] = 2
 * pour le 'q' : tableau[12] = 0
 * pour le 'r' : tableau[13] = 1
 * pour le 's' : tableau[14] = 2
 * pour le 't' : tableau[15] = 1
 * pour le 'v' : tableau[16] = 0
 * pour le 'w' : tableau[17] = 0
 * pour le 'x' : tableau[18] = 1
 * pour le 'z' : tableau[19] = 0
 */