/**
 * @author Weiquan Mai
 * Problem 8.6
 * (Algebra: multiply two matrices)
 * Write a method to multiply two matrices. The header of the method is:
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 *
 * To multiply matrix a by matrix b, the number of columns in a
 * must be the same as the number of rows in b, and the two matrices must have elements of the same
 * or compatible types.
 * Let c be the result of the multiplication.
 * Assume the column size of matrix a is n.
 * Each element cij is ai1 x b1j + ai2 x b2j + ... + ain x bnj
 * Write a test program that prompts the user to enter two 3 x 3 matrices
 * and displays their product.
 */

import java.util.Scanner;

public class Exercise08_06 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter matrix1
        System.out.print("Enter matrix1: ");
        double[][] a = new double[3][3];
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = input.nextDouble();
            }
        }

        // Prompt user to enter matrix2
        System.out.print("Enter matrix2: ");
        double[][] b = new double[3][3];
        for(int i = 0 ; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = input.nextDouble();
            }
        }

        // Call multiplyMatrix method and display result
        double[][] c = multiplyMatrix(a, b);

        System.out.println("The multiplication of the matrices is");
        System.out.printf("%.1f %.1f %.1f   %.1f %.1f %.1f   %.1f %.1f %.1f\n",
                a[0][0], a[0][1], a[0][2], b[0][0], b[0][1], b[0][2], c[0][0], c[0][1], c[0][2]);
        System.out.printf("%.1f %.1f %.1f + %.1f %.1f %.1f = %.1f %.1f %.1f\n",
                a[1][0], a[1][1], a[1][2], b[1][0], b[1][1], b[1][2], c[1][0], c[1][1], c[1][2]);
        System.out.printf("%.1f %.1f %.1f   %.1f %.1f %.1f   %.1f %.1f %.1f\n",
                a[2][0], a[2][1], a[2][2], b[2][0], b[2][1], b[2][2], c[2][0], c[2][1],c[2][2]);

        // Close Scanner
        input.close();
    }

    /**
     * Multiplies matrix a and matrix b and returns the result of the multiplication
     * @param a Matrix a
     * @param b Matrix b
     * @return Result of multiplication if possible. Otherwise, returns null.
     */
    public static double[][] multiplyMatrix(double[][] a, double[][]b){
        // The number of columns in a must be the same as the number of rows in b
        if(a[0].length != b.length){
            System.out.println("Invalid matrix sizes");
            return null;
        }

        // Multiply matrix a and b and store the result in c
        double[][] c = new double[a.length][b[0].length];
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                for(int k = 0; k < a[0].length; k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        return c;
    }
}
