/**
 * @author Weiquan Mai
 * Problem 7.3
 * (Count occurrence of numbers)
 * Write a program that reads the integers between 1 and 50
 * and counts the occurrences of each. Assume the input ends with 0.
 */

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int[] numbers = new int[51];

        // Prompt user to enter integers between 0 and 50
        System.out.print("Enter the integers between 1 and 50: ");
        int integer = input.nextInt();

        // Input ends with 0
        while(integer != 0){
            numbers[integer]++;
            integer = input.nextInt();
        }

        // Display result
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                if(numbers[i] > 1){
                    System.out.println(i + " occurs " + numbers[i] + " times");
                }
                else{
                    System.out.println(i + " occurs " + numbers[i] + " time");
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
