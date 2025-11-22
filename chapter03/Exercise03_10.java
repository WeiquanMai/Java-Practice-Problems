/**
 * @Author Weiquan Mai
 * Problem 3.10
 * (Game: multiplication quiz)
 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 * Revise the program to randomly generate a multiplication question
 * with two integers less than 1000.
 */

import java.util.Scanner;

public class Exercise03_10 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Generate two random numbers between 0 and 1000
        int number1 = (int) (Math.random() * 1000);
        int number2 = (int) (Math.random() * 1000);

        // Prompt user for answer
        System.out.print("What is " + number1 + " X " + number2 + "? ");
        int answer = input.nextInt();

        // Grade answer and display result
        if(number1 * number2 == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Incorrect!");
            System.out.println(number1 + " X " + number2 + " = " + number1 * number2);
        }

        // Close Scanner
        input.close();
    }
}
