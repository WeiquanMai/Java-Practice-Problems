/**
 * @Author Weiquan Mai
 * Problem 2.17
 * (Science: wind-chill temperature)
 * How cold is it outside?
 * The temperature alone is not enough to provide the answer.
 * Other factors including wind speed, relative humidity, and sunshine play important roles
 * in determining coldness outside.
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature
 * to measure the coldness using temperature and wind speed.
 *
 * Write a program that prompts the user to enter a temperature between -58F and 41 F
 * and a wind speed greater than or equal to 2, then displays the wind-chill temperature.
 */

import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Calculate wind chill index
        double windChillTemperature = 35.74 + (0.6215 * temperature) - (35.75 * (Math.pow(windSpeed, 0.16)))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        // Display result
        System.out.println("The wind chill index is " + windChillTemperature);

        // Close scanner
        input.close();
    }
}
