/**
 * @author Weiquan Mai
 * Problem 8.28
 * (Strictly identical arrays)
 * The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal.
 * Write a method that returns true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 *
 * Write a test program that prompts the user to enter two 3 x 3 arrays of integers
 * and displays whether the two are strictly identical.
 */

import java.util.Scanner;

public class Exercise08_28 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        // Prompt user to enter list1
        System.out.print("Enter list1: ");
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                m1[i][j] = input.nextInt();
            }
        }

        // Prompt user to enter list2
        System.out.print("Enter list2: ");
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[0].length; j++){
                m2[i][j] = input.nextInt();
            }
        }

        // Call equals method and display result
        if(equals(m1, m2)){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Determines if two 2d arrays are strictly identical
     * @param m1 First two-dimensional array
     * @param m2 Second two-dimensional array
     * @return True if the two 2d arrays are strictly identical, otherwise false
     */
    public static boolean equals(int[][] m1, int[][] m2){
        // Two arrays are not identical if their sizes are not identical
        if(m1.length != m2.length || m1[0].length != m2[0].length){
            return false;
        }

        // Iterate through 2d array
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                // If a value does not match, then the two arrays are not identical
                if(m1[i][j] != m2[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
