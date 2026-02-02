/**
 * @author Weiquan Mai
 * Problem 11.15
 * (Area of a convex polygon)
 * A polygon is convex if it contains any line segments that connects two points of the polygon.
 * Write a program that prompts the user to enter the number of points in a convex polygon,
 * enter the points clockwise,then displays the area of the polygon.
 */

import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of points
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter the coordinates of the points: ");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Call areaConvexPolygon and display result
        System.out.println("The total area is " + areaConvexPolygon(points));

        // Close Scanner
        input.close();
    }

    /**
     * Calculates area of convex polygon using Shoelace Formula
     * @param points Two-dimensional array representing points
     * @return Area of polygon created by points
     */
    public static double areaConvexPolygon(double[][] points){
        // Variable
        double accumulator = 0;

        // Copy points array to temp
        double[][] temp = new double[points.length + 1][2];
        for(int i = 0; i < points.length; i++){
            temp[i][0] = points[i][0];
            temp[i][1] = points[i][1];
        }
        
        // Copy first point again for wrap around
        temp[temp.length - 1][0] = points[0][0];
        temp[temp.length - 1][1] = points[0][1];
        
        // Calculate accumulator
        for(int i = 0; i < temp.length - 1; i++){
            accumulator += (temp[i][0] * temp[i + 1][1]) - (temp[i + 1][0] * temp[i][1]);
        }
        
        // Calculate and return area
        return (0.5 * (Math.abs(accumulator)));
    }
}
