/*
    Problem 13.5
    Problem 13.5 utilizes the GeometricObject class, Circle class, and Rectangle class which are defined in separate files: GeometricObject.java, Circle.java, and Rectangle.java

    Modify the GeometricObject class to implement the Comparable interface,
    and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects.

    Write a test program that uses the max method to find the larger of two circles, the larger of two rectangles.
 */

public class Exercise13_05 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(1,1);
        Rectangle r2 = new Rectangle(2,2);

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);

        System.out.println(GeometricObject.max(r1,r2));
        System.out.println(GeometricObject.max(c1,c2));
    }
}
