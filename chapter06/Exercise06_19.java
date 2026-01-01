/**
 * @author Weiquan Mai
 * Problem 6.19
 * (Triangles)
 * Implement the following two methods:
 * * Return true if the sum of every two sides is greater than the third side *
 * public static boolean isValid (double side1, double side2, double side3)
 *
 * * Return the area of the triangle. *
 * public static double area (double side1, double side2, double side3)
 *
 * Write a test program that reads the three sides for a triangle
 * and uses the isValid method to test if the input is valid
 * and uses the area method to obtain the area.
 * The program displays the area if the input is valid.
 * Otherwise, it displays that the input is invalid.
 */

import java.util.Scanner;

public class Exercise06_19 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt for three sides
        System.out.print("Enter the length of three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if(isValid(side1,side2,side3)){
            System.out.println("Area of the triangle is: " + area(side1,side2,side3));
        }
        else{
            System.out.println("Input is invalid!");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Tests if the three sides of a triangle are valid
     * @param side1 First side of the triangle
     * @param side2 Second side of the triangle
     * @param side3 Third side of the triangle
     * @return True if the three sides of the triangle are valid, otherwise false
     */
    public static boolean isValid(double side1, double side2, double side3){
        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
            return true;
        }
        return false;
    }

    /**
     * Calculates and returns the area of the triangle
     * @param side1 First side of the triangle
     * @param side2 Second side of the triangle
     * @param side3 Third side of the triangle
     * @return The area of the triangle
     */
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        return area;
    }
}
