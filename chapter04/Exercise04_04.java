/**
 * @Author Weiquan Mai
 * Problem 4.4
 * (Geometry: area of a hexagon)
 * The area of a hexagon can be computed using the following formula (s is the length of a side):
 * Area = 6 X s^2 / 4 X tan(PI/ 6)
 *
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 */

import java.util.Scanner;
public class Exercise04_04 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter length of side
        System.out.print("Enter length of side: ");
        double s = input.nextDouble();

        // Calculate area
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display area
        System.out.println("The area of the hexagon is " + area);

        // Close Scanner
        input.close();
    }
}
