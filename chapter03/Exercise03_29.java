/**
 * @Author Weiquan Mai
 * Problem 3.29
 * (Geometry: two circles)
 * Write a program that prompts the user to enter the center coordinates and radii of two circles
 * and determines whether the second circle is inside the first or overlaps with the first.
 */

import java.util.Scanner;

public class Exercise03_29 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user for information about two circles
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        // Calculate distance between two centers
        double distance = Math.pow((Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2)), 0.5);

        // Determine if circle2 is inside, overlaps, or does not overlap circle1
        if(distance <= radius1 - radius2){
            System.out.println("circle 2 is inside circle1");
        }
        else if(distance <= radius1 + radius2){
            System.out.println("circle2 overlaps circle1");
        }
        else{
            System.out.println("circle2 does not overlap circle1");
        }

        // Close Scanner
        input.close();
    }
}
