/**
 * @author Weiquan Mai
 * Problem 6.39
 * (Geometry: point position)
 * Programming Exercise 3.32 shows how to test whether a point
 * is on the left side of a directed line, on the right, or on the same line.
 * Write the methods with the following headers:
 *
 * /* Return true if point (x2, y2) is on the left side of the
 * directed line from (x0, y0) to (x1, y1) *
 * public static boolean leftOfTheLine(double x0, double y0,
 * double x1, double y1, double x2, double y2)
 *
 * /* Return true if point (x2, y2) is on the same
 * line from (x0, y0) to (x1, y1) *
 * public static boolean onTheSameLine(double x0, double y0,
 * double x1, double y1, double x2, double y2)
 *
 * /* Return true if point (x2, y2) is on the
 * line segment from (x0, y0) to (x1, y1) *
 * public static boolean onTheLineSegment(double x0, double y0
 * double x1, double y1, double x2, double y2)
 *
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left side of the line from p0 to p1, right side,
 * the same line, or on the line segment.
 */

import java.util.Scanner;
public class Exercise06_39 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        /*
        Determine if p2 is on the left of the line from p0 to p1,
        right side, same line, or on the line
         */
        if(leftOfTheLine(x0, y0, x1, y1, x2, y2)){
            System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
        else if(rightOfTheLine(x0, y0, x1, y1, x2, y2)){
            System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
        else if(onTheLineSegment(x0, y0, x1, y1, x2, y2)){
            System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
        else if(onTheSameLine(x0, y0, x1, y1, x2, y2)){
            System.out.printf("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
        else{
            System.out.printf("(%.1f, %.1f) is not on the same line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }

        // Close Scanner
        input.close();
    }

    /** Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double crossProduct = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        return crossProduct > 0;
    }

    /** Return true if point (x2, y2) is on the right side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double crossProduct = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        return crossProduct < 0;
    }

    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double crossProduct = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        return crossProduct == 0;
    }

    /** Return true if point (x2, y2) is on the
     * line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1, double x2, double y2){
        double crossProduct = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));

        if(crossProduct != 0){
            return false;
        }

        if((x2 >= Math.min(x0, x1) && (x2 <= Math.max(x0, x1))
        && (y2 >= Math.min(y0, y1)) && (y2 <= Math.max(y0, y1)))){
            return true;
        }
        return false;
    }
}
