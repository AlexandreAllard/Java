package fr.esgi.poo.java;

public class Ambiguous {

    public int calculate(int a, long b){
        return (int)(10*a+b);
    }

    public int calculate(long a, int b){
         return (int)(1000*a+b);
    }
}
