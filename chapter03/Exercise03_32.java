/**
 * @Author Weiquan Mai
 * Problem 3.32
 * (Geometry: point position)
 * Given a directed line from point p0(x0, y0) to p1(x1,y1),
 * you can use the following condition to decide whether a point p2(x2,y2)
 * is on the left of the line, on the right, or on the same line:
 * (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)
 *
 * >0 p2 is on the left side of the line
 * = 0 p2 is on the same line
 * <0 p2 is on the right side of the line
 *
 * Write a program that prompts the user to enter the three points for p0, p1, and p2,
 * And displays whether p2 is on the left of the line from p0 to p1, to the right,
 * or on the same line.
 */

import java.util.Scanner;
public class Exercise03_32 {
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

        // Display Result
        if(crossProduct < 0){
            System.out.println("p2 is on the right side of the line");
        }
        else if (crossProduct == 0){
            System.out.println("p2 is on the same line");
        }
        else{
            System.out.println("p2 is on the left side of the line");
        }

        // Close Scanner
        input.close();
    }
}
