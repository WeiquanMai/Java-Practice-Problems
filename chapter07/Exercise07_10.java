/**
 * @author Weiquan Mai
 * Problem 7.10
 * (Find the index of the largest element)
 * Write a method that returns the index of the largest element in an array of integers.
 * If there is more than one element, return the largest index.
 * Use the following header:
 * public static int indexOfLargestElement(double[] array)
 *
 * Write a test program that prompts the user to enter 10 numbers,
 * invokes this method to return the index of the largest element,
 * and displays the index and the element itself.
 */

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 numbers
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        // Invoke the method and return index of the largest element
        System.out.println("Index of largest element is: " + indexOfLargestElement(array));

        // Close Scanner
        input.close();
    }

    /**
     * Finds the largest element in an array of doubles and the index of the largest element
     * @param array Array of doubles
     * @return Index of largest element
     */
    public static int indexOfLargestElement(double[] array){
        double max = array[0];
        int indexOfMax = 0;

        // Keep track of max and the index of max
        for(int i = 1; i < array.length; i++){
            if(array[i] >= max){
                max = array[i];
                indexOfMax = i;
            }
        }

        return indexOfMax;
    }
}
