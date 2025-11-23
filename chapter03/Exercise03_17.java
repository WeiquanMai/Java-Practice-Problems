/**
 * @Author Weiquan Mai
 * Problem 3.17
 * (Game: scissor, rock, paper)
 * Write a program that plays the popular scissor-rock-paper game.
 * A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.
 * The program randomly generates a number 0, 1, 2 representing scissor, rock, and paper.
 * The program prompts the user to enter number 0, 1, or 2 and displays a message
 * indicating whether the user or the computer wins, lose, or draws.
 */

import java.util.Scanner;

public class Exercise03_17 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

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
        if(computerChoice == userChoice){
            System.out.println("It is a draw");
        }
        else if(computerChoice > userChoice){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("You win!");
        }


        // Close Scanner
        input.close();
    }
}
