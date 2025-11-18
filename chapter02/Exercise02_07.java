/**
 * @Author Weiquan Mai
 * Problem 2.7
 * (Find the number of years)
 * Write a program that prompts the user to enter the minutes, and displays the number of years
 * and remaining days for the minutes.
 * For simplicity, assume that a year has 365 days.
 */

import java.util.Scanner;
public class Exercise02_07 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        // Convert minutes to years and days
        int years = (int) minutes / 60 / 24 / 365;
        long remainder = minutes % ( 60 * 24 * 365);
        int days = (int) remainder / 60 / 24;

        // Display result
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");

        // Close scanner
        input.close();
    }
}
