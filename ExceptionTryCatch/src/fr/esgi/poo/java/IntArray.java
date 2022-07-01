package fr.esgi.poo.java;

public class IntArray {
    private int MAX_ARRAY_SIZE = 5;
    private int[] values = new int[MAX_ARRAY_SIZE];

    public void IntArray(){
        for (int i=0; i<MAX_ARRAY_SIZE; i++){
           values[i] = i;
        }
    }

    public void Display(){
        for (int i=0; i<MAX_ARRAY_SIZE; i++){
            System.out.println(values[i]);
        }
    }
}
