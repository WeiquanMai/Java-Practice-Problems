/**
 * @author Weiquan Mai
 * Problem 5.30
 * (Financial application: compound value)
 * Suppose you save $100 each month in a savings account with annual interest rate 3.75%.
 * The monthly interest rate is 0.0375 / 12 = 0.003125.
 * After the first month, the value in the account becomes
 *          100 * (1 + 0.003125) = 100.3125
 * After the second month, the value in the account becomes
 *          100 + 100.3125) * (1 + 0.003125) = 200.938
 * After the third month, the value in the account becomes
 *          (100 + 200.938) * (1 + 0.003125) = 301.878
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 100),
 * the annual interest rate(e.g., 3.75), and the number of months (e.g., 6)
 * and displays the amount in the savings account after the given month.
 */

import java.util.Scanner;

public class Exercise05_30 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variable
        double accountTotal = 0.0;

        // Prompt user for monthly contribution amount, annual interest rate, and number of months
        System.out.print("Enter monthly contribution amount: ");
        double monthlyContribution = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        // Input validation
        while(monthlyContribution < 0){
            System.out.print("Invalid monthly contribution amount! Please enter a positive number: ");
            monthlyContribution = input.nextDouble();
        }
        while(numberOfMonths < 0){
            System.out.print("Invalid number of months! Please enter a positive number: ");
            numberOfMonths = input.nextInt();
        }

        // Monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Iterate from 1 to number of months
        for(int i = 1; i <= numberOfMonths; i++){

            // Calculate account total
            accountTotal = (accountTotal + monthlyContribution) * (1 + monthlyInterestRate);
        }

        // Display result
        System.out.printf("Account total after %d months is $%.2f", numberOfMonths, accountTotal);

        // Close Scanner
        input.close();
    }
}
