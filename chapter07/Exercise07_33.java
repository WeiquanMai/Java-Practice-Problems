/**
 * @author Weiquan Mai
 * Problem 7.33
 * (Month name)
 * Write a program that prompts the user to enter an integer between 1 and 12
 * and then displays the name of the month that corresponds to the integer
 * entered by the user.
 * For example, if the user enters three, the program should display march.
 */

import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        String[] month = {"January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December"};

        // Prompt user to enter an integer
        System.out.print("Enter month integer: ");
        int monthInteger = input.nextInt();

        // Display result
        System.out.print(month[monthInteger - 1]);

        // Close Scanner
        input.close();
    }
}
