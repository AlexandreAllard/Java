package fr.esgi.poo.java;

public class Point {
    private Integer posX;
    private Integer posY;
    private Integer posZ;
    private static final int MIN = 0;
    private static final int MAX = 5;

    public Point() {
        posX=10;
        posY=2;
        posZ=3;
    }


    public Point(int x, int y, int z){
        posX=check(x);
        posX=check(y);
        posX=check(z);
    }

    public Point(int value){
        posX=check(value);
        posY=check(value);
        posZ=check(value);
    }

    public Point(int value, int value2){
        posX = value2;
        posY = value;
        posZ = 0;

        this(a,b,0)
    }


    public static void main(String[] args){
        String Message = "Hello World!";
        System.out.println(Message);
    }

    private int check(int value){
        if (value>=MIN && value<=MAX){
            return value;
        }else {
            return MIN;
        }
    }
}
