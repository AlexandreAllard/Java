package fr.esgi.poo.java;

public class Launcher {
    public static void main (String[] args){

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(8,7);

        rectangle.Perimeter();
        rectangle.Area();

        square.Perimeter();
        square.Area();
    }
}
