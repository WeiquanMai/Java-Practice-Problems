/**
 * @author Weiquan Mai
 * Problem 7.25
 * (Algebra: solve quadratic equations)
 * Write a method for solving a quadratic equation using the following header:
 * public static int solveQuadratic(double[] eqn, double[] roots)
 *
 * The coefficients of a quadratic equation ax^2 + bx + c = 0 are passed
 * to the array eqn and the real roots are stored in roots.
 * The method returns the number of real roots.
 * See Programming Exercise 3.1 on how to solve a quadratic equation.
 * Write a program that prompts the user to enter all values for a, b, and c,
 * and displays the number of real roots and all real roots.
 */

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter values for a, b, and c
        System.out.println("Quadratic equation is in the form of ax^2 + bx + c = 0");
        System.out.print("Enter values for a, b, and c: ");
        double[] eqn = new double[3];
        double[] roots = new double[2];
        for(int i = 0; i < 3; i++){
            eqn[i] = input.nextDouble();
        }

        // Call method and display results
        int numberOfRealRoots = solveQuadratic(eqn, roots);
        System.out.println("The number of real roots: " + numberOfRealRoots);
        if(numberOfRealRoots == 2){
            System.out.println("The roots are " + roots[0] + " and " + roots[1]);
        }
        else if(numberOfRealRoots == 1){
            System.out.println("The root is " + roots[0]);
        }
        else{
            System.out.println("There are no real roots.");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Calculates the number of real roots in a quadratic equation
     * @param eqn Equation that passes in values a, b, and c
     * @param roots Array to store calculated root values
     * @return Number of real roots
     */
    public static int solveQuadratic(double[] eqn, double[] roots){
        double discriminant = Math.pow(eqn[1] , 2) - (4 * eqn[0] * eqn[2]);
        double r1 = (-eqn[1] + Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
        double r2 = (-eqn[1] - Math.pow(discriminant, 0.5)) / (2 * eqn[0]);

        // Determine number of roots based on discriminant result
        if(discriminant > 0){
            roots[0] = r1;
            roots[1] = r2;
            return 2;
        }
        else if(discriminant == 0){
            roots[0] = r1;
            return 1;
        }
        else{
            return  0;
        }
    }
}
