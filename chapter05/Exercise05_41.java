/**
 * @author Weiquan Mai
 * Problem 5.41
 * (Occurence of max numbers)
 * Write a program that reeeads integers, finds the largest of them,
 * and counts its occurrences. Assume the input ends with number 0.
 * Suppose you entered 3 5 2 5 5 5 0;
 * The program finds the largest is 5, and the occurence count for 5 is 4.
 * (Hint: Maintain two variables, max and count. max stores the current max number
 * and countstores its occurrences. Initially, assign the first number ot max and 1 to count.
 * Compare each subsequent number with max. If the number is greater than max, assign it to max
 * and reset count to 1. If the number is equal to max, increment count by 1.)
 */

import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int count = 1;

        // Ask user to input number stream
        System.out.print("Enter numbers: ");
        int number = input.nextInt();
        int max = number;

        number = input.nextInt();

        // Read in input until it encounters 0
        while(number != 0){
            // If input is greater than max, set input as new max
            if(number > max){
                max = number;
                count = 1;
            }
            // If input is equal to max, increment count
            else if(number == max){
                count++;
            }
            number = input.nextInt();
        }

        // Display result
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        // Close Scanner
        input.close();
    }
}
