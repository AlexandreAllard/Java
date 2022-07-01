package fr.esgi.poo.java;

public class CalcAlphaNum {
    public static int addition(int a, int b){
        return a+b;
    }

    public static int substraction(int a, int b){
        return a-b;
    }

    public static int increment(int a){
        return a+1;
    }

    public static boolean equal(int a, int b){
        if (a==b){
            return true;
        } else {
            return false;
        }
    }

    public static boolean equalString(String a, String b){
        if (a==b){
            return true;
        } else {
            return false;
        }
    }

    public static int maxThreeNumbers(int a, int b, int c){
        if (a>b && a>c){
            return a;
        } else if (b>a && b>c){
            return b;
        } else {
            return c;
        }

    }

}
