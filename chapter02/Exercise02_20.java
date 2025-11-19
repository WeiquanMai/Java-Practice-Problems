/**
 * @Author Weiquan Mai
 * Problem 2.20
 * (Financial application: calculate interest)
 * If you know the balance and the annual percentage interest rate,
 * you can compute the interest on the next monthly payment using the following formula:
 *  interest = balance X (annualInterestRate / 1200)
 *
 * Write a program that reads the balance and the annual interest rate
 * and displays the interest for the next month.
 */

import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter current balance in account: ");
        double balance = input.nextDouble();
        System.out.print("Enter interest rate on account (e.g., 3 for 3%) : ");
        double annualInterestRate = input.nextDouble();

        // Calculate next monthly payment
        double monthlyPayment = balance * (annualInterestRate / 1200);

        // Display monthly payment
        System.out.println("Your monthly payment is " + monthlyPayment);

        // Close scanner
        input.close();
    }
}
