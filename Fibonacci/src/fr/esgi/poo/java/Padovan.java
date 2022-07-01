package fr.esgi.poo.java;

public class Padovan {

     static int[] padovan = new int[20];
     public  void fill(int max){
         padovan[0]=1;
         padovan[1]=1;
         padovan[2]=1;
         for (int i=2; i<padovan.length; ++i){
             padovan[i] = padovan[i-1]+padovan[i-2];
         }
     }

     public void display(){
         for (int i=2; i<padovan.length; ++i){
            System.out.println(padovan[i] );
         }
     }

}
