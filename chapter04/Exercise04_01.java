/**
 * @Author Weiquan Mai
 * Problem 4.1
 * (Geometry: area of a pentagon)
 * Write a program that prompts the user to enter the length
 * from the center of a pentagon to a vertex
 * and computes the area of the pentagon.
 */

import java.util.Scanner;

public class Exercise04_01 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input length
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        // Calculate Area
        double lengthOfSide = (2 * length) * Math.sin(Math.PI / 5);
        double area = (5 * lengthOfSide * lengthOfSide)/(4 * Math.tan(Math.PI / 5));

        // Display result
        System.out.printf("The area of the pentagon is %.2f", area);

        // Close Scanner
        input.close();
    }
}
