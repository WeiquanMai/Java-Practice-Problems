/**
 * @author Weiquan Mai
 * Problem 7.8
 * (Average an array)
 * Write two overloaded methods that return the average of an array
 * with the following headers:
 * public static int average(int[] array)
 * public static double average(double[] array)
 *
 * Write a test program that prompts the user to enter 10 double values,
 * invokes this method, and then displays the average value.
 */

import java.util.Scanner;
public class Exercise07_08 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 double values
        System.out.print("Enter 10 values: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        // Invoke the method, and then display the average value
        System.out.println("The average is " + average(array));

        // Close Scanner
        input.close();
    }

    /**
     * Returns the average of an integer array
     * @param array Array containing list of integers
     * @return Average of integer array
     */
    public static int average(int[] array){
        double accumulator = 0;

        for(int i = 0; i < array.length; i++){
            accumulator += array[i];
        }

        return (int) accumulator / array.length;
    }

    /**
     * Returns average of double array
     * @param array Array containing list of doubles
     * @return Average of double array
     */
    public static double average(double[] array){
        double accumulator = 0;

        for(int i = 0; i < array.length; i++){
            accumulator += array[i];
        }

        return accumulator / array.length;
    }
}
