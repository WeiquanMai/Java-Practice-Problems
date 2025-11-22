/**
 * @Author Weiquan Mai
 * Problem 3.7
 * (Financial application: monetary units)
 * Modify Listing 2.10, ComputeChange.java
 * to display the nonzero denominations only, using singular words for single units
 * such as 1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies.
 */

import java.util.Scanner;

public class Exercise03_07 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount * 100);

        // Find number of dollar bills and coins
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        // Display result with singular word for singular units, and plural words for multiple units
        System.out.println("Your amount " + amount + " consists of");
        System.out.println((numberOfOneDollars > 1) ? numberOfOneDollars + " dollars" : numberOfOneDollars + " dollar");
        System.out.println((numberOfQuarters > 1) ? numberOfQuarters + " quarters" : numberOfQuarters + " quarter");
        System.out.println((numberOfDimes > 1) ? numberOfDimes + " dimes" : numberOfDimes + " dime");
        // System won't display nickels because more than one nickel would be a dime
        System.out.println(numberOfNickels + " nickel");
        System.out.println((numberOfPennies > 1) ? numberOfPennies + " pennies" : numberOfPennies + " penny");

        // Close scanner
        input.close();
    }
}
