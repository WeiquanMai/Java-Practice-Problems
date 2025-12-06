/**
 * @Author Weiquan Mai
 * Problem 3.28
 * (Geometry: two rectangles)
 * Write a program that prompts the user to enter the center, x-, y- coordinates, width, and height of two rectangles
 * and determines whether the second rectangle is inside the first, or overlaps with the first.
 */

import java.util.Scanner;

public class Exercise03_28 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for information for two rectangles
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        // Calculate left, right, lower, and upper bound
        double r1Left = x1 - (r1Width / 2);
        double r1Right = x1 + (r1Width / 2);
        double r1Lower = y1 - (r1Height / 2);
        double r1Upper = y1 + (r1Height / 2);
        double r2Left = x2 - (r2Width / 2);
        double r2Right = x2 + (r2Width / 2);
        double r2Lower = y2 - (r2Height / 2);
        double r2Upper = y2 + (r2Height / 2);

        // Determine if r2 is inside r1, overlaps r1, or does not overlap r1
        if(r1Left <= r2Left && r1Right >= r2Right && r1Lower <= r2Lower && r1Upper >= r2Upper){
            System.out.println("r2 is inside r1");
        }
        else if((r2Left <= r1Right && r2Right >= r1Right) || (r2Right >= r1Left && r2Left <= r1Left)
                    || (r2Upper >= r1Lower && r2Upper <= r1Upper) || (r2Lower <= r1Upper && r2Upper >= r1Upper)){
            System.out.println("r2 overlaps r1");
        }
        else{
            System.out.println("r2 does not overlap r1");
        }

        // Close Scanner
        input.close();
    }
}
