/**
 * @Author Weiquan Mai
 * Problem 4.14
 * (Convert letter grade to number)
 * Write a program that prompts the user to enter a letter grade A, B, C, D, or F
 * and displays its corresponding numeric value 4, 3, 2, 1, or 0.
 * For other input, display invalid grade.
 */

import java.util.Scanner;

import static java.lang.Character.isLetter;
import static java.lang.Character.toUpperCase;

public class Exercise04_14 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a letter grade
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        // Validation check
        if(userInput.length() != 1){
            System.out.println("You must enter exactly one letter!");
            System.exit(1);
        }
        char ch = userInput.charAt(0);
        if(!isLetter(ch)){
            System.out.println("You must enter a letter!");
            System.exit(2);
        }

        // Convert letter grade to number
        ch = toUpperCase(ch);
        if((ch >= 'A' && ch <= 'D') || ch == 'F'){
            switch(ch){
                case 'A':
                    System.out.println("The numeric value for grade A is 4");
                    break;
                case 'B':
                    System.out.println("The numeric value for grade B is 3");
                    break;
                case 'C':
                    System.out.println("The numeric value for grade C is 2");
                    break;
                case 'D':
                    System.out.println("The numeric value for grade D is 1");
                    break;
                case 'F':
                    System.out.println("The numeric value for grade F is 0");
                    break;
                default:
                    System.out.println(ch + " is an invalid grade");
                    break;
            }
        }
        else {
            System.out.println(ch + " is an invalid grade");
        }

        // Close Scanner
        input.close();
    }
}
