/**
 * @Author Weiquan Mai
 * Problem 3.16
 * (Random Point)
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0,0) with width 50, and height 150.
 */
public class Exercise03_16 {
    public static void main(String[] args){
        // Generate random coordinate
        double x = (Math.random() * 50);
        double y = (Math.random() * 150);

        // Display random coordinate
        System.out.println("Random Coordinate: (" + x + ", " + y + ")");
    }
}
