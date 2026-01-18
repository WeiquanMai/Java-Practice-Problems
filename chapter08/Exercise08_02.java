/**
 * @author Weiquan Mai
 * Problem 8.2
 * (Average the major diagonal in a matrix)
 * Write a method that averages all the numbers in the major diagonal
 * in an n * n matrix of double values using the following header:
 * public static double averageMajorDiagonal(double[][] m)
 *
 * Write a test program that reads a 4-by-4 matrix
 * and displays the average of all its elements on the major diagonal.
 */

import java.util.Scanner;
public class Exercise08_02 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 4-by-4 matrix
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] m = new double[4][4];
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[row].length; column++){
                m[row][column] = input.nextDouble();
            }
        }

        // Call method and display result
        System.out.println("Average of the elements in the major diagonal is " + averageMajorDiagonal(m));

        // Close Scanner
        input.close();
    }

    /**
     * Calculates and returns the average along the major diagonal of a n * n matrix
     * @param m Two-dimensional input array
     * @return Average along major diagonal of two-dimensional array
     */
    public static double averageMajorDiagonal(double[][] m){
        double accumulator = 0;

        for(int i = 0; i < m.length; i++){
            accumulator += m[i][i];
        }

        return accumulator / m.length;
    }
}
