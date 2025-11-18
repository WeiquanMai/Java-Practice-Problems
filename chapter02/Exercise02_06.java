/**
 * @Author Weiquan Mai
 * Problem 2.6
 * (Multiply the digits in an integer)
 * Write a program that reads an integer between 0 and 1000
 * and multiplies all the digits in the integer.
 */

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Calculate result
        int hundreds = number / 100;
        int tenths = (number / 10) % 10;
        int ones = number % 10;
        int result = hundreds * tenths * ones;

        // Test
        System.out.println("hundreds: " + hundreds);
        System.out.println("tenths: " + tenths);
        System.out.println("ones: " + ones);
        System.out.println("The multiplication of all digits in " + number + " is " + result);

        // Close scanner
        input.close();
    }
}
