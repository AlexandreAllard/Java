package fr.esgi.poo.java;

public class GranFather {
    private String className = "GrandFather";

    public int foo(){
        System.out.println(this.getClass().getSimpleName().length());
        return this.getClass().getSimpleName().length();
    }
}
