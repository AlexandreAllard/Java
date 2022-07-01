package fr.esgi.poo.java;

public class Switch {

    private Lamp lamp1;
    private Lamp lamp2;

    public Switch(Lamp lamp1, Lamp lamp2){
        this.lamp1 = lamp1;
        this.lamp2 = lamp2;
    }

    public void switchOnLamp1(){
        lamp1.switchOn();
    }

    public void switchOnLamp2(int level){
        lamp2.switchOn(level);
    }

    public void switchOff() {
        lamp1.switchOff();
        lamp2.switchOff();

    }

    public void switchOn(Lamp lamp, int level) {
        lamp.switchOn(level);
    }

}
