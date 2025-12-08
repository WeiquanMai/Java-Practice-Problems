/**
 * @Author Weiquan Mai
 * Problem 4.26
 * (Financial application: monetary units)
 * Rewrite Listing 2.10, ComputeChange.java,
 * to fix the possible loss of accuracy when converting a float value to an int value.
 * Read the input as a string such as "11.56".
 * Your program should extract the dollar amount before the decimal point,
 * and the cents after the decimal amount using the indexOf and substring methods.
 */

import java.util.Scanner;
public class Exercise04_26 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        // Split amount to before decimal and after decimal
        int decimalIndex = amount.indexOf('.');
        int dollars = Integer.parseInt(amount.substring(0, decimalIndex));
        int cents = Integer.parseInt(amount.substring(decimalIndex + 1));

        // Find number of coins
        int remainingAmount = 0;
        int numberOfQuarters = cents / 25;
        remainingAmount = cents % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        // Display result with singular word for singular units, and plural words for multiple units
        System.out.println("Your amount " + amount + " consists of");
        System.out.println((dollars  > 1) ? dollars + " dollars" : dollars + " dollar");
        System.out.println((numberOfQuarters > 1) ? numberOfQuarters + " quarters" : numberOfQuarters + " quarter");
        System.out.println((numberOfDimes > 1) ? numberOfDimes + " dimes" : numberOfDimes + " dime");
        // System won't display nickels because more than one nickel would be a dime
        System.out.println(numberOfNickels + " nickel");
        System.out.println((numberOfPennies > 1) ? numberOfPennies + " pennies" : numberOfPennies + " penny");

        // Close scanner
        input.close();
    }
}
