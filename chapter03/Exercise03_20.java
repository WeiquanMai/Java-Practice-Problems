/**
 * @Author Weiquan Mai
 * Problem 3.20
 * (Science: wind-chill temperature)
 * Programming Exercise 2.17 gives a formula to compute the wind-chill temperature.
 * The formula is valid for temperatures in the range between -58F and 41 F, and wind speed greater than or equal to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid;
 * otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid.
 */

import java.util.Scanner;

public class Exercise03_20 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Determine if temperature and wind speed is valid
        boolean validTemperature = temperature > -58 && temperature < 41;
        boolean validWindSpeed = windSpeed >= 2;
        boolean validInput = validTemperature && validWindSpeed;

        // Calculate wind chill index
        double windChillTemperature = 35.74 + (0.6215 * temperature) - (35.75 * (Math.pow(windSpeed, 0.16)))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        // Display result
        if(validInput){
            System.out.println("The wind chill index is " + windChillTemperature);
        }
        else {
            if(!validTemperature){
                System.out.println("Invalid temperature!");
            }
            if(!validWindSpeed){
                System.out.println("Invalid wind speed!");
            }
        }

        // Close scanner
        input.close();
    }
}
