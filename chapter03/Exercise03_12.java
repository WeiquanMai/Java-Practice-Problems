/**
 * @Author Weiquan Mai
 * Problem 3.12
 * (Palindrome integer)
 * Write a program that prompts the user to enter a three-digit integer
 * and determines whether it is a palindrome integer.
 * An integer is palindrome if it reads the same from right to left
 * and from left to right.
 * A negative integer is treated the same as a positive integer.
 */

import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for three-digit integer
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        // Determine if integer is palindrome
        int hundredthsPlace = (int) number / 100;
        int onesPlace = number % 10;
        boolean isPalindrome = hundredthsPlace == onesPlace;

        // Display result
        if(isPalindrome){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }

        // Close scanner
        input.close();
    }
}
