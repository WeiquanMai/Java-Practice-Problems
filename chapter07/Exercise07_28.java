/**
 * @author Weiquan Mai
 * Problem 7.28
 * (Math: permutations)
 * Write a program that prompts the user to enter four integers
 * and then displays all possible ways of arranging the four integers.
 */

import java.util.Scanner;
public class Exercise07_28 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter four integers
        System.out.print("Enter four integers: ");
        int[] list = new int[4];
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }

        // Use nested loop to display all possible permutations
        System.out.println("Possible permutations are: ");
        for(int i = 0; i < list.length; i ++){
            for(int j = 0; j < list.length; j++){
                for(int k = 0; k < list.length; k++){
                    for(int l = 0; l < list.length; l++){
                        if((i != j) && (i != k) && (i != l)
                        && (j != k) && (j != l) && (k != l)){
                            System.out.println(list[i] + " " + list[j] + " " + list[k] + " " + list[l]);
                        }
                    }
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
