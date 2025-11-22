/**
 * @Author Weiquan Mai
 * Problem 3.6
 * (Health application: BMI)
 * Revise Listing 3.4, ComputeAndInterpretBMI.java,
 * to let the user enter weight, feet, and inches.
 */

import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt user to enter height in feet and inches
        System.out.println("Enter height in feet and then inches");
        System.out.print("Feet: ");
        double feet = input.nextDouble();
        System.out.print("Inches: ");
        double inches = input.nextDouble();

        // Calculate BMI
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        double heightInInches = (feet * 12) + inches;
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;
        double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));

        // Display result
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if(bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }

        // Close Scanner
        input.close();
    }
}
