/**
 * @Author Weiquan Mai
 * Problem 3.26
 * (Use the &&, ||, and ^ operator)
 * Write a program that prompts the user to enter an integer and determines
 * whether it is divisible by 4 and 5,
 * whether it is divisible by 4 or 5,
 * and whether it is divisible by 4 or 5, but not both.
 */
import java.util.Scanner;

public class Exercise03_26 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input integer
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        // Determine if integer is divisible by 4 and 5
        System.out.print("Is " + integer + " divisible by 4 and 5? ");
        System.out.println((integer % 4 == 0) && (integer % 5 == 0));

        // Determine if integer is divisible by 4 or 5
        System.out.print("Is " + integer + " divisible by 4 or 5? ");
        System.out.println((integer % 4 == 0 || integer % 5 == 0));

        // Determine if integer is divisible by 4 or 5, but not both
        System.out.print("Is " + integer + " divisible by 4 or 5 but not both? ");
        System.out.println((integer % 4 == 0 ^ integer % 5 == 0));

        // Close Scanner
        input.close();
    }
}
