/**
 * @Author Weiquan Mai
 * Problem 3.9
 * (Business: check ISBN-10)
 * An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 * The last digit, d10, is a checksum, which is calculated from the other 9 digits using the following formula:
 * (d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
 *
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 * Write a program that prompts the user to enter the first 9 digits
 * and displays the 10-digit ISBN (including leading zeros).
 * Your program should read the input as an integer.
 */

import java.util.Scanner;
public class Exercise03_09 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter first 9 digit of ISBN
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        // Extract 9 digits from isbn
        int remaining = isbn;
        int d1 = (int) (remaining / 1E8);
        remaining = (int) (remaining % 1E8);
        int d2 = (int) (remaining / 1E7);
        remaining = (int) (remaining % 1E7);
        int d3 = (int) (remaining / 1E6);
        remaining = (int) (remaining % 1E6);
        int d4 = (int) (remaining / 1E5);
        remaining = (int) (remaining % 1E5);
        int d5 = (int) (remaining / 1E4);
        remaining = (int) (remaining % 1E4);
        int d6 = (int) (remaining / 1E3);
        remaining = (int) (remaining % 1E3);
        int d7 = (int) (remaining / 1E2);
        remaining = (int) (remaining % 1E2);
        int d8 = (int) (remaining / 1E1);
        remaining = (int) (remaining % 1E1);
        int d9 = remaining;

        // Calculate d10
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                    + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // Display result
        if(d10 == 10){
            System.out.println("The ISBN-10 number is " + isbn + "X");
        }
        else{
            System.out.println("The ISBN-10 number is " + isbn + d10);
        }

        // Close Scanner
        input.close();
    }
}
