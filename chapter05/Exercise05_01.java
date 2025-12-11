/**
 * @author Weiquan Mai
 * Problem 5.1
 * (Pass or fail)
 * Write a program that prompts a user to enter a java score.
 * If the score is greater or equal to 60, display "you pass the exam";
 * otherwise, display "you don't pass the exam".
 * Your program ends with input -1.
 */

import java.util.Scanner;
public class Exercise05_01 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Initialize sentinel value
        int score = -2;

        // Initial question for input
        System.out.print("Enter your score: ");
        score = input.nextInt();

        // while loop to ask for score
        while(score != -1){
            // Condition check for pass or fail
            if(score >= 60){
                System.out.println("You pass the exam.");
            }
            else{
                System.out.println("You don't pass the exam. ");
            }

            // Ask for user input to continue loop
            System.out.print("Enter your score (input ends if it is -1): ");
            score = input.nextInt();
        }

        // Close Scanner
        input.close();
    }
}
