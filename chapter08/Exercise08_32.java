/**
 * @author Weiquan Mai
 * Problem 8.32
 * (Geometry: area of a triangle)
 * Write a method that returns the area of a triangle using the following header:
 * public static double getTriangleArea(double[][] points)
 *
 * The points are stored in a 3-by-2 two-diimensional array points
 * with points[0][0] and points[0][1] for (x1, y1).
 * The triangle area can be computed using the formula in Programming Exercise 2.19.
 * The method returns 0 if the three points are on the same line.
 * Write a program that prompts the user to enter three points of a triangle
 * and displays the triangle's area.
 */

import java.util.Scanner;

public class Exercise08_32 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double[][] points = new double[3][2];

        // Prompt user to enter points
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Call getTriangleArea method and display result
        double triangleArea = getTriangleArea(points);

        if(triangleArea == 0){
            System.out.println("The three points are on the same line");
        }
        else{
            System.out.printf("The area of the triangle is %.2f", triangleArea);
        }

        // Close Scanner
        input.close();
    }

    public static double getTriangleArea(double[][] points){
        // Obtain the sides
        double side1 = Math.pow(((Math.pow((points[1][0] - points[0][0]), 2))
                + (Math.pow((points[1][1] - points[0][1]), 2))), 0.5);
        double side2 = Math.pow(((Math.pow((points[2][0] - points[1][0]), 2))
                + (Math.pow((points[2][1] - points[1][1]), 2))), 0.5);
        double side3 = Math.pow(((Math.pow((points[2][0] - points[0][0]), 2))
                + (Math.pow((points[2][1] - points[0][1]), 2))), 0.5);
        double s = (side1 + side2 + side3) / 2;

        // Calculate and return area
        return Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
    }
}
