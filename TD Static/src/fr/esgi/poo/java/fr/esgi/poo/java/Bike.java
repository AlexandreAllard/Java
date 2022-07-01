package fr.esgi.poo.java.fr.esgi.poo.java;

public class Bike {
    public static int defaultWheelCount = 2;
    public int wheelCount;
    private String label;

    public String Bike(String label){
        label = "france";
        this.label = label;
    }

    public void display(){
        System.out.print(
                "defaultWheelCount =" + defaultWheelCount
                + "WheelCount =" + wheelCount
                + "Label =" + label);
    }

}
