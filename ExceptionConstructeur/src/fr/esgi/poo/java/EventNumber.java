package fr.esgi.poo.java;

public class EventNumber {
    private int value;

    public void setValue(int v) throws Exception {

    }

    public EventNumber(int value) throws Exception {
        if (value%2 == 0){
            this.value = value;
        } else {
            throw new Exception();
        }
    }



    public EventNumber(int value, boolean z) throws RuntimeException {
        if (value%2 == 0){
            this.value = value;
        } else {
            throw new RuntimeException();
        }    }

    public int getValue() {
        return value;
    }
}
