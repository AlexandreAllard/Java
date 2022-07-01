package fr.esgi.poo.java;

public class Padovan {

    static int[] padovan;
    public  void fill(int max){
        padovan = new int[max];
        for (int i=0; i<padovan.length; ++i){
            if (i<3){
                padovan[i]=1;
            } else {
                padovan[i] = padovan[i - 2] + padovan[i - 3];
            }
        }
    }

    public void display(){
        for (int i=0; i<padovan.length; ++i){
            System.out.println(padovan[i] );
        }
    }

}
