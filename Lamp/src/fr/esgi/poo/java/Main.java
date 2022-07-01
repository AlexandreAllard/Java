package fr.esgi.poo.java;

public class Main {

    public static void main(String[] args){
        Lamp lamp1 = new Lamp(6);
        Lamp lamp2 = new Lamp(7);
        Switch switch1 = new Switch(lamp1,lamp2);
    }
}
