/*
    Problem 11.4

    Write the following method that returns the maximum value in an ArrayList of integers.
    The method returns null if the list is null or the list size is 0.

    public static Integer max(ArrayList<Integer> list)

    Write a test program that prompts the user to enter a sequence of numbers ending with 0,
    and invokes this method to return the largest number in the input.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        boolean keepRunning = true;
        System.out.println("Enter a sequence of values ending with 0.");

        while(keepRunning){
            System.out.print("Enter a value: ");
            int integer = input.nextInt();

            if(integer == 0){
                keepRunning = false;
            }
            else{
                list.add(integer);
            }
        }

        System.out.println("Max value: " + max(list));

        // Close scanner
        input.close();
    }

    public static Integer max(ArrayList<Integer> list){
        // If list is empty, return null
        if(list == null || list.isEmpty()){
            return null;
        }

        // set maxNumber equal to first number
        int maxNumber = list.get(0);

        // Loop through the list
        for(int i = 0; i < list.size(); i++){
            //check if the value is larger than current max
            if(list.get(i) > maxNumber){
                // If value is larger, set the value as max
                maxNumber = list.get(i);
            }
        }

        return maxNumber;
    }
}
