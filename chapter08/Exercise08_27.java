/**
 * @author Weiquan Mai
 * Problem 8.27
 * (Column sorting)
 * Implement the following method to sort the columns in a two dimensional array.
 * A new array is returned and the original array is intact.
 * public static double[][] sortColumns(double[][] m)
 *
 * Write a test program that prompts the user to enter a 4 x 4 matrix
 * of double values and displays a new column-sorted matrix.
 */

import java.util.Scanner;

public class Exercise08_27 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 4-by-4 matrix
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] m = new double[4][4];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }

        // Call sortColumns method and display result
        double[][] sortedArray = sortedColumns(m);
        System.out.println("Before sorting: ");
        displayArray(m);
        System.out.println();
        System.out.println("After sorting: ");
        displayArray(sortedArray);

        // Close Scanner
        input.close();
    }

    public static double[][] sortedColumns(double[][] m){
        // Make a copy of the array
        double[][] result = new double[m.length][m[0].length];
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                result[i][j] = m[i][j];
            }
        }

        // Iterate through 2d array
        for(int i = 0; i < result[0].length; i++){
            // Variables
            int numberOfSwaps = 0;
            boolean columnIsSorted = false;

            // Sort each column
            while(!columnIsSorted){
                numberOfSwaps = 0;

                for(int j = 0; j < result.length - 1; j++){
                    // Swap values if first value is bigger than second value
                    if(result[j][i] > result[j + 1][i]){
                        double temp = result[j][i];
                        result[j][i] = result[j + 1][i];
                        result[j + 1][i] = temp;
                        numberOfSwaps++;
                    }
                }

                if(numberOfSwaps == 0){
                    columnIsSorted = true;
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
