/**
 * @author Weiquan Mai
 * Problem 8.1
 * (Sum elements row by row)
 * Write a method that returns the sum of all the elements
 * in a specified row in a matrix using the following header:
 * public static double sumRow(double[][] m, int rowIndex)
 * Write a test programt hat reads a 3-by-4 matrix and displays the sum of each row.
 */

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 3-by-4 matrix row by row
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] m = new double[3][4];
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[row].length; column++){
                m[row][column] = input.nextDouble();
            }
        }

        // Utilize for loop to call method and display result
        for(int row = 0; row < m.length; row++){
            System.out.println("Sum of the elements at row " + row + " is " + sumRow(m, row));
        }

        // Close Scanner
        input.close();
    }

    /**
     * Sums the elements in specified rowIndex from a two-dimensional array and returns the sum
     * @param m Input two-dimensional array
     * @param rowIndex Specified rowIndex to sum
     * @return Sum of specified rowIndex in two-dimensional array
     */
    public static double sumRow(double[][]m, int rowIndex){
        double accumulator = 0;

        for(int i = 0; i < m[rowIndex].length; i++){
            accumulator += m[rowIndex][i];
        }

        return accumulator;
    }
}
