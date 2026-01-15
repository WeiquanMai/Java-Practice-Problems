/**
 * @author Weiquan Mai
 * Problem 7.30
 * (Pattern recognition: consecutive four equal numbers)
 * Write the following method that tests whether the array
 * has four consecutive numbers with the same value:
 * public static boolean isConsecutiveFour(int[] values)
 *
 * Write a test program that prompts the user to enter a series of integers
 * and displays it if the series contains four consecutive numbers with the same value.
 * Your program should first prompt the user to enter the input size
 * i.e., the number of values in the series.
 */

import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of values
        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        // Prompt user to enter values
        System.out.print("Enter the values: ");
        int[] list = new int[numberOfValues];
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }

        // Call method and display results
        if(isConsecutiveFour(list)){
            System.out.println("The list has consecutive fours");
        }
        else{
            System.out.println("The list has no consecutive fours");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Iterates through list of values and determines if there are four consecutive values in the list
     * @param values List to iterate through
     * @return True if there are four consecutive numbers of same value, otherwise false
     */
    public static boolean isConsecutiveFour(int[] values){
        // If list has less than four values, it cannot have four consecutive numbers
        if(values.length < 4){
            return false;
        }

        int counter = 0;
        int maxCounter = 0;
        for(int i = 0; i < values.length - 1; i++){
            // If values are the same, increment counter
            if(values[i + 1] == values[i]){
                counter++;
                if(counter > maxCounter){
                    maxCounter = counter;
                }
            }

            // If values are different, reset counter
            else{
                counter = 0;
            }
        }

        // If there are equal to or more than 3 pairs of same numbers, return true
        if(maxCounter >= 3){
            return true;
        }
        else{
            return false;
        }
    }
}
