/**
 * @author Weiquan Mai
 * Problem 5.31
 * (Financial application: compute CD value)
 * Suppose you put $10,000 into a CD with an annual percentage yield of 6.15%.
 * After one month, the CD is worth
 *      10000 + 10000 * 6.15 / 1200 = 10051.25
 *
 * After two months, the CD is worth
 *      10051.25 + 10051.25 * 6.15 / 1200 = 10102.76
 *
 * After three months, the CD is worth
 *      10102.76 + 10102.76 * 6.15 / 1200 = 10154.53
 * and so on.
 *
 * Write a program that prompts the user to enter an amount (e.g., 10000),
 * the annual percentage yield (e.g., 6.15), and the number of months (e.g., 18)
 * and displays a table as shown in the sample run.
 */

import java.util.Scanner;
public class Exercise05_31 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for deposit amount, annual percentage yield, and maturity period
        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        // Input validation
        while(depositAmount < 0){
            System.out.print("Invalid input! Please enter a positive deposit amount: ");
            depositAmount = input.nextDouble();
        }
        while(numberOfMonths < 0){
            System.out.print("Invalid input! Please enter a positive maturity period: ");
            numberOfMonths = input.nextInt();
        }

        // Calculate initial CD value
        double cdValue = 0;

        // Iterate from month 1 to number of months
        System.out.println("Month   CD Value");
        for(int i = 1; i <= numberOfMonths; i++){
            // Calculate and display CD Value
            cdValue = depositAmount + (depositAmount * (annualPercentageYield / 1200));
            System.out.printf("%-7d $%.2f\n", i, cdValue);
            depositAmount = cdValue;
        }

        // Close Scanner
        input.close();
    }
}
