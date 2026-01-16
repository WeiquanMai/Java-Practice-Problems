/**
 * @author Weiquan Mai
 * Problem 7.32
 * (Partition of a list)
 * Write the following method that partitions the list using the first element,
 * called a pivot:
 * public static int partition(int[] list)
 *
 * After the partition, the elements in the list are rearranged so all the elements
 * before the pivot are less than or equal to the pivot, and all the elements after the pivot
 * are greater than the pivot.
 * The method returns the index where the pivot is located in the new list.
 * For example, suppose the list is {5, 2, 9, 3, 6, 8}.
 * After the partition, the list becomes {3, 2, 5, 9, 6, 8}.
 * Write a test program that prompts the user to enter the size of the list
 * and the contents of the list, and displays the list after the partition.
 */

import java.util.Scanner;

public class Exercise07_32 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter list size
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        int[] list = new int[size];

        // Prompt user to enter list content
        System.out.print("Enter list content: ");
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }

        // Call partition method and display result
        int partitionedIndex = partition(list);
        System.out.print("After the partiton, the list is ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Partitions the list based on pivot into a part that's lower than or equal to pivot, and a part that's higher than pivot
     * @param list List to sort
     * @return Sorted list based on pivot
     */
    public static int partition(int[] list){
        // Variables
        int low = 1;
        int high = list.length - 1;
        int pivot = list[0];

        // Iterate through list while high is greater than low
        while(high > low){
            // If low is less than pivot, iterate low pointer
            if(list[low] < pivot){
                low++;
            }
            // Else low is greater than pivot, and should look to swap
            else{
                // If high is less than pivot, swap low and high
                if(list[high] < pivot){
                    int temp = list[low];
                    list[low] = list[high];
                    list[high] = temp;
                }
                // Else look for next high element
                else{
                    high--;
                }
            }
        }

        // Finally, swap pivot element with low - 1
        int temp = list[low - 1];
        list[low - 1] = list[0];
        list[0] = temp;

        return low - 1;
    }
}
