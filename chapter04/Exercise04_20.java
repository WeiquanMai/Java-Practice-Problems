/**
 * @Author Weiquan Mai
 * Problem 4.20
 * (Process a string)
 * Write a program that prompts the user to enter a string
 * and displays its length and its last character.
 */

import java.util.Scanner;
public class Exercise04_20 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Determine length and last character
        int inputLength = userInput.length();
        char lastCharacter = userInput.charAt(inputLength - 1);

        // Display result
        System.out.println("Length: " + inputLength );
        System.out.println("Last character: " + lastCharacter);

        // Close Scanner
        input.close();
    }
}
