/**
 * @Author Weiquan Mai
 * Problem 3.19
 * (Compute the perimeter of a triangle)
 * Write a program that reads three edges for a triangle, and computes the perimeter if the input is valid.
 * Otherwise, display that the input is invalid.
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */

import java.util.Scanner;

public class Exercise03_19 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter three edges of triangle
        System.out.print("Enter length of three sides of triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        // Determine if input is valid
        boolean valid = (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
        double perimeter = s1 + s2 + s3;

        // Display result
        if(valid){
            System.out.println("Perimeter of triangle is " + perimeter);
        }
        else{
            System.out.println("Input is invalid");
        }

        // Close Scanner
        input.close();
    }
}
