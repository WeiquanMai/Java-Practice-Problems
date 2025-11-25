/**
 * @Author Weiquan Mai
 * Problem 3.22
 * (Geometry: point in a circle)
 * Write a program that prompts the user to enter a point (x,y)
 * and checks whether the point is within the circle centered at (0,0) with radius 10.
 * For example, (4,5) is inside the circle and (9,9) is outside the circle.
 */

import java.util.Scanner;

public class Exercise03_22 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a point
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Determine if point is inside the circle
        double length = Math.pow(((x * x) + (y * y)) , 0.5);

        // Display result
        System.out.print("Point (" + x + ", " + y + ") ");
        if(length < 10){
            System.out.println("is in the circle");
        }
        else{
            System.out.println("is not in the circle");
        }

        // Close Scanner
        input.close();
    }
}
