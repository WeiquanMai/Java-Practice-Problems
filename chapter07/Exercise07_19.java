/**
 * @author Weiquan Mai
 * Problem 7.19
 * (Sorted?)
 * Write the following method that returns true if the list is already sorted in decreasing order.
 * public static boolean isSorted(int[] list)
 *
 * Write a test program that prompts the user to enter a list and displays whether the list is sorted or not.
 * The first number in the input indicates the number of elements in the list.
 */

import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a list (First number indicates the number of elements)
        System.out.print("Enter list: ");
        int numberOfElements = input.nextInt();
        int[] array = new int[numberOfElements];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        // Call method and display result
        boolean isSorted = isSorted(array);
        if(isSorted){
            System.out.println("The list is already sorted");
        }
        else{
            System.out.println("The list is not sorted");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Determines if list is sorted in decreasing order
     * @param list List of integers
     * @return True if list is already sorted, otherwise false
     */
    public static boolean isSorted(int[] list){
        boolean isSorted = true;

        for(int i = 0; i < list.length - 1; i++){
            // If an element is smaller than the next element, the list is not sorted
            if(list[i] < list[i + 1]){
                return false;
            }
        }

        return isSorted;
    }
}
