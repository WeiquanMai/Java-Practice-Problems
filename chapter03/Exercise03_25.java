/**
 * @Author Weiquan Mai
 * Problem 3.25
 * (Geometry: intersecting point)
 * Two points on line 1 are given as (x1, y1) and (x2, y2)
 * and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
 * The intersecting point of the two lines can be found by solving the following linear equations:
 *  (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 *  This linear equation can be solved using Cramer's rule (see programming exercise 3.3).
 *  If the equation has no solutions, the two lines are parallel.
 *  Write a program that prompts the user to enter four points,
 *  and displays the intersecting point.
 */

import java.util.Scanner;

public class Exercise03_25 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input four points
        System.out.println("Enter coordinates for four points.");
        System.out.print("Point 1: (x1, y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Point 2: (x2, y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Point 3: (x3, y3):");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Point 4: (x4, y4):");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate intersection point
        double a = y1 - y2;
        double b = x1 - x2;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double c = y3 - y4;
        double d = x3 - x4;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        // Calculate x and y
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        // Calculate determinant
        double determinant = (a * d) - (b * c);

        // Display result
        if(determinant == 0){
            System.out.println("The two lines are parallel");
        }
        else{
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }

        // Close Scanner
        input.close();
    }
}
