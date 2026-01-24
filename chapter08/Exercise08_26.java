/**
 * @author Weiquan Mai
 * Problem 8.26
 * (Row sorting)
 * Implement the following method to sort the rows in a two-dimensional array.
 * A new array is returned and the original array is intact.
 * public static double[][] sortRows(double[][] m)
 *
 * Write a test program that prompts the user to enter a 4 x 4 matrix
 * of double values and displays a new row-sorted matrix.
 */

import java.util.Scanner;

public class Exercise08_26 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 4-by-4 matrix
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] m = new double[4][4];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                m[i][j] = input.nextDouble();
            }
        }

        // Call sortRows method and display result
        double[][] sortedArray = sortRows(m);
        System.out.println("Initial array: ");
        displayArray(m);
        System.out.println("Sorted array: ");
        displayArray(sortedArray);

        // Close Scanner
        input.close();
    }

    /**
     * Sorts the rows of a 2d matrix in ascending order
     * @param m Two-dimensional matrix
     * @return Two-dimensional matrix with rows sorted in ascending order
     */
    public static double[][] sortRows(double[][] m){
        // Make a copy of initial array
        double[][] result = new double[m.length][m[0].length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                result[i][j] = m[i][j];
            }
        }

        // Iterate through array 2d array
        for(int i = 0; i < result.length; i++){
            // Variables
            boolean rowIsSorted = false;
            int numberOfSwaps = 0;

            // Sort each row
            while(!rowIsSorted){
                numberOfSwaps = 0;
                for(int j = 0; j < result[i].length - 1; j++){
                    // Swap values if first value is bigger than second value
                    if(result[i][j] > result[i][j + 1]){
                        double temp = result[i][j];
                        result[i][j] = result[i][j + 1];
                        result[i][j + 1] = temp;
                        numberOfSwaps++;
                    }
                }

                // If no swaps are made, then the row is sorted
                if(numberOfSwaps == 0){
                    rowIsSorted = true;
                }
            }
        }

        return result;
    }

    /**
     * Displays values of a two-dimensional array
     * @param m Two-dimensional array
     */
    public static void displayArray(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
