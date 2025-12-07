/**
 * @Author Weiquan Mai
 * Problem 4.9
 * (Find the Unicode of a character)
 * Write a program that receives a character and displays its Unicode
 */

import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Convert character to Unicode
        int i = (int) ch;

        // Display result
        System.out.println("The Unicode for the character " + ch + " is " + i);

        // Close Scanner
        input.close();
    }
}
