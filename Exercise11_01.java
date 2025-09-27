/*
    Problem 11.1
    Program tests the Triangle class, which is defined in a separate file, Triangle.java

    Design a class named Triangle that extends GeometricObject.
    The class contains:
    - Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle
    - A no-arg constructor that creates a default triangle
    - A constructor that creates a triangle with the specified side1, side2, and side3
    - The accessor methods to all three data fields
    - A method named getArea() that returns the area of this triangle
    - A method named getPerimeter() that returns the perimeter of this triangle
    - A method named toString() that returns a string description for this triangle

    Write a test program that prompts the user to enter three sides of the triangle, a color,
    and a boolean value to indicate whether the triangle is filled. The program should create a
    Triangle object with these sides and set the color and filled properties using the input.
    The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */

import java.util.Scanner;

public class Exercise11_01 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter three sides of the triangle, a color, and a boolean value
        System.out.print("Enter the three sides of a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter a fill color: ");
        String color = input.nextLine();

        System.out.print("Is the triangle filled: ");
        boolean filled = input.nextBoolean();

        // Create a Triangle object with these sides, color, and filled properties
        Triangle triangle = new Triangle(s1,s2,s3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display area, perimeter, color, and true or false to indicate whether it is filled
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

        // Close scanner
        input.close();
    }
}
