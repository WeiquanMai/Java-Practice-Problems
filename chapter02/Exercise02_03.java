/**
 * @Author Weiquan Mai
 * Problem 2.3
 * (Convert meters into feet)
 * Write a program that reads a number in meters, converts it to feet,
 * and display the result
 */
import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a value for meter: ");
        double meter = input.nextDouble();

        // Convert meter to feet
        double feet = meter * 3.2786;

        // Display the result
        System.out.println(meter + " meters is " + feet + " feet");

        // Close scanner
        input.close();
    }
}
