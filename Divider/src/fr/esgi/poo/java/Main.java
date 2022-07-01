package fr.esgi.poo.java;

public class Main {
    public static void main (String[] args){
        Divider divider1 = new Divider(4,2);
        Divider divider2 = new Divider(1,6);
        Divider divider3 = new Divider(9,0);

        System.out.println(divider1.divide());
        System.out.println(divider2.divide());
        System.out.println(divider3.divide());

    }
}
