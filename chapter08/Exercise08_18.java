/**
 * @author Weiquan Mai
 * Problem 8.18
 * (Shuffle rows)
 * Write a method that shuffles the rows in a two-dimensional int array using the following header:
 * public static void shuffle(int[][] m)
 *
 * Write a test program that shuffles the following matrix:
 * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 */
public class Exercise08_18 {
    public static void main(String[] args){
        // Initialize two-dimensional array
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Before shuffling: ");
        displayMatrix(m);

        // Call shuffle method
        shuffle(m);

        // Display result
        System.out.println();
        System.out.println("After shuffling: ");
        displayMatrix(m);
    }

    /**
     * Displays contents of a two-dimensional matrix
     * @param m Two-dimensional matrix
     */
    public static void displayMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Shuffles the rows of a two-dimensional matrix
     * @param m Two-dimensional matrix
     */
    public static void shuffle(int[][] m){
        for(int i = 0; i < m.length; i++){

            // Swap row
            int randomInt = (int)(Math.random() * (m.length));
            int temp = m[i][0];
            m[i][0] = m[randomInt][0];
            m[randomInt][0] = temp;
            
            // Swap column
            temp = m[i][1];
            m[i][1] = m[randomInt][1];
            m[randomInt][1] = temp;
        }
    }
}
