/**
 * @Author Weiquan Mai
 * Problem 2.10
 * (Science: calculating energy)
 * Write a program that calcualtes the energy needed to heat water
 * from an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water in kilograms
 * and the initial and final temperatures of water.
 */

import java.util.Scanner;

public class Exercise02_10{
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterWeight = input.nextDouble();
        System.out.print("Enter the initial temperature of water in Celsius: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature of water in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy needed
        double energyNeeded = waterWeight * (finalTemperature - initialTemperature) * 4184;

        // Display result
        System.out.print("The energy needed is " + energyNeeded);

        // Close scanner
        input.close();
    }
}
