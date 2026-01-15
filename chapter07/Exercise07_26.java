/**
 * @author Weiquan Mai
 * Problem 7.26
 * (Check whether array is sorted)
 * An array list is required to be sorted in ascending order.
 * Write a method that returns true if list is sorted, using the following header:
 * public static boolean isSorted(int[] list)
 *
 * Write a test program that prompts the user to enter a list of integers.
 * Note the first number in the input indicates the number of elements in the list.
 */

import java.util.Scanner;
public class Exercise07_26 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter list of integers
        System.out.print("Enter list: ");
        int numberOfInputs = input.nextInt();
        int[] array = new int[numberOfInputs];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        // Call method and display result
        boolean isSorted = isSorted(array);
        if(isSorted){
            System.out.println("The list is sorted");
        }
        else{
            System.out.println("The list is not sorted");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Iterates through length of list and determines if the list is sorted in ascending order
     * @param list List to iterate through
     * @return True if list is sorted in ascending order, otherwise false
     */
    public static boolean isSorted(int[] list){
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i + 1]){
                return false;
            }
        }
        return true;
    }
}
