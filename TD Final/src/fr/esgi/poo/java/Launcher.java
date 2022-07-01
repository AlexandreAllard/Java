package fr.esgi.poo.java;

public class Launcher {

    public void updateInt(int nombre){
        nombre=2;
    }

    public final void updateIntFinal(int nombre){
        nombre=2;
    }

    public int updateAndReturnInt(int nombre){
        nombre=2;
        return nombre;
    }

    public void updatePercent(int percent){
        percent = 4;
    }
}
