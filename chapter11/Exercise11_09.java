/*
    Problem 11.9

    Largest rows and columns
    Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
    prints the matrix, and finds the rows and columns with the most 1s.
 */

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_09 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for array size and create array
        System.out.print("Enter the array size n: ");
        int arraySize = input.nextInt();
        while(arraySize <= 0){
            System.out.println("Invalid size. Array size must be positive");
            System.out.print("Enter the array size n: ");
            arraySize = input.nextInt();
        }
        int[][] matrix = new int[arraySize][arraySize];

        // Create a random object and populate array with 0's and 1's
        Random random = new Random();
        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < arraySize; j++){
                matrix[i][j] = random.nextInt(2);
            }
        }

        // Display the random array
        System.out.println("The random array is");
        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < arraySize; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // Largest row
        System.out.println("The largest row index: " + largestRow(matrix));

        // Largest column
        System.out.println("The largest column index: " + largestColumn(matrix));

        // Close scanner
        input.close();
    }

    // Find and return largest row from 2d array
    public static ArrayList<Integer> largestRow(int[][] matrix){
        ArrayList<Integer> rows = new ArrayList<>();

        // Loop through to find the max row
        for(int i = 0; i < matrix.length; i++){
            int rowTotal = 0;
            for(int j = 0; j < matrix.length; j++){
                rowTotal += matrix[i][j];
            }
            rows.add(rowTotal);
        }

        // Loop through to see if there are values equal to max
        int maxRowTotal = Collections.max(rows);
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < rows.size(); i++){
            if(rows.get(i) == maxRowTotal){
                resultList.add(i);
            }
        }

        return resultList;
    }

    // Find and return largest column from 2d array
    public static ArrayList<Integer> largestColumn(int[][] matrix){
        ArrayList<Integer> columns = new ArrayList<>();

        // Loop through to find the max column
        for(int j = 0; j < matrix[0].length; j++){
            int columnTotal = 0;
            for(int i = 0; i < matrix.length; i++){
                columnTotal += matrix[i][j];
            }
            columns.add(columnTotal);
        }

        // Loop through to see if there are values equal to max
        int maxColumnTotal = Collections.max(columns);
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < columns.size(); i++){
            if(columns.get(i) == maxColumnTotal){
                resultList.add(i);
            }
        }
        return resultList;
    }
}
