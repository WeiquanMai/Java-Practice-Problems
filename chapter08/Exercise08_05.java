/**
 * @author Weiquan Mai
 * Problem 8.5
 * (Algebra: add two matrices)
 * Write a method to add two matrices. The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][]b)
 *
 * In order to be added, the two matrices must have the same dimensions,
 * and the same or compatible types of elements. Let c be the resulting matrix.
 * Each element cij is aij + bij.
 *
 * Write a test program that prompts the user to enter two 2x2 matrices
 * and displays their sum.
 */

import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two 2 x 2 matrices
        System.out.print("Enter matrix1: ");
        double[][] a = new double[2][2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        double[][] b = new double[2][2];
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = input.nextDouble();
            }
        }

        // Call addMatrix method and display result
        double[][] c = addMatrix(a, b);
        System.out.println("The matrices are added as follows: ");
        System.out.printf("%.1f %.1f    %.1f %.1f   %.1f %.1f\n", a[0][0], a[0][1], b[0][0], b[0][1], c[0][0], c[0][1]);
        System.out.printf("%.1f %.1f +  %.1f %.1f = %.1f %.1f\n", a[1][0], a[1][1], b[1][0], b[1][1], c[1][0], c[1][1]);

        // Close Scanner
        input.close();
    }

    /**
     * Adds two matrices together and returns resulting matrix
     * @param a First matrix to add
     * @param b Second matrix to add
     * @return Sum of both matrices, or null if matrices are not the same length
     */
    public static double[][] addMatrix(double[][] a, double[][]b){
        if((a.length != b.length) || (a[0].length != b[0].length) ){
            System.out.println("Matrices must have the same length!");
            return null;
        }

        double[][] result = new double [a.length][a[0].length];

        // Iterate through and add a and b to result
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
