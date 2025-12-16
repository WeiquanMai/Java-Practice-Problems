/**
 * @author Weiquan Mai
 * Problem 5.48
 * (Process string)
 * Write a program that prompts the user to enter a string
 * and displays the characters at even positions.
 */
import java.util.Scanner;

public class Exercise05_48 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Display characters at even positions
        int stringLength = userInput.length();

        for(int i = 0; i < stringLength; i++){
            if(i % 2 != 0){
                System.out.print(userInput.charAt(i));
            }
        }

        // Close Scanner
        input.close();
    }
}
