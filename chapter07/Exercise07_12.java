/**
 * @author Weiquan Mai
 * Problem 7.12
 * (Reverse an array)
 * The reverse method in Section 7.7 reverses an array by copying it to a new array.
 * Rewrite the method that reverses the array passed in the argument and returns this array.
 * Write a test program that prompts the user to enter 10 numbers,
 * invokes the method to reverse the numbers, and displays the numbers.
 */

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        // Invoke method to reverse the method, and display the numbers
        double[] reverse = reverse(array);
        System.out.print("The reversed array is: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(reverse[i] + " ");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Reverses an array in place
     * @param list Initial array
     * @return Reversed array
     */
    public static double[] reverse(double[] list){
        for(int i = 0; i < (list.length / 2); i++){
            double temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        return list;
    }
}
