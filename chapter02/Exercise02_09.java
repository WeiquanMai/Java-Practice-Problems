/**
 * @Author Weiquan Mai
 * Problem 2.9
 * (Physics: acceleration)
 * Average accleration is defined as the change of velocity divided by the time taken to make the change.
 * Write a program that prompts the user to enter the starting velocity in meters/second,
 * the ending velocity in meters/second,
 * and the time span t in seconds,
 * then displays the average acceleration.
 */

import java.util.Scanner;
public class Exercise02_09 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter v0: ");
        double v0 = input.nextDouble();
        System.out.print("Enter v1: ");
        double v1 = input.nextDouble();
        System.out.print("Enter t: ");
        double t = input.nextDouble();

        // Calculate average acceleration
        double acceleration = (v1 - v0) / t;

        // Display results
        System.out.println("The average acceleration is " + acceleration);

        // Close input
        input.close();
    }
}
