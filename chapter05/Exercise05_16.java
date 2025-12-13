/**
 * @author Weiquan Mai
 * Problem 5.16
 * (Find the factors of an integer)
 * Write a program that reads an integer and displays all of its smallest factors in an increasing order.
 * For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */

import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for user integer
        System.out.print("Enter a positive integer to factor: ");
        int userInt = input.nextInt();

        // Input validation on integer
        while(userInt <= 0){
            System.out.print("Please enter a positive integer: ");
            userInt = input.nextInt();
        }
        // If input is 1, simply output 1
        if(userInt == 1){
            System.out.println("1");
        }
        else{
            // Iterate from 2 to userInt, and determine if it is divisible by that integer
            for(int i = 2; i < userInt; i++){
                if(userInt % i == 0){
                    userInt = userInt / i;
                    System.out.print(i + " ");
                    // Reset iteration starting point
                    i = 1;
                }
            }
        }

        // Display remaining divisor
        System.out.print(userInt + " ");

        // Close Scanner
        input.close();
    }
}
