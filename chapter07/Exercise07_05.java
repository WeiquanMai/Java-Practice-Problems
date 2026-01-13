/**
 * @author Weiquan Mai
 * Problem 7.5
 * (The number of even numbers and odd numbers)
 * Write a program that reads ten integers,
 * and then displays the number of even numbers and odd numbers.
 * Assume that the input ends with 0.
 */
import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int[] array = new int[100];
        int counter = 0;
        int numberOfEven = 0;
        int numberOfOdd = 0;

        // Prompt user to enter numbers
        System.out.print("Enter 10 numbers (end input with 0): ");
        int number = input.nextInt();

        // Input ends with 0
        while(number != 0){
            array[counter] = number;
            counter++;
            number = input.nextInt();
        }

        // Determine number of even and number of odd
        for(int i = 0; i < counter; i++){
            if(array[i] % 2 == 0){
                numberOfEven++;
            }
            else{
                numberOfOdd++;
            }
        }

        // Display result
        System.out.println("The number of odd numbers: " + numberOfOdd);
        System.out.println("The number of even numbers: " + numberOfEven);

        // Close Scanner
        input.close();
    }
}
