package fr.esgi.poo.java;

public class Exo2 {
    int[] array = new int[4];

    // Constructeur
    public Exo2(int int1, int int2, int int3, int int4){
        array[0]= int1;
        array[1]= int2;
        array[2]= int3;
        array[3]= int4;
    }

    // Calcul de la plus petite valeur par comparaison successives
    public int min(){
        int min = array[0];

        if (min>array[1]){
            min = array[1];
        } else if (min>array[2]){
            min = array[2];
        } else if (min>array[3]){
            min = array[3];
        }

        System.out.println(min);
        return min;
    }
}

/**
 * SUJET : Plus petit entier
 *
 * Objectif : Coder une classe qui va permettre de renvoyer le plus petit entier d'un tableau d'entiers
 *
 * A faire :
 * 1. Créer une classe
 * 2. Définissez un attribut et un constructeur pour définir le tableau d'entiers à analyser
 * 3. Codez la méthode min() qui va renvoyer le plus petit entier du tableau
 *
 * Avec {2, 5, 1, 6} min() renvoie 1
 * Avec {2, -5, 1, 6} min() renvoie -5
 */