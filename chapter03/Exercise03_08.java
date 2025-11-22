/**
 * @Author Weiquan Mai
 * Problem 3.8
 * (Sort three integers)
 * Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three integers
        System.out.print("Enter three integers: ");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(input.nextInt());
        arr.add(input.nextInt());
        arr.add(input.nextInt());

        // Sort integers
        Collections.sort(arr);

        // Display integers in non-decreasing order
        System.out.println(arr);

        // Close Scanner
        input.close();
    }
}
