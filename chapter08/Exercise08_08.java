/**
 * @author Weiquan Mai
 * Problem 8.8
 * (All closest pairs of points)
 * Revise Listing 8.3, FindNearestPoints.java,
 * to display all closest pairs of points with the same minimum distance.
 */

import java.util.Scanner;

public class Exercise08_08 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter points
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Initialize shortestDistance
        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]);

        //Find shortestDistance
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);

                if(distance < shortestDistance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }

        // Display all closest pairs with same minimum distance
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if(distance == shortestDistance){
                    System.out.printf("The closest two points are (%.1f, %.1f), and (%.1f, %.1f)\n",
                            points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);

        // Close Scanner
        input.close();
    }

    /** Compute the distance between two points (x1, y1) and (x2, y2)*/
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
