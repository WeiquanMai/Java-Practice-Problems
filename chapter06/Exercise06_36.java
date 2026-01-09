/**
 * @author Weiquan Mai
 * Problem 6.36
 * (Geometry: area of a regular polygon)
 * A regular polygon is an n-sided polygon in which all sides are of the same length
 * and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 * The formula for computing the area of a regular polygon is
 * Area = n X s^2 / 4 x tan( PI / n)
 *
 * Write a method that returns the area of regular polygon using the following header:
 * public static double area (int n, double side)
 *
 * Write a main method that prompts the user to enter the number of sides
 * and the side of a regular polygon and displays its area.
 */
import java.util.Scanner;

public class Exercise06_36 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of sides and length of side
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Call method to calculate area and display result
        System.out.println("The area of the polygon is " + area(n, side));

        // Close Scanner
        input.close();
    }

    /**
     * Returns the area of an n-sided polygon
     * @param n Number of sides of polygon
     * @param side Length of each side
     * @return Area of an n-sided polygon with length side
     */
    public static double area(int n, double side){
        return (n * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI / n));
    }
}
