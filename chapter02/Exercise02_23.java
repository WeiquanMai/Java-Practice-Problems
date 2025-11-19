/**
 * @Author Weiquan Mai
 * Problem 2.23
 * (Cost of driving)
 * Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * then displays the cost of the trip.
 */

import java.util.Scanner;

public class Exercise02_23 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate cost of trip
        double costOfTrip = (distance/ mpg) * pricePerGallon;

        // Display result
        System.out.printf("The cost of driving is $%.2f", costOfTrip);

        // Close scanner
        input.close();
    }
}
