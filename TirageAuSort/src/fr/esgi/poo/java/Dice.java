package fr.esgi.poo.java;

import java.util.Random;

public class Dice {
    public static final int MAX_VALUE = 7;

    public int roll(){
        Random ran = new Random();
        return ran.nextInt(1, MAX_VALUE);
    }
}
