/**
 * @author Weiquan Mai
 * Problem 5.49
 * (Count vowels and consonants)
 * Assume that the letters A,E,I,O, and U are vowels.
 * Write a program that prompts the user to enter a string,
 * and displays the number of vowels and consonants in the string
 */

import java.util.Scanner;

public class Exercise05_49 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Iterate through length of string and count number of vowels and consonants
        String lowercaseInput = userInput.toLowerCase();

        for(int i = 0; i < lowercaseInput.length(); i++){
            char ch = lowercaseInput.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                numberOfVowels++;
            }
            else if(Character.isLetter(ch)){
                numberOfConsonants++;
            }
        }

        // Display result
        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.println("The number of consonants is " + numberOfConsonants);

        // Close Scanner
        input.close();
    }
}
