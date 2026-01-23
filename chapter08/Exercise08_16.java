/**
 * @author Weiquan Mai
 * Problem 8.16
 * (Sort two-dimensional array)
 * Write a method to sort a two-dimensional array using the following header:
 * public static void sort(int[][] m)
 *
 * The method performs a prinary sort on rows, and a secondary sort on columns.
 * For example, the following array
 * {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}}
 * will be sorted to
 * {{4, 5}, {4, 2}, {4, 1}, {1, 7}, {1, 2}, {1, 1}}
 */
public class Exercise08_16 {
    public static void main(String[] args){
        // Initialize two-dimensional array
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        System.out.println("Before sorting: ");
        displayArray(m);

        // Call sort method
        sort(m);

        // Display result
        System.out.println("After sorting: ");
        displayArray(m);
    }

    /**
     * Displays contents of two-dimensional array
     * @param m Two-dimensional array
     */
    public static void displayArray(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Sorts two-dimensional array by decreasing by row, and then decreasing by column
     * @param m Two-dimensional array
     */
    public static void sort(int[][] m){
        sortRows(m);
        sortColumns(m);
    }

    /**
     * Sorts the rows of a two-dimensional array in decreasing order
     * @param m Two-dimensional array
     */
    public static void sortRows(int[][] m){
        // Variables
        boolean isSorted = false;
        int numberOfSwaps = 0;

        while(!isSorted){
            numberOfSwaps = 0;

            for(int i = 0; i < m.length - 1; i++){
                // If next number is bigger, swap them
                if(m[i + 1][0] > m[i][0]){
                    // Swap rows
                    int[] temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                    numberOfSwaps++;
                    }
            }

            if(numberOfSwaps == 0){
                isSorted = true;
            }
        }
    }

    /**
     * Sorts the columns of a two-dimensional array in decreasing order
     * @param m Two-dimensional array
     */
    public static void sortColumns(int[][] m){
        // Variables
        boolean isSorted = false;
        int startingIndex = 0;
        int numberOfSwaps = 0;

        while(startingIndex < m.length){
            // Variables
            int endIndex = startingIndex;
            boolean partitionIsSorted = false;

            // Find partition
            for(int i = startingIndex; i < m.length - 1; i++){
                if(m[i][0] == m[i + 1][0]){
                    endIndex++;
                }
                else{
                    break;
                }
            }

            // Sort partition
            while(!partitionIsSorted){
                numberOfSwaps = 0;
                for(int i = startingIndex; i < endIndex ; i++){
                    if(m[i + 1][1] > m[i][1]){
                        int temp = m[i][1];
                        m[i][1] = m[i + 1][1];
                        m[i + 1][1] = temp;
                        numberOfSwaps++;
                    }
                }

                if(numberOfSwaps == 0){
                    partitionIsSorted = true;
                }
            }
            startingIndex = endIndex + 1;
        }
    }
}
