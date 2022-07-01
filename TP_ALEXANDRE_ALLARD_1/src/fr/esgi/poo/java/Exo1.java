package fr.esgi.poo.java;

public class Exo1 {
    private float volumeLitre;
    private float volumeDL, volumeCL, volumeML;

    // Constructeur
    public Exo1(float volumeLitre) {
        this.volumeLitre = volumeLitre;
    }

    // Conversion du volumeL en trois autres volumes
    public void convertTo(){
        volumeML = volumeLitre*1000;
        volumeDL = volumeLitre*100;
        volumeCL = volumeLitre*10;
    }

    // Affichage d'une chaine de charactères concaténée (volume + unité / volume + unité...)
    public void display(){
        System.out.println(volumeLitre + " l = " + volumeDL + " dl = " + volumeCL  + " cl = " + volumeML + " ml");
    }

}

/**
 * SUJET : Conversion d'unités de volume
 *
 * Objectif : Coder une classe qui va permettre de convertir des volumes de liquide
 *
 * A faire :
 * 1. Créer une classe X
 * 2. Définissez un attribut et un constructeur pour définir un volume en litre X
 * 3. Codez une méthode convertTo() en précisant l'unité résultat (dl pour décilitre, cl pour centilitre et ml pour millilitre) pour convertir le volume en litre dans l'unité définie
 * 4. Codez la méthode display() qui va afficher dans la console le volume initial (en litre) et la correspondance dans les 3 autres unités
 *
 * Exemple de ce que l'on doit voir dans la console pour 1.234 litre :
 * 1.234 l = 12.34 dl = 123.4 cl = 1234.0 ml
 */
