/**
 * @author Weiquan Mai
 * Problem 5.2
 * (Repeat multiplications)
 * Listing 5.4, SubtractionQuizLoop.java generates five random subtraction questions.
 * Revise the program to generate ten random multiplication questions for two integers
 * between 1 and 12. Display the correct count and test time.
 */

import java.util.Scanner;
public class Exercise05_02 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Initialize StringBuilder
        StringBuilder sb = new StringBuilder();

        // Variables
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();

        // While loop to generate ten random multiplication questions
        for(int i = 0; i < NUMBER_OF_QUESTIONS; i++){
            // Generate two random integers between 1 and 12
            int num1 = 1 + (int) (Math.random() * 12);
            int num2 = 1 + (int) (Math.random() * 12);

            // Prompt for answer
            System.out.print("What is " + num1 + " X " + num2 + " ? ");
            int answer = input.nextInt();

            // Grade answer
            if(answer == (num1 * num2)){
                System.out.println("Correct!");
                correctCount++;
            }
            else{
                System.out.println("Incorrect! " + num1 + " X " + num2 + " = " + (num1 * num2));
            }
            sb.append("\n").append(num1).append(" X ").append(num2).append(" = ").append(answer).append((num1 * num2 == answer) ? " correct" : "incorrect");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount);
        System.out.println("Test time is " + testTime/ 1000 + " seconds");
        System.out.println(sb);

        // Close Scanner
        input.close();
    }
}
