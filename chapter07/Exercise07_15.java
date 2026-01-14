/**
 * @author Weiquan Mai
 * Problem 7.15
 * (Eliminate duplicates)
 * Write a method that returns a new array by eliminating the duplicate values
 * in the array using the following method header:
 * public static int[] eliminateDuplicates(int[] list)
 *
 * Write a test program that reads in 10 integers, invokes the method,
 * and displays the distinct numbers separated by exactly one space.
 */

import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        // Invoke the method and display result
        int[] distinctArray = eliminateDuplicates(array);
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < distinctArray.length; i++){
            System.out.print(distinctArray[i] + " ");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Removes the duplicates from the list, and returns a list with distinct numbers
     * @param list Input list to have duplicates removed
     * @return List with all duplicates removed
     */
    public static int[] eliminateDuplicates(int[] list){
        // Variables
        int distinctCounter = 0;
        int[] tempArray = new int[list.length];

        // Iterate through the list
        for(int i = 0; i < list.length; i++){
            // If value does not match values inside tempArray, add it to tempArray and iterate counter
            boolean isDistinct = true;

            for(int j = 0; j < distinctCounter; j++){
                if(list[i] == tempArray[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                tempArray[distinctCounter] = list[i];
                distinctCounter++;
            }
        }

        // Copy values from temporary array to a final array
        int[] result = new int[distinctCounter];
        for(int i = 0; i < result.length; i++){
            result[i] = tempArray[i];
        }

        return result;
    }
}
