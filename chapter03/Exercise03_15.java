/**
 * @Author Weiquan Mai
 * Problem 3.15
 * (Game: lottery)
 * Revise Listing 3.8, Lottery.java, to generate a lottery of three-digit number.
 * The program prompts the user to enter a three-digit number and determines
 * whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $12,000.
 * 2. If all the digits in the user input match all the digits in the lottery number, the award is $5,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $2,000.
 */

import java.util.Scanner;

public class Exercise03_15 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Generate a random three-digit number
        int lottery = (int) (Math.random() * 1000);

        // Ask user for guess
        System.out.println(lottery);
        System.out.print("Enter three-digit guess for lottery: ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = ((lottery / 10) - (lotteryDigit1 * 10));
        int lotteryDigit3 = lottery % 10;

        // Get digits for guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = ((guess / 10) - (guessDigit1 * 10));
        int guessDigit3 = guess % 10;

        // Determine award based on lottery rules
        int fullMatchAward = 12000;
        int matchAllDigitAward = 5000;
        int oneDigitMatchAward = 1000;

        // If user input matches the lottery number in the exact order, the award is $12,000
        if (guess == lottery){
            System.out.println("Exact match! You win $" + fullMatchAward);
        }
        // If all digits in the user input matches all digits in the lottery number, the award is $5,000
        else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1 && guessDigit2 == lotteryDigit2)) {
            System.out.println("Match all digits! You win $" + matchAllDigitAward);
        }
        // if one digit in the user input matches a digit in the lottery number, the award is $2,000
        else if (guessDigit1 == lotteryDigit1 ||
                guessDigit1 == lotteryDigit2 ||
                guessDigit1 == lotteryDigit3 ||
                guessDigit2 == lotteryDigit1 ||
                guessDigit2 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit3 ||
                guessDigit3 == lotteryDigit1 ||
                guessDigit3 == lotteryDigit2 ||
                guessDigit3 == lotteryDigit3){
            System.out.println("Match one digit! You win $" + oneDigitMatchAward);
        }
        else {
            System.out.println("Sorry, no match");
        }

        // Close Scanner
        input.close();
    }
}
