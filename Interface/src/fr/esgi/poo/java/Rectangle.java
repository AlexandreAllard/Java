package fr.esgi.poo.java;

public class Rectangle implements Areable {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int computeArea(){
        return length*width;
    };

}
