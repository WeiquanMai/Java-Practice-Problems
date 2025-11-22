/**
 * @Author Weiquan Mai
 * Problem 3.14
 * (Game: heads or tails)
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails.
 * The program randomly generates an integer 0 or 1, which represents head or tail.
 * The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
 */

import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Generate random number
        int random = (int) (Math.round(Math.random()));

        // Ask user to guess heads or tail
        System.out.print("Guess heads or tails (1 for head, 0 for tail): ");
        int guess = input.nextInt();

        // Check guess
        boolean correct = guess == random;

        // Display result
        if(correct){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect!");
        }

        // Close Scanner
        input.close();
    }
}
