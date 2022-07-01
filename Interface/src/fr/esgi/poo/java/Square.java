package fr.esgi.poo.java;

public class Square implements Areable {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int computeArea(){
        return length*length;
    };
}
