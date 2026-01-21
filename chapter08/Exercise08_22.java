/**
 * @author Weiquan Mai
 * Problem 8.22
 * (Even number of 1s)
 * Write a program that generates a 6-by-6 two dimensional
 * matrix filled with 0s and 1s, displays the matrix,
 * and checks if every row and every column have an even number of 1s.
 */
public class Exercise08_22 {
    public static void main(String[] args){
        // Generate a 6-by-6 matrix
        int[][] m = new int[6][6];
        fillMatrix(m);
        displayMatrix(m);
        checkRow(m);
        checkColumn(m);
    }

    /**
     * Fills matrix with randomly generated 0s and 1s
     * @param m Two-dimensional array
     */
    public static void fillMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    /**
     * Displays the values of a matrix
     * @param m Two-dimensional array
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
     * Checks if the rows of a matrix have an even number of 1s.
     * @param m Two-dimensional array
     */
    public static void checkRow(int[][] m){
        int counter = 0;
        for(int i = 0; i < m.length; i++){
            counter = 0;
            for(int j = 0; j < m[i].length; j++){
                counter += m[i][j];
            }

            if(counter % 2 == 0){
                System.out.println("Row " + i + " is even");
            }
        }
    }

    /**
     * Checks if the columns of a matrix haave an even number of 1s
     * @param m Two-dimensional array
     */
    public static void checkColumn(int[][] m){
        int counter;

        for(int i = 0; i < m.length; i++){
            counter = 0;
            for(int j = 0; j < m[i].length; j++){
                counter += m[j][i];
            }

            if(counter % 2 == 0){
                System.out.println("Column " + i + " is even");
            }
        }
    }
}
