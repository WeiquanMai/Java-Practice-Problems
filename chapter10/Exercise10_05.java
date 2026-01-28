/**
 * @author Weiquan Mai
 * Problem 10.5
 * (Display the prime factors)
 * Write a program that prompts the user to enter a positive integer
 * amd displays all its smallest factors in decreasing order.
 * For example, if the integer is 120, the smallest factors are displayed
 * as 5, 3, 2, 2, 2.
 * Use the StackOfIntegersclass to store the factors (e.g., 2, 2, 2, 3, 5)
 * and retrieve and display them in reverse order.
 */
import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        StackOfIntegers stack = new StackOfIntegers();

        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Input validation
        while(number < 0){
            System.out.print("Please enter a positive integer: ");
            number = input.nextInt();
        }

        // Determine if number is a factor
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                // If number is a factor, add it to stack
                stack.push(i);
                number = number / i;

                // Reset iteration start point
                i = 1;
            }
        }

        // Display result from stack
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }

        // Close Scanner
        input.close();
    }
}
