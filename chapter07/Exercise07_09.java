/**
 * @author Weiquan Mai
 * Problem 7.9
 * (Find the largest element)
 * Write a method that finds the largest element in an array
 * of double values using the following header:
 * public static double max(double[] array)
 *
 * Write a test program that prompts the user to enter ten numbers,
 * invokes this method to return the maximum value,
 * and displays the maximum value.
 */

import java.util.Scanner;
public class Exercise07_09 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 numbers
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        // Invoke the method, and display the maximum value
        System.out.println("The maximum number is: " + max(array));

        // Close Scanner
        input.close();
    }

    /**
     * Finds and returns maximum number in an array of doubles
     * @param array Array of doubles
     * @return Maximum value in array of doubles
     */
    public static double max(double[] array){
        double max = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
