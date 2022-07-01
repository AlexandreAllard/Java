package fr.esgi.poo.java;

public class MySampleClass {
    public static final double PI = 3.14;
    public Integer myNumber;
    private boolean isOK;

    public MySampleClass(int anIntNumber) {
        /*this.*/myNumber= anIntNumber; // new Integer(anIntNumber)  --> anIntNumber
    }

    public boolean isOK() {  //<--- Getter = récupérer une valeur
        return isOK;
    }

    public void setOK(boolean ok) {  //<--- Setter = attribuer/modifier une valeur
        isOK = ok;
    }

}
