/**
 * @author Weiquan Mai
 * Problem 5.21
 * (Financial application: compare loans with various interest rates)
 * Write a program that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from 5% to 10%,
 * with an increment of 1/4.
 */

import java.util.Scanner;

public class Exercise05_21 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for loan amount and number of years
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        // Input Validation
        while(loanAmount < 0){
            System.out.print("Invalid loan amount. Please enter an amount greater than 0: ");
            loanAmount = input.nextDouble();
        }
        while(numberOfYears < 0){
            System.out.println("Invalid number of years. Please enter an amount greater than 0: ");
            numberOfYears = input.nextInt();
        }

        // Variables
        int numberOfPayments = numberOfYears * 12;

        // Header
        System.out.println("Interest Rate   Monthly Payment   Total Payment");

        // Iterate from 5% to 10% in increments of 1/4
        for(double i = 5.0; i <= 10.0; i += 0.25){
            // Calculate Monthly Payment and Total Payment
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfPayments;

            // Display output
            System.out.printf("%-5.3f%% %9s %-18.2f %-13.2f\n", i, "",monthlyPayment, totalPayment);
        }

        // Close Scanner
        input.close();
    }
}
