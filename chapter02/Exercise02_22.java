/**
 * @Author Weiquan Mai
 * Problem 2.22
 * (Financial application: monetary units)
 * Rewrite Listing 2.10, ComputeChange.java
 * to fix the possible loss of accuracy when converting a double value to an int value.
 * Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 */

import java.util.Scanner;

public class Exercise02_22 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user for amount
        System.out.print("Enter dollar amount (e.g., 1156 represents 11 dollars and 56 cents): ");
        int amount = input.nextInt();

        // Break up amount into dollars and coins
        int numberOfOneDollars = amount / 100;
        int remainingAmount = amount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of:");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

        // Close scanner
        input.close();
    }
}
