/**
 * @Author Weiquan Mai
 * Problem 4.6
 * (Random points on a circle)
 * Write a program that generates three random points on a circle centered at (0, 0)
 * with radius 40 and displays three angles in a triangle formed by these three points,
 * as shown in Figure 4.4a.
 *
 * Hint: Generate a random angle a in radians between 0 and 2PI, as shown in Figure 4.4b
 * and the point determined by this angle is (r^x cos(a), r^x sin(a)).
 */
public class Exercise04_06 {
    public static void main(String[] args){
        // Generate three random angles
        double a1 = Math.random() * Math.PI * 2;
        double a2 = Math.random() * Math.PI * 2;
        double a3 = Math.random() * Math.PI * 2;

        // Circle is centered at (0, 0) with radius 40
        final double radius = 40.0;

        // Calculate the three points
        double x1 = radius * Math.cos(a1);
        double y1 = radius * Math.sin(a1);
        double x2 = radius * Math.cos(a2);
        double y2 = radius * Math.sin(a2);
        double x3 = radius * Math.cos(a3);
        double y3 = radius * Math.sin(a3);

        // Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Compute three angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Display results
        System.out.println("The points (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
        System.out.println("gives angles " + A + ", " + B + ", " + C);

    }
}
