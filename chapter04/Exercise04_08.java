/**
 * @Author Weiquan Mai
 * Problem 4.8
 * (Finding the character of an ASCII code)
 * Write a program that receives a character
 * and displays its ASCII code (an integer between 0 and 127)
 */

import java.util.Scanner;
public class Exercise04_08 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Convert character to integer
        int i = (int) ch;

        // Display result
        System.out.println("The ASCII code for character " + ch + " is " + i);

        // Close Scanner
        input.close();
    }
}
