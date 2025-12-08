/**
 * @Author Weiquan Mai
 * Problem 4.19
 * (Business: check ISBN_10)
 * Rewrite Programming Exercise 3.9 by entering the ISBN number as a string.
 */

import java.util.Scanner;
public class Exercise04_19 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter first 9 digit of ISBN
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String isbn = input.nextLine();

        // Input validation in isbn length
        if(isbn.length() != 9){
            System.out.println("You must enter exactly 9 characters!");
            System.exit(1);
        }

        // Extract 9 digits from isbn
        int d1 = isbn.charAt(0) - '0';
        int d2 = isbn.charAt(1) - '0';
        int d3 = isbn.charAt(2) - '0';
        int d4 = isbn.charAt(3) - '0';
        int d5 = isbn.charAt(4) - '0';
        int d6 = isbn.charAt(5) - '0';
        int d7 = isbn.charAt(6) - '0';
        int d8 = isbn.charAt(7) - '0';
        int d9 = isbn.charAt(8) - '0';

        // Calculate d10
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
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
