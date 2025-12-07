/**
 * @Author Weiquan Mai
 * Problem 4.13
 * (Vowel or consonant?)
 * Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant.
 * For a nonletter input, display invalid input.
 */

import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input a letter
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        // Validation check on length
        if(userInput.length() != 1){
            System.out.println("You must enter exactly one letter!");
            System.exit(1);
        }

        // Determine if input is a letter
        char ch = userInput.charAt(0);
        if(('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')){
            // Convert char to String to utilize equalsIgnoreCase
            String stringCh = Character.toString(ch);

            // Determine if input is a vowel or consonant
            if(stringCh.equalsIgnoreCase("A") || stringCh.equalsIgnoreCase("E") ||
                    stringCh.equalsIgnoreCase("I") ||stringCh.equalsIgnoreCase("O") ||stringCh.equalsIgnoreCase("U")){
                System.out.println(stringCh + " is a vowel");
            }
            else{
                System.out.println(stringCh + " is a consonant");
            }
        }
        else{
            System.out.println(ch + " is an invalid input");
        }

        // Close Scanner
        input.close();
    }
}
