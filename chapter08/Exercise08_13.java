/**
 * @author Weiquan Mai
 * Problem 8.13
 * (Locate the smallest element)
 * Write the following method that returns the location of the smallest element
 * in a two-dimensional array.
 * public static int[] locateSmallest(double[][] a)
 *
 * The return value is a one-dimensional array that contains two elements.
 * These two elements indicate the row and column indices of the smallest element
 * in the two-dimensional array.
 * Write a test program that prompts the user to enter a two-dimensional array
 * and displays the location of the smallest element in the array
 */
import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter rows and columns of array
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        // Prompt user to enter array
        System.out.println("Enter the array: ");
        double[][] matrix = new double[row][column];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }

        // Call locateSmallest method and display result
        int[] result = locateSmallest(matrix);
        System.out.printf("The location of the smallest element is at (%d, %d)", result[0], result[1]);

        // Close Scanner
        input.close();
    }

    /**
     * Find the location of the smallest element inside a two-dimensional array
     * @param a Two-dimensional array
     * @return Array representation of smallest element with row and column
     */
    public static int[] locateSmallest(double[][] a){
        int row = 0;
        int column = 0;
        int[] result = new int[2];
        double smallest = a[0][0];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < smallest){
                    smallest = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        result[0] = row;
        result[1] = column;

        return result;
    }
}
