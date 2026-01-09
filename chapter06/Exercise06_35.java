/**
 * @author Weiquan Mai
 * Problem 6.35
 * (Geometry: area of a pentagon)
 * The area of a pentagon can be comptued using the following formula:
 * Area = 5 x s^2 / 4 x tan (PI / 5)
 *
 * Write a method that returns the area of a pentagon using the following header:
 * public static double area (double side)
 *
 * Write a main method that prompts the user to enter the side of a pentagon
 * and display its area.
 */

import java.util.Scanner;

public class Exercise06_35 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter side of pentagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Call method to calculate area and display result
        System.out.println("The area of the pentagon is " + area(side));

        // Close Scanner;
    }

    /**
     * Calculates and returns the area of a pentagon
     * @param side Length of side
     * @return Area of pentagon
     */
    public static double area(double side){
        return (5 * Math.pow(side, 2)) / ( 4 * Math.tan( Math.PI / 5));
    }
}
