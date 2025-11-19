/**
 * @Author Weiquan Mai
 * Problem 2.18
 * (Print a table)
 * Write a progrm that displays the following table. Calculate the middle point of two points
 */

public class Exercise02_18 {
    public static void main(String[] args){
        // Variables for a
        int ax1 = 0;
        int ax2 = 1;
        int ax3 = 2;
        int ax4 = 3;
        int ax5 = 4;
        int ay1 = 0;
        int ay2 = 4;
        int ay3 = 7;
        int ay4 = 9;
        int ay5 = 11;

        // Variables for b
        int bx1 = 2;
        int bx2 = 4;
        int bx3 = 6;
        int bx4 = 10;
        int bx5 = 12;
        int by1 = 1;
        int by2 = 2;
        int by3 = 3;
        int by4 = 5;
        int by5 = 7;

        // Calculate midpoint
        double xMidpoint1 = (ax1 + bx1) / 2;
        double xMidpoint2 = (ax2 + bx2) / 2;
        double xMidpoint3 = (ax3 + bx3) / 2;
        double xMidpoint4 = (ax4 + bx4) / 2;
        double xMidpoint5 = (ax5 + bx5) / 2;

        double yMidpoint1 = (ay1 + by1) / 2;
        double yMidpoint2 = (ay2 + by2) / 2;
        double yMidpoint3 = (ay3 + by3) / 2;
        double yMidpoint4 = (ay4 + by4) / 2;
        double yMidpoint5 = (ay5 + by5) / 2;

        // Display table
        System.out.println("  a\t\tb\t\t\tMiddle Point");
        System.out.printf("(%d, %d)\t(%d, %d)\t\t(%.1f, %.1f)\n", ax1, ay1, bx1, by1, xMidpoint1, yMidpoint1);
        System.out.printf("(%d, %d)\t(%d, %d)\t\t(%.1f, %.1f)\n", ax2, ay2, bx2, by2, xMidpoint2, yMidpoint2);
        System.out.printf("(%d, %d)\t(%d, %d)\t\t(%.1f, %.1f)\n", ax3, ay3, bx3, by3, xMidpoint3, yMidpoint3);
        System.out.printf("(%d, %d)\t(%d, %d)\t\t(%.1f, %.1f)\n", ax4, ay4, bx4, by4, xMidpoint4, yMidpoint4);
        System.out.printf("(%d, %d)\t(%d, %d)\t\t(%.1f, %.1f)\n", ax5, ay5, bx5, by5, xMidpoint5, yMidpoint5);
    }
}
