/**
 * @Author Weiquan Mai
 * Problem 2.2
 * (Compute the volume of a triangle)
 * Write a program that reads in the length of sides of an equilateral triangle
 * and computes the area and volume.
 */
import java.util.Scanner;
public class Exercise02_02 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the length of the sides of the Equilateral triangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the height of the Equilateral triangle: ");
        double height = input.nextDouble();

        // Calculate Area and Volume
        double area = ((Math.pow(3, 0.5)) / 4) * (Math.pow(length, 2));
        double volume = area * height;

        // Display the results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        // Close scanner
        input.close();
    }
}
