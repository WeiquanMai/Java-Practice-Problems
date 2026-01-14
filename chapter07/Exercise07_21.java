/**
 * @author Weiquan Mai
 * Problem 7.21
 * (Normalizing integers)
 * Write a program that prompts the user to enter 10 integers,
 * and normalizes the integers to be in the range of 0 to 1
 * by dividing every integer with the largest integer.
 * Display the 10 normalized real-valued numbers.
 */

import java.util.Scanner;

public class Exercise07_21 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        // Prompt user to enter 10 integers
        System.out.print("Enter 10 integers: ");
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
            // Find the largest integer
            if(array[i] > max){
                max = array[i];
            }
        }
        // Normalize the integers by dividing them by the largest integer
        double[] normalized = new double[array.length];
        for(int i = 0; i < normalized.length; i++){
            normalized[i] = (double) array[i] / max;
        }

        // Display result
        System.out.print("Normalized list: ");
        for(int i = 0 ; i < normalized.length; i++){
            System.out.print(normalized[i] + " ");
        }

        // Close Scanner
        input.close();
    }
}
