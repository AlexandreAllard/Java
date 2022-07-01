package fr.esgi.poo.java;

public class Lamp {

    public static final int LEVEL_MIN = 0;
    public static final int LEVEL_MAX = 9;
    private boolean isOn;
    private int level;

    public Lamp(boolean isOn){
        if (isOn == true){
            this.isOn=true;
        } else {
            this.isOn=false;
        }
    }

    public Lamp(int level){
        if (level>LEVEL_MAX || level<LEVEL_MIN){
            level = LEVEL_MIN;
        } else {
            this.level = level;
        }
    }

    public void switchOn(){
            isOn = true;
            level = 5;
    }

    public void switchOn(int level){
            isOn = true;
            this.level = level;
    }

    public void switchOff(){
        isOn = false;
        level = 0;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public int getLevel(){
        return level;
    }
}
