/**
 * @Author Weiquan Mai
 * Problem 4.5
 * (Geometry: area of a regular polygon)
 * A regular polygon is an n-sided polygon in which all sides are of the same length
 * and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 * The formula for computing the area of a regular polygon is
 * Area = n x s^2 / 4 X tan(PI/ n)
 *
 * Here s is the length of a side.
 *
 * Write a program that prompts the user to enter the number of sides
 * and their length of a regular polygon and displays its area
 */

import java.util.Scanner;
public class Exercise04_05 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for number of sides
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        // Ask for length of side
        System.out.print("Enter length of side: ");
        double s = input.nextDouble();

        // Calculate area
        double area = (n * Math.pow(s , 2)) / ( 4 * Math.tan(Math.PI / n));

        // Display area
        System.out.println("The area of the polygon is " + area);

        // Close Scanner
        input.close();
    }
}
