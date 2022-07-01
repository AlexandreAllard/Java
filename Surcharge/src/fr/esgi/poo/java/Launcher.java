package fr.esgi.poo.java;

public class Launcher {
    public static void main (String[] args){
        Ambiguous calcul1 = new Ambiguous();

        System.out.println(calcul1.calculate((long)10, 2));
        System.out.println(calcul1.calculate(1, (long)2));

    }
}

