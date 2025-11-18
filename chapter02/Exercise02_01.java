/**
 * @Author Weiquan Mai
 * Problem 2.1
 * (Convert mile to kilometer)
 * Write a program that reads a mile in a double value from the console, converts it to kilometers,
 * and displays the result.
 */

import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        // Calculate kilometers
        double kilometers = miles * 1.6;

        // Display results
        System.out.println(miles + " miles is " + kilometers + " kilometers");
        // Close scanner
        input.close();
    }
}
