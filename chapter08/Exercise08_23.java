/**
 * @author Weiquan Mai
 * Problem 8.23
 * (Game: find the flipped cell)
 * Suppose you are given a 6-by-6 matrix filled with 0s and 1s.
 * All rows and all columns have an equal number of 1s.
 * Let the user flip one cell (i.e., flip from 1 to 0, or from 0 to 1)
 * and write a program to find which cell was flipped.
 * Your program should prompt the user to enter a 6-by-6 array
 * with 0s and 1s and find the first row r and first column c
 * where the even number of 1s property is violated(i.e., the number of 1s is not even).
 * The flipped cell is at (r, c).
 */

import java.util.Scanner;

public class Exercise08_23 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 6-by-6 matrix
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int[][] m = new int[6][6];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                m[i][j] = input.nextInt();
            }
        }

        // Find the first row and first column where the even number of 1s property is violated
        int[] unevenPoint = evenNumberOf1s(m);
        System.out.printf("The flipped cell is at (%d, %d)\n", unevenPoint[0], unevenPoint[1]);

        // Close Scanner
        input.close();
    }

    /**
     * Finds the row and column that contains uneven number of 1s in a 2d array
     * @param m Two-dimensional array
     * @return Single dimensional array representing row and column of the point containing uneven number of 1s
     */
    public static int[] evenNumberOf1s(int[][] m){
        int[] result = {0, 0};
        result[0] = evenNumberRow(m);
        result[1] = evenNumberColumn(m);

        return result;
    }

    /**
     * Finds the row containing uneven number of 1s
     * @param m Two-dimensional array
     * @return Row containing uneven number of 1s
     */
    public static int evenNumberRow(int[][] m){
        // Variables
        int rowCounter = 0;
        int rowIndex = 0;

        // Iterate through 2d Array
        for(int i = 0; i < m.length; i++){
            rowCounter = 0;
            for(int j = 0; j < m.length; j++){
                // Add value to rowCounter
                rowCounter += m[i][j];
            }
            // If row is not even, break
            if(rowCounter % 2 != 0){
                rowIndex = i;
                break;
            }
        }

        return rowIndex;
    }

    /**
     * Finds the column containing uneven number of 1s
     * @param m Two-dimensional array
     * @return Column containing uneven number of 1s
     */
    public static int evenNumberColumn(int[][] m){
        // Variables
        int columnCounter;
        int columnIndex = 0;

        // Iterate through 2d array
        for(int i = 0; i < m.length; i++){
            columnCounter = 0;
            for(int j = 0; j < m.length; j++){
                // Add value to columnCounter
                columnCounter += m[j][i];
            }

            // If column counter is not even, break
            if(columnCounter % 2 != 0){
                columnIndex = i;
                break;
            }
        }

        return columnIndex;
    }
}
