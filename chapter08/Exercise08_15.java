/**
 * @author Weiquan Mai
 * Problem 8.15
 * (Geometry: same line?)
 * Programming Exercise 6.39 gives a method for testing whether three points are on the same line.
 * Write the following method to test whether all the points in the array points are on the same line:
 * public static boolean sameLine(double[][] points)
 *
 * Write a program that prompts the user to enter five points
 * and displays whether they are on the same line.
 */

import java.util.Scanner;

public class Exercise08_15 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter five points
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Call sameLine method to determine if the five points are on the same line
        if(sameLine(points)){
            System.out.println("The five points are on the same line");
        }
        else{
            System.out.println("The five points are not on the same line");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Determines if the 5 points that are represented by a two-dimensional array are on the same line
     * @param points Two-dimensional array representing five points
     * @return True if all five points are on the same line, otherwise false
     */
    public static boolean sameLine(double[][] points){
        // Iterate through the remaining points to determine if they are on the same line
        for(int i = 2; i < points.length; i++){
            double crossProduct = ((points[1][0] - points[0][0]) * (points[i][1] - points[0][1])
                    - (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]));
            if(crossProduct != 0){
                return false;
            }
        }

        return true;
    }
}
