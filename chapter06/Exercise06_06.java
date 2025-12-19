/**
 * @author Weiquan Mai
 * Problem 6.6
 * (Display patterns)
 * Write a method to display a pattern as follows:
 *
 * 1
 * 1 2
 * 1 2 3
 * ...
 * 1 2 3 ... n-1 n
 *
 * The method header is
 * public static void displayPattern(int n)
 */
public class Exercise06_06 {
    public static void main(String[] args){
        displayPattern(7);
    }

    /**
     * Displays pattern from 1 to n in a triangular pattern
     * @param n Maximum integer to display pattern for.
     */
    public static void displayPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
