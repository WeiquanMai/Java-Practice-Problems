/**
 * @Author Weiquan Mai
 * Problem 3.35
 * (Even or odd number)
 * Write a program that prompts the user to enter an integer
 * and displays whether the integer is an odd number or not
 */

import java.util.Scanner;

public class Exercise03_35 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter an integer
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();

        // Determine if integer is even or odd
        boolean isEven = userInput % 2 == 0;

        // Display result
        if(isEven){
            System.out.println(userInput + " is even number");
        }
        else{
            System.out.println(userInput + " is odd number");
        }

        // Close Scanner
        input.close();
    }
}
