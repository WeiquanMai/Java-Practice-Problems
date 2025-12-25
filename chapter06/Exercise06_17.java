/**
 * @author Weiquan Mai
 * Problem 6.17
 * (Display matrix of 0s and 1s)
 * Write a method that displays an n-by-n matrix using the following header:
 * public static void printMatrix(int n)
 *
 * Each element is 0 or 1, which is generated randomly.
 * Write a test program that prompts the user to enter n
 * and displays an n-by-n matrix.
 */

import java.util.Scanner;

public class Exercise06_17 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter integer n
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Input validation
        while(n <= 0){
            System.out.print("Invalid input! Please enter an integer above 0: ");
            n = input.nextInt();
        }

        // Call printMatrix method
        printMatrix(n);

        // Close Scanner
        input.close();
    }

    /**
     * Generates an n-by-n matrix of 0's and 1's
     * @param n Determines size of matrix square
     */
    public static void printMatrix(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }

    }
}
