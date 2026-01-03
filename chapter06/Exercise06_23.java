/**
 * @author Weiquan Mai
 * Problem 6.23
 * (Occurrences of a specified character)
 * Write a method that finds the number of occurrences of a specified character
 * in a string using the following header:
 * public static int count(String str, char a)
 *
 * For example, count("Welcome", 'e') returns 2.
 * Write a test program that prompts the user to enter a string
 * followed by a character, then displays the number of occurrences
 * of the character in the string.
 */

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for a string and a character
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char a = input.next().charAt(0);

        // Call count method and display result
        System.out.println(count(str,a));

        // Close Scanner
        input.close();
    }

    /**
     * Counts the number of times a character shows up in a string
     * @param str Input string
     * @param a Character to be counted
     * @return Number of occurrences of the character in the string. 
     */
    public static int count(String str, char a){
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == a){
                counter++;
            }
        }

        return counter;
    }
}
