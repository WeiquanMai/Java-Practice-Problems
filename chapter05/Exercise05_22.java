/**
 * @author Weiquan Mai
 * Problem 5.22
 * (Financial application: loan amoritization schedule)
 * The monthly payment for a given loan pays the principal and the interest.
 * The monthly interesst is computed by multiplying the monthly interest rate and the balance (the remaining principal).
 * The principal paid for the month is therefor the monthly payment minus the monthly interest.
 * Write a program that lets the user enter the loan amount, number of years, and interest rate
 * then displays the amortization schedule for the loan.
 */
import java.util.Scanner;

public class Exercise05_22 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for loan amount, number of years, and annual interest rate
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // Input validation
        while(loanAmount < 0){
            System.out.print("Invalid loan amount. Please enter an amount greater than 0: ");
            loanAmount = input.nextDouble();
        }
        while(numberOfYears < 0){
            System.out.print("Invalid number of years. Please enter an amount greater than 0");
            numberOfYears = input.nextInt();
        }

        // Calculate monthly and total payment
        int numberOfPayments = numberOfYears * 12;
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        double totalPayment = monthlyPayment * numberOfPayments;

        // Display monthly payment and total payment
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Payment: $%.2f\n", totalPayment);

        // Header labels
        System.out.println("Payment#   Interest   Principal   Balance");

        // Loop through number of payments to display amortization schedule
        for(int i = 1; i <= numberOfPayments; i++){
            // Calculate interest, principal, and balance
            double interest = monthlyInterestRate * loanAmount;
            double principal = monthlyPayment - interest;
            loanAmount = loanAmount - principal;

            // Display result
            System.out.printf("%-10d %-10.2f %-11.2f %-7.2f\n", i, interest, principal, loanAmount);
        }

        // Close Scanner
        input.close();
    }
}
