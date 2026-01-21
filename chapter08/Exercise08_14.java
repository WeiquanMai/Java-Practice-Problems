/**
 * @author Weiquan Mai
 * Problem 8.15
 * (Explore matrix)
 * Write a program that prompts the user to enter the length of a square matrix,
 * randomly fills in 0s and 1s into the matrix, prints the matrix,
 * and finds the rows, columns, and diagonals with all 0s or 1s.
 */

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter size
        System.out.print("Enter the size for the matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int [n][n];

        fillMatrix(matrix);
        printMatrix(matrix);
        findSameRow(matrix);
        findSameColumn(matrix);
        findSameDiagonal(matrix);

        // Close Scanner
        input.close();
    }

    /**
     * Fills the matrix with 0s and 1s
     * @param matrix Input two-dimensional matrix
     */
    public static void fillMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    /**
     * Prints the matrix
     * @param matrix Input two-dimensional matrix
     */
    public static void printMatrix(int[][] matrix){
        int counter = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                counter++;

                if(counter % matrix.length == 0){
                    System.out.println();
                }
            }
        }
    }

    /**
     * Finds rows in the matrix with similar numbers
     * @param matrix Input two-dimensional matrix
     */
    public static void findSameRow(int[][] matrix){
        int sameRowCounter = 0;

        for(int i = 0; i < matrix.length; i++){
            int counter = 0;

            for(int j = 0; j < matrix[i].length; j++){
                counter += matrix[i][j];
            }
            if(counter == 0){
                sameRowCounter++;
                System.out.println("All 0s on row " + i);
            }
            else if(counter == matrix.length){
                sameRowCounter++;
                System.out.println("All 1s on row " + i);
            }
        }

        if(sameRowCounter == 0){
            System.out.println("No same numbers on a row");
        }
    }

    /**
     * Finds columns in the matrix with similar numbers
     * @param matrix Input two-dimensional matrix
     */
    public static void findSameColumn(int[][] matrix){
        int sameColumnCounter = 0;

        for(int i = 0; i < matrix.length; i++){
            int counter = 0;

            for(int j = 0 ; j < matrix[i].length; j++){
                counter += matrix[j][i];
            }

            if(counter == 0){
                sameColumnCounter++;
                System.out.println("All 0s on column " + i);
            }
            else if(counter == matrix.length){
                sameColumnCounter++;
                System.out.println("All 1s on column " + i);
            }
        }

        if(sameColumnCounter == 0){
            System.out.println("No same numbers on a column");
        }
    }

    /**
     * Finds diagonals in the matrix with similar numbers
     * @param matrix Input two-dimensional matrix
     */
    public static void findSameDiagonal(int[][] matrix){
        // Finds same numbers in major diagonal
        int diagonalCounter = 0;
        for(int i = 0; i < matrix.length; i++){
            diagonalCounter += matrix[i][i];
        }
        if(diagonalCounter == 0){
            System.out.println("All 0's on major diagonal");
        }
        else if(diagonalCounter == matrix.length){
            System.out.println("All 1s on major diagonal");
        }
        else{
            System.out.println("No same number on the major diagonal");
        }
        
        // Finds same numbers in sub-diagonal
        int subDiagonalCounter = 0;
        for(int i = 0; i < matrix.length; i++){
            subDiagonalCounter += matrix[i][matrix.length - 1 - i];
        }
        if(subDiagonalCounter == 0){
            System.out.println("All 0's on sub-diagonal");
        }
        else if(subDiagonalCounter == matrix.length){
            System.out.println("All 1s on sub-diagonal");
        }
        else{
            System.out.println("No same number on the sub-diagonal");
        }
    }
}
