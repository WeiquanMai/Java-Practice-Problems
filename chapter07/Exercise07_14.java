/**
 * @author Weiquan Mai
 * Problem 7.14
 * (Computing lcm)
 * Write a method that returns the lcm (least common multiple)
 * of an unspecified number of integers.
 * The method header is specified as follows:
 * public static int lcm(int... numbers)
 *
 * Write a test program that prompts the user to enter five numbers,
 * invokes the method to find the lcm of these numbers, and displays the lcm.
 */

import java.util.Scanner;
public class Exercise07_14 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter five numbers
        System.out.print("Enter five numbers: ");
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = input.nextInt();
        }

        // Invoke the method and find lcm of these numbers
        System.out.println("LCM is " + lcm(array));

        // Close Scanner
        input.close();
    }

    /**
     * Calculates and returns the least common multiple from an array of numbers
     * @param numbers Array of numbers
     * @return Least common multiple from the array
     */
    public static int lcm(int... numbers){
        int lcm = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            lcm = (lcm * numbers[i]) / gcd(lcm, numbers[i]);
        }
        return lcm;
    }

    /**
     * Calculates and returns the greatest common denominator from two integers
     * @param n1 Integer one
     * @param n2 Integer two
     * @return Greatest common denominator
     */
    public static int gcd(int n1, int n2){
        int gcd = 1;
        int min = Math.min(n1, n2);

        for(int i = 1; i <= min; i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                gcd = i;
            }
        }
        return gcd;
    }
}
