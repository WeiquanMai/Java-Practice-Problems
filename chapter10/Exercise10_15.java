/**
 * @author Weiquan Mai
 * Problem 10.15
 * (Geometry: the bounding rectangle)
 * A bounding rectangle is the minimum rectangle that encloses a set of points
 * in a two-dimensional plane, as shown in 10.24d.
 * Write a method that returns a bounding rectangle for a set of points
 * in a two-dimensional plane, as follows:
 * public static MyRectangle2D getRectangle(double[][] points)
 *
 * The Rectangle2D class is defined in Programming Exercise 10.13.
 * Write a test program that prompts the user to enter five points
 * and displays the bounding rectangle's center, width, and height.
 */

import java.util.Scanner;

public class Exercise10_15 {
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

        // Call getRectangle method and display result
        MyRectangle2D rectangle2D = getRectangle(points);
        System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.1f, %.1f",
                rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());

        // Close Scanner
        input.close();
    }

    public static MyRectangle2D getRectangle(double[][] points){
        // If there is only one point, then simply enclose that one point
        if(points.length == 1){
            return new MyRectangle2D(points[0][0], points[0][1], 1, 1);
        }
        // If there's more than one point, then find the min and max for width and height
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for(int i = 0; i < points.length; i++){
            if(points[i][0] < minX){
                minX = points[i][0];
            }
            else if(points[i][0] > maxX){
                maxX = points[i][0];
            }

            if(points[i][1] < minY){
                minY = points[i][1];
            }
            else if(points[i][1] > maxY){
                maxY = points[i][1];
            }
        }

        // Calculate center
        double width = Math.abs(maxX - minX);
        double height = Math.abs(maxY - minY);
        double centerX = (width / 2.0) + minX;
        double centerY = (height / 2.0) + minY;

        return new MyRectangle2D(centerX, centerY, width, height);
    }
}
