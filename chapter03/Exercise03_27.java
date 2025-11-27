/**
 * @Author Weiquan Mai
 * Problem 3.27
 * (Geometry: points in triangle?)
 * Suppose a right triangle is placed in a plane as shown below.
 * The right-angle point is placed at (0, 0),
 * and the other two points are placed at (200, 0), and (0, 100).
 * Write a program that prompts the user to enter a point
 * with x- and y-coordinates and determines whether the point is inside the triangle.
 */

import java.util.Scanner;

public class Exercise03_27 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for user coordinates
        System.out.print("Enter a point's x- and y- coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Determine if coordinates are inside the triangle
        boolean inTriangle = (x <= 200 && y <= (-1.0 / 2) * x + 100);

        // Display result
        if(inTriangle){
            System.out.println("The point is in the triangle");
        }
        else{
            System.out.println("The point is not in the triangle");
        }

        // Close Scanner
        input.close();
    }
}
