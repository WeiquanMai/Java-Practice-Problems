/**
 * @author Weiquan Mai
 * Problem 6.7
 * (Financial application: compute the future investment value)
 * Write a method that computes future investment value at a given interest rate
 * for a specified number of years.
 * The future investment is deteremined using the formula in Programming Exercise 2.21.
 *
 * Use the following method header:
 * public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years).
 *
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 *
 * Write a test program that prompts the user to enter the investment amount (e.g., 1,000)
 * and the interest rate (e.g., 9%) and prints a table that displays future value for the years
 * from 1 to 30, as shown.
 */

import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for information
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        // Iterate from 1 to number of years and calculate future investment value
        System.out.printf("%-8s  %12s\n", "Years", "Future Value");
        for(int i = 1; i <= 30; i++){
            System.out.printf("%-8d  %12.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }

        // Close Scanner
        input.close();
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * (Math.pow((1 + monthlyInterestRate), (years * 12)));
    }
}
