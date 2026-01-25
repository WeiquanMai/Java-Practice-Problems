/**
 * @author Weiquan Mai
 * Problem 8.31
 * (Geometry: intersecting point)
 * Write a method that returns the intersecting point of two lines.
 * The intersecting point of the two lines can be found by using the formula
 * given in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2)
 * are the two points on line 1 and (x3, y3) and (x4, y4) are on line 2.
 * The method header is:
 * public static double[] getIntersectingPoint(double[][] points)
 *
 * The points are stored in a 4-by-2 two-dimensional array points
 * with (points[0][0], points[0][1]) for (x1, y1).
 * The method returns the intersecting point or null if the two lines are parallel.
 * Write a program that prompts the user to enter four points
 * and displays the intersecting point.
 */

import java.util.Scanner;

public class Exercise08_31 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double[][] points = new double [4][2];

        // Prompt user to enter four points
        System.out.println("Enter coordinates for four points: ");
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = input.nextDouble();
            }
        }

        // Call getIntersectingPoint method and display result
        if(getIntersectingPoint(points) == null){
            System.out.println("The two lines are parallel");
        }
        else{
            double[] result = getIntersectingPoint(points);
            System.out.printf("The intersecting point is at (%.1f, %.1f", result[0], result[1]);
        }

        // Close Scanner
        input.close();
    }

    public static double[] getIntersectingPoint(double[][] points){
        // Calculate intersecting point
        // (points[0][0], points[0][1]) for (x1, y1)
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);
        double f = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);

        // Calculate determinant
        double determinant = (a * d) - (b * c);

        if(determinant == 0){
            return null;
        }
        else{
            // Calculate x and y
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            return new double[]{x, y};
        }

    }
}
