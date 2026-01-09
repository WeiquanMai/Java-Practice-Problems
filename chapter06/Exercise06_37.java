/**
 * @author Weiquan Mai
 * Problem 6.37
 * (Format an integer)
 * Write a method with the following header to format the integer
 * with the specified width.
 * public static String format(int number, int width)
 * The method returns a string for the number with one or more prefix 0s.
 * THe size of the string is the width.
 * For example, format(34, 4) returns 0034, and format(34, 5) returns 00034.
 * If the number is longer than the width, the method returns the string representation for the number.
 * For example, format(34, 1) returns 34.
 * Write a test program that prompts the user to enter a number and its width,
 * and displays a string returned by invoking format(number, width).
 */

import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number and it's width
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        // Call format method and display result
        System.out.println(format(number,width));

        // Close Scanner
        input.close();
    }

    /**
     * Returns a string for the number with one or more prefix 0's
     * @param number Number to return
     * @param width Width of string
     * @return String for number with one or more prefix 0's. If width is smaller than number, return number.
     */
    public static String format(int number, int width){
        // Variables
        int numberSize = getSize(number);

        // String builder
        StringBuilder sb = new StringBuilder();

        // If number is longer than the width, return the string representation for the number
        if(numberSize > width){
            return Integer.toString(number);
        }

        // Return a string for the number with one or more prefix 0s
        int zeroSize = width - numberSize;
        for(int i = 0; i < zeroSize; i++){
            sb.append("0");
        }
        sb.append(number);

        return sb.toString();
    }

    /**
     * Return the number of digits in d
     * @param d Input d to get number of digits
     * @return Number of digits in d
     */
    public static int getSize(long d){
        String s = Long.toString(d);
        return s.length();
    }
}
