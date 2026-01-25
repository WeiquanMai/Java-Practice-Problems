/**
 * @author Weiquan Mai
 * Problem 8.30
 * (Algebra: solve linear equations)
 * Write a method that solves the following 2 x 2 system of linear equations:
 * a00x + a01 = b0
 * a10x + a11 y = b1
 * x = boa11 - b1a01 / a00a11 - a01a10
 * y = b1a00 - b0a10 / a00a11 - a01a10
 *
 * The method header is:
 * public static double[] linearEquation(double[][] a, double[] b)
 * The method returns null if a00a11 - a01a10 is 0.
 * Write a test program that prompts the user to enter a00, a01, a10, a11, b0, and b1
 * and displays the result.
 * If a00a11 - a01 a10 is 0, report that "The solution has no equation."
 */

import java.util.Scanner;

public class Exercise08_30 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double[][] a = new double[2][2];
        double[] b = new double[2];

        // Prompt user to enter variables
        System.out.print("Enter a00, a01, a10, a11, b0,and b1: ");
        a[0][0] = input.nextDouble();
        a[0][1] = input.nextDouble();
        a[1][0] = input.nextDouble();
        a[1][1] = input.nextDouble();
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();

        // Call linearEquation method and display result
        if(linearEquation(a, b) == null){
            System.out.println("The equation has no solution.");
        }
        else{
            double[] result = linearEquation(a, b);
            System.out.printf("x is %.1f and y is %.1f", result[0], result[1]);
        }

        // Close Scanner
        input.close();
    }

    /**
     * Determines the result of a 2 x 2 system of linear equations
     * @param a 2 x 2 system of equations
     * @param b result of 2 x 2 system of equations
     * @return Result of 2 x 2 system of linear equations in array format.
     */
    public static double[] linearEquation(double[][] a, double[] b){
        if((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0){
            return null;
        }

        double x = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        double y = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));

        return new double[]{x, y};
    }
}
