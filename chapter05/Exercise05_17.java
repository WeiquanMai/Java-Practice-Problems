/**
 * @author Weiquan Mai
 * Problem 5.17
 * (Display pyramid)
 * Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid,
 * as shown in the following sample run:
 *
 * Enter the number of lines: 7
 * 7 6 5 4 3 2 1 2 3 4 5 6 7
 * 6 5 4 3 2 1 2 3 4 5 6
 * 5 4 3 2 1 2 3 4 5
 * 4 3 2 1 2 3 4
 * 3 2 1 2 3
 * 2 1 2
 * 1
 */

import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variable
        int leftCounter = 0;
        int rightCounter = 1;

        // Prompt user for number of lines
        System.out.print("Enter the number of line: ");
        int numLines = input.nextInt();

        // Input validation
        while(numLines < 0){
            System.out.print("Invalid input! Please enter a positive integer: ");
            numLines = input.nextInt();
        }

        // Iterate from numLines down to 1
        for(int i = numLines; i > 0; i--){
            // Display left side
            leftCounter = i;
            while(leftCounter > 1){
                System.out.print(leftCounter + " ");
                leftCounter--;
            }

            // Display right side
            while(rightCounter <= i){
                System.out.print(rightCounter + " ");
                rightCounter++;
            }

            // Reset rightCounter and go to next line
            rightCounter = 1;
            System.out.println();
        }

        // Close Scanner
        input.close();
    }
}
