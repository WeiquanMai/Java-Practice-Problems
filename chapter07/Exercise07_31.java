/**
 * @author Weiquan Mai
 * Problem 7.31
 * (Merge two sorted lists)
 * Write the following method that merges two sorted lists into a new sorted list:
 * public static int[] merge(int[] list1, int[] list2)
 * Implement the method in a way that takes at most list1.length + list2.length comparisons.
 * Write a test program that prompts the user to enter two sorted lists,
 * and displays the merged list.
 * Note the first number in the input indicates the number of elements in the list.
 */
import java.util.Scanner;

public class Exercise07_31 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter list1 size and contents
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }

        // Prompt user to enter list2 size and contents
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }

        // Display input for list1 and list2
        System.out.print("list1 is ");
        for(int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        System.out.print("list2 is ");
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println();

        // Call merge method and display result
        int[] mergedList = merge(list1, list2);
        System.out.print("The merged list is ");
        for(int i = 0; i < mergedList.length; i++){
            System.out.print(mergedList[i] + " ");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Merge two sorted lists into a new ascending sorted list
     * @param list1 First sorted list
     * @param list2 Second sorted list
     * @return Combined sorted list
     */
    public static int[] merge(int[] list1, int[] list2){
        // Variables
        int list1Pointer = 0;
        int list2Pointer = 0;
        int resultPointer = 0;
        int[] result = new int[(list1.length + list2.length)];
        
        // Iterate until result list is filled up
        while(resultPointer < result.length){
            while(list1Pointer < list1.length && list2Pointer < list2.length){
                // Add the smaller element between list1 and list2
                if(list1[list1Pointer] < list2[list2Pointer]){
                    result[resultPointer] = list1[list1Pointer];
                    list1Pointer++;
                }
                else{
                    result[resultPointer] = list2[list2Pointer];
                    list2Pointer++;
                }
                resultPointer++;
            }
            
            // Add remaining elements from list1 or list2
            while(list1Pointer < list1.length){
                result[resultPointer] = list1[list1Pointer];
                list1Pointer++;
                resultPointer++;
            }

            while(list2Pointer < list2.length){
                result[resultPointer] = list2[list2Pointer];
                list2Pointer++;
                resultPointer++;
            }
        }

        return result;
    }
}
