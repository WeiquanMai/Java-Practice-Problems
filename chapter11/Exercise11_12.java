/*
    Problem 11.12
    
    Write the following method that returns the sum of all numbers in an ArrayList:
    public static double sum(ArrayList<Double> list)

    Write a test program that prompts the user to enter five numbers,
    stores them in an array list, and displays their sum
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_12 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        // Ask user for five numbers and store them in an array list
        System.out.print("Enter five numbers: ");
        for(int i = 0; i < 5; i++){
            list.add(input.nextDouble());
        }

        System.out.println("The sum is: " + sum(list));

        // Close scanner
        input.close();
    }

    public static double sum(ArrayList<Double> list){
        double accumulator = 0;

        for(int i = 0; i < list.size(); i++){
            accumulator += list.get(i);
        }

        return accumulator;
    }
}
