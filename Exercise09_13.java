/*
    Problem 9.13
    
    Design a class named Location for locating a maximal value and its location in a two-dimensional array.
    The class contains public data fields, row, column, and maxValue that store the maximal value and its indices in a two-dimensional array
    with row and column as int types and maxValue as a double type.

    Write the following method that returns the location of the largest element in a two-dimensional array
    The return value is an instance of Location.
    Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
 */
import java.util.Scanner;

public class Exercise09_13 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for row and column
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        // Create the two-dimensional array
        double[][] matrix = new double[row][column];

        // Obtain user input for two-dimensional array
        System.out.println("Enter the array: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        Location location = locateLargest(matrix);
        System.out.println(location);

        // Close scanner
        input.close();
    }

    public static Location locateLargest(double[][] a){
        double largest = a[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        // Find largest
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                // If largest is found, set maxRow and maxColumn to location found
                if(a[i][j] > largest){
                    largest = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        Location location = new Location(maxRow, maxColumn,largest);
        return location;
    }
}
