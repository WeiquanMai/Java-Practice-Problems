/**
 * @author Weiquan Mai
 * Problem 8.34
 * (Geometry: rightmost lowest point)
 * In computational geometry, often you need to find the rightmost lowest point in a set of points.
 * Write the following method that returns the rightmostl owets point in a set of points:
 * public static double[] getRightmostLowestPoint(double[][] points)
 *
 * Write a test program that prompts the user to enter the coordinates of six points
 * and displays the rightmost lowest point.
 */

import java.util.Scanner;

public class Exercise08_34 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double[][] points = new double[6][2];

        // Prompt user to enter 6 points
        System.out.print("Enter 6 points: ");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Call getRightmostLowestPoint and display result
        double[] result = getRightmostLowestPoint(points);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)", result[0], result[1]);

        // Close Scanner
        input.close();
    }

    /**
     * Determines the rightmost lowest point in a two-dimensional array of points
     * @param points Two-dimensional array representing pair of points
     * @return rightmost lowest point
     */
    public static double[] getRightmostLowestPoint(double[][] points){
        // Find lowest point
        double lowestPoint = points[0][1];
        int lowestPointIndex = 0;

        for(int i = 0; i < points.length; i++){
            // If a point is lower than lowest point, update lowest point and index
            if(points[i][1] < lowestPoint){
                lowestPoint = points[i][1];
                lowestPointIndex = i;
            }
            // If the points are the same low, find the one that is rightmost
            else if(points[i][1] == lowestPoint){
                if(points[i][0] > points[lowestPointIndex][0]){
                    lowestPointIndex = i;
                }
            }
        }

        return new double[] {points[lowestPointIndex][0], points[lowestPointIndex][1]};
    }
}
