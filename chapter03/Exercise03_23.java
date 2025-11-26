/**
 * @Author Weiquan Mai
 * Problem 3.23
 * (Geometry: point in a rectangle?)
 * Write a program that prompts the user to enter a point (x, y) and checks whether the point
 * is within the rectangle centered at (1, 1) with width 10 and height 5.
 */

import java.util.Scanner;

public class Exercise03_23 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Determine if coordinates are within rectangle
        double RECTANGLE_WIDTH = 10.0;
        double RECTANGLE_HEIGHT = 10.0;
        boolean withinWidth = Math.abs(x) <= (RECTANGLE_WIDTH / 2);
        boolean withinHeight = Math.abs(y) <= (RECTANGLE_HEIGHT / 2);

        // Display result
        if(withinWidth && withinHeight){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        }
        else{
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
        // Close Scanner
        input.close();
    }
}
