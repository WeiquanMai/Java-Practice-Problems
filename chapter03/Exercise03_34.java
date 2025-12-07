/**
 * @Author Weiquan Mai
 * Problem 3.34
 * (Geometry: point on line segment)
 * Exercise 3.32 shows how to test whether a point is on an unbounded line.
 * Revise Exercise 3.32 to test whether a point is on a line segment.
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the line segment from p0 to p1.
 */

import java.util.Scanner;
public class Exercise03_34 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user input for three points
        System.out.println("Enter three points for point0, point1, and point2.");
        System.out.print("Enter x-, y- coordinate for point0: ");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        System.out.print("Enter x-, y- coordinate for point1: ");
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        System.out.print("Enter x-, y- coordinate for point2: ");
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        // Calculate Result
        double crossProduct = ((p1x - p0x) * (p2y - p0y)) - ((p2x - p0x) * (p1y - p0y));
        boolean withinX = (p2x >= Math.min(p0x, p1x)) && (p2x <= Math.max(p0x, p1x));
        boolean withinY = (p2y >= Math.min(p0y, p1y)) && (p2y <= Math.max(p0y, p1y));

        // Display Result
        if(crossProduct == 0 && withinX && withinY){
            System.out.println("(" + p2x + ", " + p2y + ") is on the line segment from ("
                                + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }
        else{
            System.out.println("(" + p2x + ", " + p2y + ") is not on the line segment from ("
                    + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }

        // Close Scanner
        input.close();
    }
}
