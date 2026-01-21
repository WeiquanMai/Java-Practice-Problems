/**
 * @author Weiquan Mai
 * Problem 8.11
 * (Game: nine heads and tails)
 * Nine coins are placed in a 3-by-3 matrix with some face up and some face down.
 * You can represent the state of the coins using a 3-by-3 matrix
 * with values 0 (heads) and 1 (tails).
 *
 * Each state can also be represented using a binary number.
 * There are a total of 512 possibilities, so you can use decimal numumbers
 * 0, 1, 2, 3, ..., and 511 to represent all states of the matrix.
 * Write a program that prompts the user to enter a number between 0 and 511
 * and displays the corresponding matrix with the characters H and T.
 */

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int[][] grid = new int[3][3];

        // Prompt user to enter a number
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        // Input validation
        while(true){
            if(number < 0 || number > 511){
                System.out.print("Please enter a number between 0 and 511: ");
                number = input.nextInt();
            }
            else{
                break;
            }
        }

        int[] binary = obtainBinary(number);

        displayBinary(binary);

        // Close Scanner
        input.close();
    }

    /**
     * Converts decimal number into binary stored in an array
     * @param number Decimal number
     * @return Array representation of binary number
     */
    public static int[] obtainBinary(int number){
        // Variables
        int[] binary = new int [9];
        int counter = 0;

        /*
        Decimal to binary involves repeatedly dividing the number by 2,
        and storing the remainders. Then display remainder from bottom to top.
         */
        while(number > 0){
            binary[binary.length - 1 - counter] = number % 2;
            number =  number / 2;
            counter++;
        }

        return binary;
    }

    /**
     * Displays binary number in pattern of nine heads and coins
     * @param binary Binary number
     */
    public static void displayBinary(int[] binary){
        int counter = 0;

        for(int i = 0 ; i < binary.length; i++){
            if(binary[i] == 1){
                System.out.print("T");
            }
            else if(binary[i] == 0){
                System.out.print("H");
            }
            counter++;

            if(counter % 3 == 0){
                System.out.println();
            }
        }
    }
}
