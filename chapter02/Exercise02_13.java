/**
 * @Author Weiquan Mai
 * Problem 2.13
 * (Financial application: compound value)
 * Suppose you save $100 each month in a savings account with
 * an annual interest rate of 3.75%.
 * Thus, the monthly interest rate is 0.0375 / 12 = 0.003125.
 * After the first month, the value in the account becomes
 * 100 * (1 + 0.003125) = 100.3125.
 *
 * Write a program that prompts the user to enter a monthly saving amount
 * and displays the account value after the sixth month.
 */

import java.util.Scanner;
public class Exercise02_13 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        // Calculate remaining monthly amounts
        double firstMonth = monthlySaving * (1 + 0.003125);
        double secondMonth = (monthlySaving + firstMonth) * (1 + 0.003125);
        double thirdMonth = (monthlySaving + secondMonth) * (1 + 0.003125);
        double fourthMonth = (monthlySaving + thirdMonth) * (1 + 0.003125);
        double fifthMonth = (monthlySaving + fourthMonth) * (1 + 0.003125);
        double sixthMonth = (monthlySaving + fifthMonth) * (1 + 0.003125);

        // Display result
        System.out.println("After the first month, the account value is "+ firstMonth);
        System.out.println("After the second month, the account value is "+ secondMonth);
        System.out.println("After the third month, the account value is "+ thirdMonth);
        System.out.println("After the fourth month, the account value is "+ fourthMonth);
        System.out.println("After the fifth month, the account value is "+ fifthMonth);
        System.out.println("After the sixth month, the account value is "+ sixthMonth);

        // Close scanner
        input.close();
    }
}
