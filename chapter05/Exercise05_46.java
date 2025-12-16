/**
 * @author Weiquan Mai
 * Problem 5.46
 * (Reverse a string)
 * Write a program that prompts the user to enter a string
 * and displays the string in reverse order.
 */

import java.util.Scanner;
public class Exercise05_46 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        // Reverse the string
        int stringLength = userString.length();
        for(int i = stringLength - 1; i >= 0; i--){
            System.out.print(userString.charAt(i));
        }

        // Close Scanner
        input.close();
    }
}
