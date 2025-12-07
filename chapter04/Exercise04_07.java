/**
 * @Author Weiquan Mai
 * Problem 4.7
 * (Corner point coordinates)
 * Suppose a pentagon is centered at (0, 0) with one point at the 0 o'clock position,
 * as shown in Figure 4.4c.
 * Write a program that prompts the user to enter the radius of the bounding circle of a pentagon
 * and displays the coordinates of the five corner points on the pentagon from p1 to p5 in order.
 * Use console format to display two digits after the decimal point.
 */

import java.util.Scanner;
public class Exercise04_07 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for radius of bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // Calculate angles of pentagon
        double pentagonAngleOffset = (Math.PI * 2) / 5;
        double p1Angle = (Math.PI / 2) - pentagonAngleOffset;
        double p2Angle = (Math.PI / 2);
        double p3Angle = p2Angle + pentagonAngleOffset;
        double p4Angle = p3Angle + pentagonAngleOffset;
        double p5Angle = p4Angle + pentagonAngleOffset;

        // Calculate positions
        double x1 = radius * Math.cos(p1Angle);
        double y1 = radius * Math.sin(p1Angle);
        double x2 = radius * Math.cos(p2Angle);
        double y2 = radius * Math.sin(p2Angle);
        double x3 = radius * Math.cos(p3Angle);
        double y3 = radius * Math.sin(p3Angle);
        double x4 = radius * Math.cos(p4Angle);
        double y4 = radius * Math.sin(p4Angle);
        double x5 = radius * Math.cos(p5Angle);
        double y5 = radius * Math.sin(p5Angle);

        // Display results
        System.out.println("The coordinates of five points on the pentagon are: ");
        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)\n", x5, y5);

        // Close Scanner
        input.close();
    }
}
