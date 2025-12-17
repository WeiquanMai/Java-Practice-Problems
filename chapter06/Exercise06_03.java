/**
 * @author Weiquan Mai
 * Problem 6.3
 * (Palindrome integer)
 * Write the methods with the following headers:
 *
 * // Return the reversal of an integer, e.g., reverse (456) returns 654
 * public static int reverse (int number)
 *
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 *
 * Use the reverse method to implement isPalindrome.
 * A number is a palindrome if its reversal is the same as itself.
 * Write a test program that prompts the user to enter an integer
 * and reports whether the integer is a palindrome.
 */
import java.util.Scanner;
public class Exercise06_03 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Determine if integer is a palindrome
        boolean isPalindrome = isPalindrome(number);

        // Display result
        if(isPalindrome){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Reverses the number
     * @param number Integer to be reversed
     * @return Reverse of integer
     */
    public static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return reverse;
    }

    /**
     * Determines if number is a palindrome
     * @param number Integer to be determined if it's a palindrome
     * @return True if palindrome, false if not
     */
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

}
