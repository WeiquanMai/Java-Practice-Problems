/**
 * @Author Weiquan Mai
 * Problem 2.5
 * (Financial application: calculate tips)
 * Write a program that reads the subtotal and the gratuity rate,
 * and then computes the gratuity and the total.
 */

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter subtotal amount: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter gratuity rate: ");
        double gratuity = input.nextDouble();

        // Calculate gratuity and total
        double tip = subtotal * (gratuity / 100);
        double total = subtotal + tip;

        // Display result
        System.out.printf("The gratuity is $%.2f and total is $%.2f", tip, total);

        // Close scanner
        input.close();
    }
}
