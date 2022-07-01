package fr.esgi.poo.java;

public class PositiveNumber {
    public int value;

    public void setValue(int v) throws NotPositiveNumberException {
        if (v > -1) {
            value = v;
            System.out.println(value + " is a positive value");
        }else{
            throw new NotPositiveNumberException("Message d'erreur personnalisé");
        }
    }


}
