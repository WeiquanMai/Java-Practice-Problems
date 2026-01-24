/**
 * @author Weiquan Mai
 * Problem 8.25
 * (Markov matrix)
 * An n x n matrix is called a positive Markov matrix
 * if each element is positive and the sum of the elements in each column is 1.
 * Write the following method to check whether a matrix is a Markov matrix:
 * public static boolean isMarkovMatrix(double[][] m)
 *
 * Write a test program that prompts the user to enter a 3 x 3 matrix
 * of double values and tests whether it is a Markov matix.
 */

import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 3-by-3 matrix
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] m = new double[3][3];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }

        // Call isMarkovMatrix method and display result
        if(isMarkovMatrix(m)){
            System.out.println("It is a Markov matrix");
        }
        else{
            System.out.println("It is not a Markov matrix");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Determines if an input 2d matrix is a Markov matrix
     * @param m Two-dimensional array
     * @return True if the 2d matrix is a Markov matrix, otherwise false
     */
    public static boolean isMarkovMatrix(double[][] m){
        // Iterate through 2d array
        for(int i = 0; i < m.length; i++){
            double accumulator = 0;

            for(int j = 0; j < m[i].length; j++){
                // Each element of a Markov matrix is positive
                if(m[i][j] < 0){
                    return false;
                }
                accumulator += m[j][i];
            }
            // Sum of elements in each column is 1
            if(Math.abs(1.0 - accumulator) > 0.001){
                return false;
            }
        }

        return true;
    }
}
