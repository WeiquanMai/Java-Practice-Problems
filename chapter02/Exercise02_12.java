/**
 * @Author Weiquan Mai
 * Problem 2.12
 * (Physics: finding runway length)
 * Given an airplane's acceleration a and take-off speed v,
 * you can compute the minimum runway length needed for an airplen to take off
 * using the following formula:
 * length = v^2 / 2a
 *
 * Write a program that prompts the user to enter v in meters/second (m/s)
 * and the acceleration ain meters/second squared (m/s^2),
 * then displays the minimum runway length.
 */

import java.util.Scanner;
public class Exercise02_12 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter airplane speed in meters/second: ");
        double speed = input.nextDouble();
        System.out.print("Enter airplane acceleration in meters/second^2: ");
        double acceleration = input.nextDouble();

        // Calculate minimum runway length
        double minimumLength = (Math.pow(speed, 2)) / (2 * acceleration);

        // Display result
        System.out.println("The minimum runway length for this airplane is " + minimumLength);
        // Close scanner
        input.close();
    }
}
