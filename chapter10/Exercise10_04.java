/*
    Problem 10.4
    Program tests the MyPoint class, which is defined in a separate file, MyPoint.java

    Design a class named MyPoint to represent a point with x- and y- coordinates.
    The class contains:
        - The data fields x and y that represent the coordinates with getter methods
        - The no-arg constructor that creates a point(0,0);
        - A constructor that constructs a point with specified coordinates
        - A method named distance that returns the distance from this point to a specified point of the MyPoint type
        - A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
        - A static method named distance that returns the distance from two MyPoint objects

        Write a test program that creates two points (0,0) and (10, 30.5) and displays the distance between them
 */
public class Exercise10_04 {
    public static void main(String[] args){
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println(MyPoint.distance(point1,point2));
    }
}
