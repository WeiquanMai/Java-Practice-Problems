/**
 * @author Weiquan Mai
 * Problem 6.20
 * (Count the letters in a string)
 * Write a method that counts the number of letters in a string
 * using the following header:
 * public static int countLetters(String s)
 *
 * Write a test progrma that prompts the user to enter a string
 * and displays the number of letters in the string.
 */

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Exercise06_20 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Call countLetters method and display result
        System.out.println("String " + s + " has " + countLetters(s) + " letters");

        // Close Scanner
        input.close();
    }

    /**
     * Counts the number of letters from input string
     * @param s Input string to be counted
     * @return Number of letters from input string
     */
    public static int countLetters(String s){
        int counter = 0;

        for(int i = 0; i < s.length(); i++){
            char c =s.charAt(i);

            if(isLetter(c)){
                counter++;
            }
        }

        return counter;
    }
}
