/**
 * @Author Weiquan Mai
 * Problem 4.15
 * (Phone key pads)
 * The international standard letter/number mapping is found on the telephone.
 * Write a program that prompts the user to enter a lowercase or uppercase letter
 * and displays its corresponding number.
 * For a nonletter input, display invalid input.
 */

import java.util.Scanner;

import static java.lang.Character.toUpperCase;


public class Exercise04_15 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a letter
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        // Input Validation for single letter
        if(userInput.length() != 1){
            System.out.println("You must enter exactly one letter!");
            System.exit(1);
        }

        // Convert letter to uppercase
        char ch = toUpperCase(userInput.charAt(0));

        // Map letters to number and output
        if(ch >= 'A' && ch <= 'C'){
            System.out.println("The corresponding number is 2");
        }
        else if (ch >= 'D' && ch <= 'F') {
            System.out.println("The corresponding number is 3");
        }
        else if(ch >= 'G' && ch <= 'I'){
            System.out.println("The corresponding number is 4");
        }
        else if(ch >= 'J' && ch <= 'L'){
            System.out.println("The corresponding number is 5");
        }
        else if(ch >= 'M' && ch <= 'O'){
            System.out.println("The corresponding number is 6");
        }
        else if(ch >= 'P' && ch <= 'S'){
            System.out.println("The corresponding number is 7");
        }
        else if(ch >= 'T' && ch <= 'V'){
            System.out.println("The corresponding number is 8");
        }
        else if(ch >= 'W' && ch <= 'Z'){
            System.out.println("The corresponding number is 9");
        }
        else{
            System.out.println(ch + " is an invalid input");
        }

        // Close Scanner
        input.close();
    }
}
