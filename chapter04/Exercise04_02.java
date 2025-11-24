/**
 * @Author Weiquan Mai
 * Problem 4.2
 * (Geometry: great circle distance)
 * The great circle distance is the distance between two points on the surface of a sphere.
 * Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
 * The great circle distance between the two points can be computed using the following formula:
 * d = radius X arccos(sin(x1) X sin(x2) + cos(x1) X cos(x2) X cos(y1 - y2))
 *
 * Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees
 * and displays its great circle distance.
 * The average radius of the earth is 6,371.01km.
 * Note you need to convert the degrees to radians using Math.toRadians method since the
 * Java trigonometric methods use radians.
 * The latitude and longitude degrees in the formula are for north and west.
 * Use negative to indicate south and east degrees.
 */
import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for two points
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate great circle distance
        double radianx1 = Math.toRadians(x1);
        double radiany1 = Math.toRadians(y1);
        double radianx2 = Math.toRadians(x2);
        double radiany2 = Math.toRadians(y2);
        double EARTH_RADIUS = 6371.01;
        double greatCircleDistance = EARTH_RADIUS * Math.acos(Math.sin(radianx1) * Math.sin(radianx2)
                                    + Math.cos(radianx1) * Math.cos(radianx2) * Math.cos(radiany1 - radiany2));

        // Display great circle distance
        System.out.println("The distance between the two points is " + greatCircleDistance + "km");

        // Close Scanner
        input.close();
    }
}
