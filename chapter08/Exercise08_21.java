/**
 * @author Weiquan Mai
 * Problem 8.21
 * (Central city)
 * Given a set of cities, the central city is the city that has the shortest
 * total distance to all other cities.
 * Write a program that prompts the user to enter the number of cities
 * and the locations of the cities (coordinates),
 * and finds the central city and its total distance to all other cities.
 */

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter number of cities
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        // Prompt to enter coordinates
        System.out.println("Enter the coordinates of the cities: ");
        double[][] cities = new double[numberOfCities][2];
        for(int i = 0; i < cities.length; i++){
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        // Call centerPoint method and display result
        int minRow = centerPoint(cities);
        System.out.printf("The central city is at (%.2f, %.2f)\n", cities[minRow][0], cities[minRow][1]);

        // Call total distance method and display result
        System.out.printf("The total distance to all other cities is %.2f", totalDistance(cities, minRow));

        // Close Scanner
        input.close();
    }

    /**
     * Returns the row with the pair of points that has minimum total distance to all other points
     * @param m Two-dimensional array
     * @return Row representing pair of points that has minimum total distance in the array
     */
    public static int centerPoint(double[][] m){
        // Variables
        int minRow = 0;
        double minDistance = totalDistance(m, 0);

        // Iterate through array and compare totalDistance
        for(int i = 1; i < m.length; i++){
            // If new distance is less than minDistance, update minDistance and minRow
            double currentDistance = totalDistance(m, i);
            if(currentDistance < minDistance){
                minDistance = currentDistance;
                minRow = i;
            }
        }
        return minRow;
    }

    /**
     * Calculates and returns total distance from pair of points specified by row to remaining pairs of points in the array
     * @param m Two-dimensional array
     * @param row Row to calculate distance from
     * @return Total distance from pair of points in row to remaining pairs of points in 2d array
     */
    public static double totalDistance(double[][] m, int row){
        double accumulator = 0;

        for(int i = 0; i < m.length; i++){
            // distance = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
            accumulator += Math.sqrt((Math.pow(m[i][0] - m[row][0], 2) + Math.pow(m[i][1] - m[row][1], 2)));
        }

        return accumulator;
    }
}
