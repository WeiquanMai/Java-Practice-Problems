/**
 * @author Weiquan Mai
 * Problem 11.13
 * (Remove duplicates)
 * Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 *
 * Write a test program that prompts the user to enter 10 integers to a list
 * and displays the distinct integers in their input order
 * and separated by exactly one space.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_13 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt user to enter 10 integers
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }

        // Call removeDuplicate method and display result
        removeDuplicate(list);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Removes duplicates from arraylist
     * @param list ArrayList
     */
    public static void removeDuplicate(ArrayList<Integer> list){
        // Create a temp list
        ArrayList<Integer> temp = new ArrayList<>();

        // Iterate through ArrayList twice
        for(int i = 0; i < list.size(); i++){
            // If temp doesn't contain the value, add it to temp
            if(!temp.contains(list.get(i))){
                temp.add(list.get(i));
            }
            else{
                continue;
            }
        }

        // Clear list and set it to temp
        list.clear();
        list.addAll(temp);
    }
}
