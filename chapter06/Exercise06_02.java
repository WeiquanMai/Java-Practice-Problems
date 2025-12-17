/**
 * @author Weiquan Mai
 * Problem 6.2
 * (Sum the digits in an integer)
 * Write a method that computes the sum of the digits in an integer.
 * Use the following method header:
 * public static int sumDigits(long n)
 *
 * For example, sumDigits(234) returns 9 (= 2 + 3 + 4).
 * (Hint: Use the % operator to extract digits and the / operator to remove the extracted digit.
 * For instance, to extract 4 from 234, use 234 % 10 (= 4).
 * To remove 4 from 234, use 234 / 10 = (23).
 * Use a loop to repeatedly extract and remove the digit until all the digits are extracted.
 * Write a test rpogram that prompts the user to enter an integer, then displays the sum of all its digits.
 */

import java.util.Scanner;
public class Exercise06_02 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a digit
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        // call sumDigits method
        long result = sumDigits(number);

        // Display result
        System.out.println("Sum of " + number + " is " + result);

        // Close Scanner
        input.close();
    }
    public static int sumDigits(long n){
        // Variables
        long sum = 0;

        // Determine length of number
        String s = Long.toString(n);
        int longLength = s.length();

        // Iterate until length of number to extract digit and calculate sum
        for(int i = 1; i <= longLength; i++){
            long digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        return (int) sum;
    }
}
