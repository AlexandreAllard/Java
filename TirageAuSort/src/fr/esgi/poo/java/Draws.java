package fr.esgi.poo.java;

public class Draws {
    public int[] tirages = new int[100];
    static final int MAX_TIRAGES = 100;

    public void tirage(){
        for (int i=0; i<MAX_TIRAGES; ++i){
            tirages[i]=tirages.roll();
        }
    }
}
