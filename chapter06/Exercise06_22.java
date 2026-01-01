/**
 * @author Weiquan Mai
 * Problem 6.22
 * (Math: approximate the square root)
 * There are several techniques for implementing the sqrt method in the Math class.
 * One such technique is known as the Babylonian method.
 * It approximates the square root of a number, n, by repeatedly performing
 * the calculation using the following formula:
 * nextGuess = (lastGuess + n / lastGuess) / 2
 *
 * When nextGuess and lastGuess are almost identical,
 * nextGuess is the approximated square root.
 * The initial guess can be any positive value(e.g., 1).
 * This value will be the starting value for lastGuess.
 * If the difference between nextGuess and lastGuess is less than a very small number,
 * such as 0.0001, you can claim that nextGuess is the approximated square root of n.
 * If not, nextGuess becomes lastGuess and the approximation process continues.
 * implement the following method that returns the square root of n:
 * public static double sqrt(long n)
 */

import java.util.Scanner;
public class Exercise06_22 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter a number: ");
        long n = input.nextLong();

        // Calculate square root and display result
        System.out.println("Square root of " + n + " is " + sqrt(n));

        // Close Scanner
        input.close();
    }

    /**
     * Calculates the square root of an integer
     * @param n Integer to calculate square root of
     * @return Square root of integer n
     */
    public static double sqrt(long n){
        double lastGuess = n / 2.0;
        double nextGuess = (double) (lastGuess + n / lastGuess) / 2;

        while(Math.abs(nextGuess - lastGuess) >= 0.0001){
            lastGuess = nextGuess;
            nextGuess = (double) (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}
