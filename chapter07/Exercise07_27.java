/**
 * @author Weiquan Mai
 * Problem 7.27
 * (Check whether the array is sorted with constant interval)
 * An array list is sorted with a constant interval if its elements are arranged
 * in an ascending order and there is a constant difference between adjacent elements.
 * Write a method that returns true if list is sorted with a constant interval,
 * using the following header:
 * public static boolean isSortedConstantInterval(int[] list)
 *
 * Write a test program that prompts the user to enter a list of integers.
 * Note the first number in the input indicates the number of elements in the list.
 */
import java.util.Scanner;

public class Exercise07_27 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter list of integers
        System.out.print("Enter list: ");
        int numberOfInputs = input.nextInt();
        int[] list = new int[numberOfInputs];
        for(int i = 0 ; i < list.length; i++){
            list[i] = input.nextInt();
        }

        // Call method and display result
        if(isSortedConstantInterval(list)){
            System.out.println("The list is sorted with a constant interval");
        }
        else{
            System.out.println("The list is not sorted with a constant interval");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Iterates through the list and determines if the list is sorted with a constant interval in ascending order
     * @param list List to iterate through
     * @return True if list is sorted with constant interval in ascending order, otherwise false
     */
    public static boolean isSortedConstantInterval(int[] list){
        if(list.length < 2){
            return false;
        }
        int constantInterval = list[1] - list[0];

        if(constantInterval < 0){
            return false;
        }

        for(int i = 0; i < list.length - 1; i++){
            if(list[i + 1] - list[i] != constantInterval){
                return false;
            }
        }

        return true;
    }
}
