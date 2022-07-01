package fr.esgi.poo.java;

public class Rectangle {
    public int largeur;
    public int longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int Area() {
        return largeur*longueur;
    }

    public int Perimeter() {
        return (largeur*2)+(longueur*2);
    }
}
