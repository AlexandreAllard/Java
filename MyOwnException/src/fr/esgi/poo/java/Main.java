package fr.esgi.poo.java;

public class Main {
    public static void main (String[] args){
        PositiveNumber pn1 = new PositiveNumber();
        PositiveNumber pn2 = new PositiveNumber();
        PositiveNumber pn3 = new PositiveNumber();

        try {
            pn1.setValue(7);
            pn3.setValue(0);
            pn2.setValue(-7);
        }catch(NotPositiveNumberException e){
            System.out.println(e.getMessage());
        }

        /* Pour catch chaque erreur il faut faire un bloc par setValue*/


    }
}
