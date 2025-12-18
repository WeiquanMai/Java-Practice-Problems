/**
 * @author Weiquan Mai
 * Problem 6.4
 * (Display an integer reversed)
 * Write a method with the following header to display an integer in reverse order:
 * public static void reverse(int number)
 *
 * For example, reverse(3456) displays 6543.
 * Write a program that prompts the user to enter an itneger then displays its reversal.
 */

import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Call reverse method
        System.out.print("Reverse of " + number + " is ");
        reverse(number);

        // Close Scanner
        input.close();
    }

    /**
     * Displays reverse of the input number
     * @param number Number to be reversed
     */
    public static void reverse(int number){
        while(number != 0){
            int digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
    }
}
