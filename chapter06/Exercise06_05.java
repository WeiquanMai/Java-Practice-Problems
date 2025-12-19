/**
 * @author Weiquan Mai
 * Problem 6.5
 * (Sort three numbers)
 * Write a method with the following header to display three numbers in decreasing order:
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 *
 * Write a test program that prompts the uer to enter three numbers, and invokes
 * the method to display them in decreasing order.
 */

import java.util.Scanner;

public class Exercise06_05 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Call method
        displaySortedNumbers(num1, num2, num3);

        // Close Scanner
        input.close();
    }

    /**
     * Displays the three numbers input into the method in decreasing order
     * @param num1 First number input into the method
     * @param num2 Second number input into the method
     * @param num3 Third number input into the method
     */
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 < num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 < num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 < num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
