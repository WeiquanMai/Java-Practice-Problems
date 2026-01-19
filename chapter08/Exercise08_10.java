/**
 * @author Weiquan Mai
 * Problem 8.10
 * (Largest row and column)
 * Write a program that randomly fills in 0s and 1s
 * into a 5-by-5 matrix, prints the matrix, and finds the first row
 * and column with the most 1s.
 */
public class Exercise08_10 {
    public static void main(String[] args){
        // Create a 5-by-5 matrix filled with random 0s and 1s
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        // Display the matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // Variables
        int largestRow = 0;
        int largestRowIndex = 0;
        int largestColumn = 0;
        int largestColumnIndex = 0;
        int rowCounter = 0;
        int columnCounter = 0;

        // Find largest row
        for(int i = 0; i < matrix.length; i++){
            rowCounter = 0;
            for(int j = 0; j < matrix[i].length; j++){
                rowCounter += matrix[i][j];
            }

            if(rowCounter > largestRow){
                largestRow = rowCounter;
                largestRowIndex = i;
            }
        }

        // Find largest column
        for(int i = 0; i < matrix.length; i++){
            columnCounter = 0;
            for(int j = 0; j < matrix[i].length; j++){
                columnCounter += matrix[j][i];
            }

            if(columnCounter > largestColumn){
                largestColumn = columnCounter;
                largestColumnIndex = i;
            }
        }

        // Display result
        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColumnIndex);
    }
}
