/**
 * @author Weiquan Mai
 * Problem 8.29
 * (Identical arrays)
 * The two-dimensional arrays m1 and m2 are identical if they have the same contents.
 * Write a method that returns true if m1 and m2 are identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 *
 * Write a test program that prompts the user to enter two 3 x 3 arrays of integers,
 * and displays whether the two are identical.
 */

import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        // Prompt user to enter list1
        System.out.print("Enter list1: ");
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list1.length; j++){
                list1[i][j] = input.nextInt();
            }
        }

        // Prompt user to enter list2
        System.out.print("Enter list2: ");
        for(int i = 0; i < list2.length; i++){
            for(int j = 0; j < list2.length; j++){
                list2[i][j] = input.nextInt();
            }
        }

        // Call equals method and display results
        if(equals(list1, list2)){
            System.out.println("The two arrays are identical");
        }
        else{
            System.out.println("The two arrays are not identical");
        }

        // Close Scanner
    }

    public static boolean equals(int[][] m1, int[][] m2){
        // m1 and m2 are not identical if they do not have the same size
        if(m1.length != m2.length || m1[0].length != m2[0].length){
            return false;
        }

        // Variables
        int[] a1 = new int[m1.length * m1[0].length];
        int[] a2 = new int[m2.length * m2[0].length];

        // Convert 2d array to 1d array
        int a1Counter = 0;
        int a2Counter = 0;

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                a1[a1Counter] = m1[i][j];
                a1Counter++;
            }
        }
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[0].length; j++){
                a2[a2Counter] = m2[i][j];
                a2Counter++;
            }
        }

        // Sort both 1d arrays
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);

        // If the values in the sorted arrays are not equal, then the arrays are not identical
        for(int i = 0; i < a1.length; i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }

        return true;
    }
}
