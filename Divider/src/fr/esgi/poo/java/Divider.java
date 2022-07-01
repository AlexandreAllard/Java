package fr.esgi.poo.java;

public class Divider {
    private int dividende;
    private int diviseur;

    public Divider(int i, int i1){
        dividende = i;
        diviseur = i1;
    }

    public int divide(){
        try{
            return dividende/diviseur;
        } catch (ArithmeticException e){ /*"Exception" superclasse de l'arborescence des classess d'expcetion*/
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Je viens ici!");
        }
        return 0;
    }
}
