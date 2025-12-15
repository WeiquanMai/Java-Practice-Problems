/**
 * @author Weiquan Mai
 * Problem 5.34
 * (Game: scissor, rock, paper)
 * Programming Exercise 3.17 gives a program that displays the scissor-rock-paper game.
 * Revise the program to let the user continuousplay play until either the user
 * or the computer wins three times more than their opponent.
 */

import java.util.Scanner;

public class Exercise05_34 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Track win count
        int winCounter = 0;

        // Keep playing while win counter is between -3 and 3
        while(winCounter > -3 && winCounter < 3){
            // Generate random number
            int computerChoice = (int) (Math.random() * 3);
            System.out.println(computerChoice);

            // Ask for user input
            System.out.println("Rock Paper Scissors!");
            System.out.println("Select 0 for scissor, 1 for rock, 2 for paper");
            System.out.print("Your choice: ");
            int userChoice = input.nextInt();

            // Determine result
            String[] choices = {"scissor", "rock", "paper"};
            System.out.print("The computer is " + choices[computerChoice] + ". You are " + choices[userChoice] + ". ");
            if (computerChoice == userChoice) {
                System.out.println("It is a draw");
            }
            else if (userChoice == 0 && computerChoice == 2 ||
                    userChoice == 1 && computerChoice == 0 ||
                    userChoice == 2 && computerChoice == 1) {
                System.out.println("You win!");
                winCounter++;
            }
            else {
                System.out.println("Computer wins");
                winCounter--;
            }
        }

        // Close Scanner
        input.close();
    }
}
