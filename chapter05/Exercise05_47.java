/**
 * @author Weiquan Mai
 * Problem 5.47
 * (Business: check ISBN-13)
 * ISBN-13 is a new standard for identifying books.
 * It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13.
 * The last digit d13 is a chcksum, which is calculated from the other digits
 * using the following formula:
 *
 * 10 - (d1 = 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12) % 10
 *
 * If the checksum is 10, replaec it with 0. Your program should read the input as a string.
 */

import java.util.Scanner;

public class Exercise05_47 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variable
        double accumulator = 0;

        // Prompt user to enter ISBN-13
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn13 = input.nextLine();

        // Iterate through the string to calculate checksum
        int stringLength = isbn13.length();

        // Input validation
        if(stringLength != 12){
            System.out.println(isbn13 + " is an invalid input");
            System.exit(1);
        }

        for(int i = 0; i < stringLength; i++){
            double digit = (double) isbn13.charAt(i) - '0';
            if(i % 2 == 0){
                accumulator += digit;
            }
            else{
                accumulator = accumulator + (3 * digit);
            }
        }

        // Calculate checksum
        double checksum = 10 - (accumulator) % 10;

        // Display result
        System.out.print("The ISBN-13 number is " + isbn13);

        if(checksum == 10){
            System.out.println("0");
        }
        else{
            System.out.printf("%.0f", checksum);
        }

        // Close Scanner
        input.close();
    }
}
