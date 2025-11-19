/**
 * @Author Weiquan Mai
 * Problem 2.16
 * (Geometry: area of a hexagon)
 * Write a program that prompts the user to enter the side of a hexagon and displays its area
 */

import java.util.Scanner;

public class Exercise02_16 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for length of side
        System.out.print("Enter length of side of hexagon: ");
        double length = input.nextDouble();

        // Calculate area
        double area = ((3 * Math.pow(3, 0.5)) / 2) * (Math.pow(length, 2));

        // Display area
        System.out.println("The area of the hexagon is " + area);

        // Close scanner
        input.close();
    }
}
