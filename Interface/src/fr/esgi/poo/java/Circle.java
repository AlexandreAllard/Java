package fr.esgi.poo.java;

public class Circle implements Areable{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int computeArea(){
        return radius*2;
    };


}
