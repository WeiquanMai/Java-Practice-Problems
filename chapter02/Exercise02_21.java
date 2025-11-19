/**
 * @Author Weiquan Mai
 * Problem 2.21
 * (Financial application: calculate future investment value)
 * Write a program that reads in investment amount, annual interest rate, and number of years
 * and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount X (1 + monthlyInterestRate)^ numberOfYears * 12
 *
 */

import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage (e.g., 3 for 3%): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // Calculate future value
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), (years * 12)));

        // Display future investment value
        System.out.printf("Future value is $%.2f", futureInvestmentValue);

        // Close scanner
        input.close();
    }
}
