/**
 * @Author Weiquan Mai
 * Problem 4.23
 * (Financial application: payroll)
 * Write a program that reads the following information and prints a payroll statement:
 * Employee's name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate(e.g., 9.75)
 * Federal tax withholding rate(e.g., 20%)
 * State tax withholding rate(e.g., 9%)
 */

import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input payroll information
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        // Calculate gross pay, deductions, and net pay
        double grossPay = hoursWorked * hourlyPayRate;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        // Display results
        System.out.println();
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Pay rate: $%.2f\n", hourlyPayRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", federalTaxRate * 100, federalWithholding);
        System.out.printf("\tState Withholding(%.2f%%): $%.2f\n", stateTaxRate * 100, stateWithholding);
        System.out.printf("\tTotal Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f", netPay);

        // Close Scanner
        input.close();
    }
}
