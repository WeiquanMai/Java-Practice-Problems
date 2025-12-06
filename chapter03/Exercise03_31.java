/**
 * @Author Weiquan Mai
 * Problem 3.31
 * (Financials: currency exchange)
 * Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB
 * and 1 to convert from Chinese RMB to U.S. dollars.
 * Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 */

import java.util.Scanner;

public class Exercise03_31 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for exchange rate
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double conversionRate = input.nextDouble();

        // Ask user to select choice to convert from USD to RMB or RMB to USD
        System.out.print("Enter 0 to convert dollars to RMB and 1 to convert RMB to dollars: ");
        int choice = input.nextInt();

        switch(choice){
            // Converting dollar to RMB
            case 0:
                // Ask for amount
                System.out.print("Enter the dollar amount: ");
                double dollarAmount = input.nextDouble();

                // Calculate Conversion
                double yuanAmount = dollarAmount * conversionRate;

                // Display Result
                System.out.printf("$%.2f is %.2f yuan", dollarAmount, yuanAmount);
                break;

            // Converting RMB to dollar
            case 1:
                // Ask for amount
                System.out.print("Enter the RMB amount: ");
                yuanAmount = input.nextDouble();

                // Calculate Conversion
                dollarAmount = yuanAmount / conversionRate;

                // Display result
                System.out.printf("%.2f yuan is $%.2f", yuanAmount, dollarAmount);
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
        // Close Scanner
        input.close();
    }
}
