/**
 * @author Weiquan Mai
 * Problem 8.19
 * (Pattern recognition: four consecutive equal numbers)
 * Write the following method that tests whether a two-dimensional array has
 * four consecutive numbers of the same value, either horizontally, vertically, or diagonally:
 * public static boolean isConsecutiveFour(int[][] values)
 *
 * Write a test program that prompts the user to enter the number of rows,
 * and columns of a two-dimensional array then the values in the array,
 * and displays true if the array contains four consecutive numbers with the same value.
 * Otherwise, the program displays false.
 */

import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the rows and columns of a 2d array
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();
        System.out.println("Enter the array: ");
        int[][] m = new int[row][column];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextInt();
            }
        }
        displayArray(m);

        // Call isConsecutiveFour method to determine if there are four consecutive numbers of the same value
        if(isConsecutiveFour(m)){
            System.out.println("Array contains four consecutive numbers");
        }
        else{
            System.out.println("Array does not contain four consecutive numbers");
        }
        // Close Scanner
        input.close();
    }

    /**
     * Displays values of an array
     * @param m Two-dimensional array
     */
    public static void displayArray(int[][] m){
        System.out.println("Array is: ");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Determines if there are four consecutive numbers of the same value in the array
     * @param values Two-dimensional aray
     * @return True if there are four consecutive numbers of the same value, otherwise false
     */
    public static boolean isConsecutiveFour(int[][] values){
        return isConsecutiveRow(values) || isConsecutiveColumn(values) ||
                isConsecutiveDiagonal(values) || isSubDiagonal(values);
    }

    /**
     * Determines if there are four consecutive numbers of the same value in the same row
     * @param values Two-dimensional array
     * @return True if there are four consecutive numbers of the same value in the same row, otherwise false
     */
    public static boolean isConsecutiveRow(int[][] values) {
        // Iterate through 2d array
        for(int i = 0; i < values.length; i++){
            int counter = 0;
            int number = values[i][0];

            for(int j = 1; j < values[i].length; j++){
                // If value matches number, iterate counter
                if(values[i][j] == number){
                    counter++;
                }
                // Else change number to current value
                else{
                    number = values[i][j];
                    counter = 0;
                }
            }

            // If counter is greater than or equal to 3,
            // then there are at least four consecutive numbers in the row
            if(counter >= 3){
                return true;
            }
        }

        return false;
    }

    /**
     * Determines if there are four consecutive numbers of the same value in the same column
     * @param values Two-dimensional array
     * @return True if there are four consecutive numbers of the same value in the same column, otherwise false
     */
    public static boolean isConsecutiveColumn(int[][] values){
        // Iterate through 2d array
        for(int i = 0; i < values.length; i++){
            int counter = 0;
            int number = values[i][0];

            for(int j = 1; j < values.length; j++){
                // If value matches number, iterate counter
                if(values[j][i] == number){
                    counter++;
                }
                // Else change number to current value
                else{
                    number = values[j][i];
                    counter = 0;
                }
            }

            // If counter is greater than or equal to 3,
            // then there are at least four consecutive numbers in the row
            if(counter >= 3){
                return true;
            }
        }

        return false;
    }

    /**
     * Determines if there are four consecutive numbers of the same value in the major diagonal (down and right)
     * @param values Two-dimensional array
     * @return True if there are four consecutive numbers of the same value in the major diagonal, otherwise false
     */
    public static boolean isConsecutiveDiagonal(int[][] values){
        // Iterate through 2d array
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values[i].length; j++){
                int number = values[i][j];
                int counter = 0;

                // Iterate diagonally
                for(int k = 0; k < values.length - i - j; k++){
                    if(values[i + k][j + k] == number){
                        counter++;
                    }
                    else{
                        counter = 0;
                        number = values[i + k][j + k];
                    }
                }
                // If counter is greater than or equal to 3,
                // then there are at least four consecutive numbers in the row
                if(counter >= 3){
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Determines if there are four consecutive numbers of the same value in the subdiagonal (up and to the right)
     * @param values Two-dimensional array
     * @return True if there are four consecutive numbers of the same value in the subdiagonal, otherwise false
     */
    public static boolean isSubDiagonal(int[][] values){
        // Iterate through 2d array from bottom left corner
        for(int i = 3; i < values.length; i++){
            for(int j = 0; j < values[i].length - 3; j++){
                int number = values[i][j];
                if(number == values[i - 1][j + 1] &&
                number == values[i - 2][j + 2] &&
                number == values[i - 3][j + 3]){
                    return true;
                }
            }
        }
        return false;
    }
}
