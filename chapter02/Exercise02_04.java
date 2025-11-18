/**
 * @Author Weiquan Mai
 * Problem 2.4
 * (Convert square meter into ping)
 * Write a program that converts square meter into ping
 * The program prompts the user to enter a number in square meter,
 * converts it to ping, and displays the result.
 */

import java.util.Scanner;

public class Exercise02_04 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        // Convert square meter to ping
        double ping = squareMeters * 0.3025;

        // Display result
        System.out.println(squareMeters + " square meters is " + ping + " pings");

        // Close scanner
        input.close();
    }
}
