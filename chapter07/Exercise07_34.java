/**
 * @author Weiquan Mai
 * Problem 7.34
 * (Sort characters in a string)
 * Write a method that returns a sorted string using the following header:
 * public static String sort(String s)
 *
 * For example, sort("acb") returns abc.
 * Write a test program that prompts the user to enter a string
 * and displays the sorted string.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String s = input.next();

        // Call sort method and display result
        System.out.println(sort(s));

        // Close Scanner
        input.close();
    }

    /**
     * Sorts the string from a to z
     * @param s String to be sorted
     * @return Sorted string in ascending order
     */
    public static String sort(String s){
        // Variables
        boolean isSorted = false;
        int numberOfPasses = 0;

        // Copy the string into an array of characters
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            c[i] = s.charAt(i);
        }

        // Iterate through array until string is sorted
        while(!isSorted){
            // Reset numberOfPasses counter after every iteration
            numberOfPasses = 0;

            for(int i = 0; i < c.length - 1; i++){
                // If current char is bigger than next char, swap them
                if(c[i] > c[i + 1]){
                    char temp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = temp;
                    numberOfPasses++;
                }
            }
            // If no passes are made, the string is sorted
            if(numberOfPasses == 0){
                isSorted = true;
            }
        }

        // Utilize StringBuilder to rebuild result string
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < c.length; i++){
            sb.append(c[i]);
        }

        return sb.toString();
    }

}
