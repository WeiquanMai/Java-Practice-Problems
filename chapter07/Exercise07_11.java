/**
 * @author Weiquan Mai
 * Problem 7.11
 * (Statistics: compute deviation)
 * Programming Exercise 5.45 computes the standard deviation of numbers.
 * This exercise uses a different but equivalent formula to compute
 * the standard deviation of n numbers.
 *
 * To compute the standard deviation with this formula,
 * you have to store the individual numbers using an array,
 * so they can be used after the mean is obtained.
 *
 * Your program should contain the following methods:
 * /* Compute the deviation of double values *
 * public static double deviation(double[] x)
 *
 * /* Compute the mean of an array of double values *
 * public static double mean (double[] x)
 *
 * Write a test program that prompts the user to enter 10 numbers
 * and displays the mean and standard deviation.
 */

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        // Invoke mean and deviation method and display result
        System.out.println("The mean is " + mean(array));
        System.out.println("The standard deviation is " + deviation(array));


        // Close Scanner
        input.close();
    }

    /**
     * Compute the deviation of double values
     * @param x Array of double values
     * @return Standard deviation of list of double values
     */
    public static double deviation(double[] x){
        // Variables
        double mean = mean(x);
        double summation = 0;

        for(int i = 0; i < x.length; i++){
            summation += Math.pow((x[i] - mean), 2);
        }

        return Math.sqrt(summation / (x.length - 1));
    }

    /**
     * Compute the mean of an array of double values
     * @param x Array of double values
     * @return The mean value of list of double values
     */
    public static double mean(double[] x){
        double accumulator = 0;

        for(int i = 0; i < x.length; i++){
            accumulator += x[i];
        }

        return accumulator / x.length;
    }
}
