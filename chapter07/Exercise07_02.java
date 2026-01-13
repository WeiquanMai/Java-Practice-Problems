/**
 * @author Weiquan Mai
 * Problem 7.2
 * (Comparing numbers)
 * Write a program that reads 11 integers,
 * compares each integer with the 11th integer,
 * and displays whether the integers are "greater", "smaller", or "equal" to the 11th integer.
 */

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 11 integers and create array
        System.out.print("Enter 11 integers: ");
        int[] numbers = new int[11];

        // Populate array
        for(int i = 0; i < 11; i++){
            numbers[i] = input.nextInt();
        }

        // Compare each integer with the 11th integer, and display result
        for(int i = 0; i < 10; i++){
            if(numbers[i] < numbers[10]){
                System.out.println(numbers[i] + " is smaller than " + numbers[10]);
            }
            else if(numbers[i] > numbers[10]){
                System.out.println(numbers[i] + " is greater than " + numbers[10]);
            }
            else{
                System.out.println(numbers[i] + " is equal to " + numbers[10]);
            }
        }

        // Close Scanner
        input.close();
    }
}
