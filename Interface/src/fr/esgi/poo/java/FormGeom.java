package fr.esgi.poo.java;

public class FormGeom {

    public static void main(String[ ] args){
        Object[] myArray = new Object[10];
        Square square1 = new Square(5);
        Square square2 = new Square(4);

        Rectangle rectangle1 = new Rectangle(4,1);
        Rectangle rectangle2 = new Rectangle(3,6);
        Rectangle rectangle3 = new Rectangle(5,9);

        Circle circle1 = new Circle(3);

        myArray[0] = square1;
        myArray[1] = square2;

        myArray[2] = rectangle1;
        myArray[3] = rectangle2;
        myArray[4] = rectangle3;

        myArray[5] = circle1;

        System.out.println(rectangle1.computeArea());
        System.out.println(rectangle2.computeArea());
        System.out.println(rectangle3.computeArea());
        System.out.println(square1.computeArea());
        System.out.println(square2.computeArea());
        System.out.println(circle1.computeArea());

    }
}
