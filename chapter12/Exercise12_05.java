/*
    Problem 12.5
    Problem 12.5 utilizes the GeometricObject, Triangle, and IllegalTriangleException classes.
    These classes are defined in separate files under GeometricObject.java, Triangle.java, and IllegalTriangleException.java.

    Programming Exercise 11.1 defined the Triangle class with three sides.
    In a triangle, the sum of any two sides is greater than the third side.
    The Triangle class must adhere to this rule.
    Create the IllegalTriangleException class, and modify the constructor of the Triangle class
    to throw an IllegalTriangleException object if a triangle is created with sides that violate the rule.
 */
import java.util.Scanner;

public class Exercise12_05 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        try{
            // Ask user to enter three sides of the triangle, a color, and a boolean value
            // Then set the triangle equal to these attributes
            System.out.print("Enter the three sides of a triangle: ");
            double s1 = input.nextDouble();
            double s2 = input.nextDouble();
            double s3 = input.nextDouble();
            input.nextLine();
            Triangle triangle = new Triangle(s1,s2,s3);

            System.out.print("Enter a fill color: ");
            String color = input.nextLine();

            System.out.print("Is the triangle filled: ");
            boolean filled = input.nextBoolean();
            triangle.setColor(color);
            triangle.setFilled(filled);

            // Display area, perimeter, color, and true or false to indicate whether it is filled
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());
        }
        catch(IllegalTriangleException ex){
            System.out.println(ex);
        }


        // Close scanner
        input.close();
    }
}
