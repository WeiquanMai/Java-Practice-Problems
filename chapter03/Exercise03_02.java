/**
 * @Author Weiquan Mai
 * Problem 3.2
 * (Game: multiply three numbers)
 * The program in Listing 3.1 AdditionQuiz.java,
 * generates two integers and prompts the user to enter the product of these two integers.
 * Revise the program to generate three single-digit integers
 * and prompt the user to enter the multiplication of these three integers.
 */
import java.util.Scanner;

public class Exercise03_02 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Generate three random numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        // Ask user to solve multiplication
        System.out.print("What is " + number1 + " X " + number2 + " X " + number3 + ": ");
        int userAnswer = input.nextInt();

        // Calculate Answer
        int answer = number1 * number2 * number3;

        // Display result
        if(answer == userAnswer){
            System.out.println("Correct! " + number1 + " X " + number2 + " X " + number3 + " is " + answer);
        }
        else{
            System.out.println("Incorrect! " + number1 + " X " + number2 + " X " + number3 + " is " + answer);
        }

        // Close scanner
        input.close();
    }
}
