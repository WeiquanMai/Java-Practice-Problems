/**
 * @Author Weiquan Mai
 * Problem 2.19
 * (Geometry: area of a triangle)
 * Write a program that prompts the user to enter three points,
 * (x1, y1), (x2, y2), (x3, y3), of a triangle and then displays its area.
 */

import java.util.Scanner;

public class Exercise02_19 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for three points
        System.out.println("Enter coordinates for three points of a triangle separated by spaces");
        System.out.println("Example: 1.5 2");

        System.out.print("Point (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Point (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Point (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate area
        double side1 = Math.pow(((Math.pow((x2 - x1), 2)) + (Math.pow((y2- y1), 2))), 0.5);
        double side2 = Math.pow(((Math.pow((x3 - x2), 2)) + (Math.pow((y3- y2), 2))), 0.5);
        double side3 = Math.pow(((Math.pow((x3 - x1), 2)) + (Math.pow((y3- y1), 2))), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

        // Display area
        System.out.println("The area of the triangle is " + area);

        // Close scanner
        input.close();
    }
}
