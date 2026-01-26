/**
 * @author Weiquan Mai
 * Problem 8.33
 * (Geometry: polygon subareas)
 * A convex four-vertex polygon is divided into four triangles, as shown in Figure 8.9.
 * Write a program that prompts the user to enter the coordinates of four vertices
 * and displays the areas of the four triangles in increasing order.
 */

import java.util.Scanner;

public class Exercise08_33 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double[][] points = new double[5][2];
        double[] triangleAreas = new double[4];

        // Prompt user to enter the four points
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for(int i = 0; i < 4; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Obtain intersecting point
        double[][] diagonalPoints = {points[0], points[2], points[1], points[3]};
        double[] intersectingPoint = getIntersectingPoint(diagonalPoints);
        points[4][0] = intersectingPoint[0];
        points[4][1] = intersectingPoint[1];

        // Obtain area of four triangles
        double[][] triangle0 = {{points[0][0], points[0][1]}, {points[1][0], points[1][1]},
                {points[4][0], points[4][1]}};
        double[][] triangle1 = {{points[1][0], points[1][1]}, {points[2][0], points[2][1]},
                {points[4][0], points[4][1]}};
        double[][] triangle2 = {{points[2][0], points[2][1]}, {points[3][0], points[3][1]},
                {points[4][0], points[4][1]}};
        double[][] triangle3 = {{points[3][0], points[3][1]}, {points[0][0], points[0][1]},
                {points[4][0], points[4][1]}};

        triangleAreas[0] = getTriangleArea(triangle0);
        triangleAreas[1] = getTriangleArea(triangle1);
        triangleAreas[2] = getTriangleArea(triangle2);
        triangleAreas[3] = getTriangleArea(triangle3);

        // Display triangles in increasing order
        java.util.Arrays.sort(triangleAreas);
        System.out.print("The areas are ");
        for(int i = 0; i < triangleAreas.length; i++){
            System.out.printf("%.2f ", triangleAreas[i]);
        }

        // Close Scanner
        input.close();
    }

    /**
     * Obtain the intersecting point between two lines
     * @param points Array of 4 by 2 two-dimensional array representing the four points of two lines
     * @return Intersecting point of the two lines, or null if the two lines are parallel
     */
    public static double[] getIntersectingPoint(double[][] points){
        // Calculate intersecting point
        // (points[0][0], points[0][1]) for (x1, y1)
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);
        double f = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);

        // Calculate determinant
        double determinant = (a * d) - (b * c);

        if(determinant == 0){
            return null;
        }
        else{
            // Calculate x and y
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((e * c) - (a * f)) / ((a * d) - (b * c));
            return new double[]{x, y};
        }
    }

    /**
     * Calculates area of triangle that is denoted by 3 points
     * @param points Two-dimensional array representing the three points of a triangle
     * @return Area of a triangle, or 0 if all 3 points are on the same line
     */
    public static double getTriangleArea(double[][] points){
        // Obtain the sides
        double side1 = Math.pow(((Math.pow((points[1][0] - points[0][0]), 2))
                + (Math.pow((points[1][1] - points[0][1]), 2))), 0.5);
        double side2 = Math.pow(((Math.pow((points[2][0] - points[1][0]), 2))
                + (Math.pow((points[2][1] - points[1][1]), 2))), 0.5);
        double side3 = Math.pow(((Math.pow((points[2][0] - points[0][0]), 2))
                + (Math.pow((points[2][1] - points[0][1]), 2))), 0.5);
        double s = (side1 + side2 + side3) / 2;

        // Calculate and return area
        return Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
    }
}
