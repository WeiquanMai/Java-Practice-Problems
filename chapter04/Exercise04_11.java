/**
 * @Author Weiquan Mai
 * Problem 4.11
 * (Binary to decimal)
 * Write a program that prompts the user to enter binary digits
 * and displays its corresponding decimal value.
 */

import java.util.Scanner;
public class Exercise04_11 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter binary digits
        System.out.print("Enter binary digits (0000 to 1111): ");
        int i = input.nextInt();

        // Obtain place values for binary digit
        int remaining = 0;
        int thousands = i / 1000;
        remaining = i - (thousands * 1000);
        int hundreds = remaining / 100;
        remaining = remaining - (hundreds * 100);
        int tens = remaining / 10;
        remaining = remaining - (tens * 10);
        int ones = remaining;

        // Convert binary to decimal
        int decimalValue = 0;
        decimalValue = ((int) Math.pow(2, 3) * thousands) + ((int) Math.pow(2 , 2) * hundreds)
                + ((int) Math.pow(2, 1) * tens) + ((int) Math.pow(2, 0) * ones);

        // Display result
        System.out.println("The decimal value is " + decimalValue);

        // Close Scanner
        input.close();
    }
}
