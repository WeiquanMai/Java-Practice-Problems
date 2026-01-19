/**
 * @author Weiquan Mai
 * Problem 8.7
 * (Points nearest to each other)
 * Listing 8.3 gives a program that finds two points in a two-dimensional space nearest to each other.
 * Revise the program so it finds two points in a three-dimensional space nearest to each other.
 * Use a two-dimensional array to represent the points.
 * Test the program using the following points:
 * double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
 * {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
 */
public class Exercise08_07 {
    public static void main(String[] args){
        // Variables
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9},
                 {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        int p1 = 0;
        int p2 = 1;

        // Initialize shortest distance
        double shortestDistance = distance(points[0][0], points[0][1], points[0][2],
                points[1][0], points[1][1], points[1][2]);

        // Compute the distance
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[i][1], points[i][2],
                        points[j][0], points[j][1], points[j][2]);

                if(distance < shortestDistance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }

        // Display result
        System.out.printf("The closest two points are (%.1f, %.1f, %.1f) and (%.1f, %.1f, %.1f)",
                points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1], points[p2][2]);
    }

    /**
     * Calculates the distance between two points (x1, y1, z1) and (x2, y2, z2)
     * @param x1
     * @param y1
     * @param z1
     * @param x2
     * @param y2
     * @param z2
     * @return Calculated distance between two points
     */
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
}
