package fr.esgi.poo.java;

public class Launcher {
    public static void main (String[] args){
        GranFather granfather = new GranFather();
        GranFather father = new Father();
        GranFather son = new Son();

        son.foo();
        father.foo();
        granfather.foo();

    }
}
