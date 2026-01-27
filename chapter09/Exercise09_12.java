/**
 * @author Weiquan Mai
 * Problem 9.12
 * (Geometry: intersecting point)
 * Suppose to line segments intersect.
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2)
 * and for the second line segment are (x3, y3), and (x4, y4).
 * Write a program that prompts the user to enter these four endpoints
 * and displays the intersecting point.
 * As discussed in Programming Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this equation.
 * See Programming Exercise 3.25 for sample runs.
 */

import java.util.Scanner;

public class Exercise09_12 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter four endpoints
        System.out.print("Enter x1, y1, x2, y2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter x3, y3, x4, y4: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate intersection point
        double a = y1 - y2;
        double b = x2 - x1;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double c = y3 - y4;
        double d = x4 - x3;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        // Create a LinearEquation object and display intersecting point
        LinearEquation linearEquation1 = new LinearEquation(a, b, c, d, e, f);
        if(linearEquation1.isSolvable()){
            System.out.printf("The intersecting point is at (%.2f, %.2f)\n", linearEquation1.getX(), linearEquation1.getY());
        }
        else{
            System.out.println("The two lines are parallel");
        }

        // Close Scanner
        input.close();
    }
}
