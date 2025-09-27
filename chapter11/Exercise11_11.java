/*
    Problem 11.11

    Write the following method that sorts an ArrayList of numbers:
    public static void sort(ArrayList<Integer> list)

    Write a test program that prompts the user to enter five numbers,
    stores them in an array list, and displays them in increasing order.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_11 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt user to enter five integers and store them in an array list
        System.out.print("Enter five integers: ");
        for(int i = 0; i < 5; i++){
            list.add(input.nextInt());
        }

        // Sort the list
        sort(list);

        // Display the list
        System.out.println(list);

        // Close a scanner
        input.close();
    }

    public static void sort(ArrayList<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = 0; j < list.size() - 1 - i; j++){
                if(list.get(j) > list.get(j + 1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
