/**
 * @author Weiquan Mai
 * Problem 5.32
 * (Game: lottery)
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a two-digit number.
 * The two digits in the number are distinct.
 * (Hint: Generate the first digit. Use a loop to continuously generate the second digit
 * until it is different from the first digit.)
 */

import java.util.Scanner;

public class Exercise05_32 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Generate lottery numbers
        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2 = (int) (Math.random() * 10);

        // Continuously generate the second digit until it is different from the first digit
        while(lotteryDigit1 == lotteryDigit2){
            lotteryDigit2 = (int) (Math.random() * 10);
        }

        // Combine the digits to generate the lottery number
        int lotteryNumber = lotteryDigit1 * 10 + lotteryDigit2;

        // Prompt user to enter a guess
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        // Check the guess
        System.out.println("The lottery number is " + lotteryNumber);
        if(guess == lotteryNumber){
            System.out.println("Exact match: you win $10,000");
        }
        else if((guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)){
            System.out.println("Match all digits: you win $3,000");
        }
        else if( guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2){
            System.out.println("Match one digit: you win $1,000");
        }
        else{
            System.out.println("Sorry, no match");
        }

        // Close Scanner
        input.close();

    }
}
