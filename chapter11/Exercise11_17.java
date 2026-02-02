/**
 * @author Weiquan Mai
 * Problem 11.17
 * (Algebra: perfect square)
 * Write a program that prompts the user to enter an integer m and find the smallest integer n
 * such that m * n is a perfect square.
 * (Hint: Store all smallest factors of m into an array list.
 * n is the product of the factors that appear an odd number of times in the array list.
 * For example, consider m = 30, store the factors 2, 3, 3, and 5 in an array list.
 * 2 and 5 appear an odd number of times in the array list. Thus, n is 10.)
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Exercise11_17 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        // Call perfectSquare method and return result
        int n = perfectSquare(m);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));

        // Close Scanner
        input.close();
    }

    /**
     * Calculates smallest integer n such that m * n is a perfect square
     * @param m Initial integer m
     * @return Integer n such that m * n is a perfect square
     */
    public static int perfectSquare(int m){
        // Variables
        ArrayList<Integer> temp = new ArrayList<>();

        // Factor m
        for(int i = 2; i <= m; i++){
            // If number is a factor, add it to list
            if(m % i == 0){
                temp.add(i);
                m = m / i;

                // Reset iteration point
                i = 1;
            }
        }

        // Remove duplicates from list
        distinctFactors(temp);

        // Calculate product
        int product = 1;
        for(int i = 0; i < temp.size(); i++){
            product *= temp.get(i);
        }

        return product;
    }

    /**
     * Returns distinct values from an array list
     * @param list Array list
     */
    public static void distinctFactors(ArrayList<Integer> list){
        // Create temp list
        ArrayList<Integer> temp = new ArrayList<>();

        // Iterate through list
        for(int i = 0; i < list.size(); i++){
            // If temp already contains the value, remove value from temp
            if(temp.contains(list.get(i))){
                temp.remove(list.get(i));
            }
            else{
                temp.add(list.get(i));
            }
        }

        // Clear list and copy values from temp to list
        list.clear();
        list.addAll(temp);
    }
}
