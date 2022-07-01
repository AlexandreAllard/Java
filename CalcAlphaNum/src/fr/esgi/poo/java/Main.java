package fr.esgi.poo.java;

public class Main {

    public static void main(String[] args){
        CalcAlphaNum calculatrice = new CalcAlphaNum();

        System.out.println("Addition de 12 et 9 = " + calculatrice.addition(12,9 ));
        System.out.println("Soustraction de 27 et 5 = " + calculatrice.substraction(27,5 ));
        System.out.println("Incrementation de 4  = " + calculatrice.increment(4 ));
        System.out.println("Égalite entre 19 et -25?  = " + calculatrice.equal(19, -25 ));
        System.out.println("Égalite entre 38 et 38?  = " + calculatrice.equal(38, 38 ));
        System.out.println("Égalite entre Bob et Marie?  = " + calculatrice.equalString( "Bob", "Marie" ));
        System.out.println("Égalite entre Bob et Bob?  = " + calculatrice.equalString( "Bob", "Bob" ));
        System.out.println("Plus grand nombre entre 5 27 et 9  = " + calculatrice.maxThreeNumbers( 5, 27, 9 ));

    }

}
