/**
 * @Author Weiquan Mai
 * Problem 2.14
 * (Health application: computing BMI)
 * Body Mass Index (BMI) is a measure of health on weight.
 * It can be calculated by taking your weight in kilograms and dividing
 * by the square of your height in meters.
 *
 * Write a program that prompts the user to enter a weight in pounds and height in inches,
 * and displays the BMI.
 */

import java.util.Scanner;
public class Exercise02_14 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input for weight and height
        System.out.print("Enter weight in pounds: ");
        double poundWeight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inchHeight = input.nextDouble();

        // Calculate BMI
        double kilogramWeight = poundWeight * 0.45359237;
        double meterHeight = inchHeight * 0.0254;
        double BMI = kilogramWeight / (Math.pow(meterHeight, 2));

        // Display BMI
        System.out.println("BMI is " + BMI);

        // Close scanner
        input.close();
    }
}
