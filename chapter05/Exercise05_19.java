/**
 * @author Weiquan Mai
 * Problem 5.19
 * (Display numbers in a pyramid pattern)
 * Write a nested for loop that prints the following output:
 *                                             1
 *                                     1       3      1
 *                              1      3       9      3    1
 *                       1      3      9      27      9     3    1
 *                 1     3      9     27      81     27     9     3    1
 *           1     3     9     27     81     243     81     27     9     3    1
 *      1    3     9    27     81    243     729    243     81    27     9    3    1
 * 1    3    9    27    81    243    729    2187    729    243    81    27    9    3    1
 *
 */
public class Exercise05_19 {
    public static void main(String[] args){
        // Variables
        final int NUMBER_OF_ROWS = 8;
        int result = 1;

        // Iterate through from rows 1 to 8
        for(int i = 1; i <= NUMBER_OF_ROWS; i++){
            int numBlankNumbers = NUMBER_OF_ROWS - i;

            // Generate blank spaces formatting
            for(int j = 0; j < numBlankNumbers; j++){
                System.out.printf("%6s"," ");
            }

            // Print left side of pyramid
            for(int k = 0; k < i; k++){
                if(k == 0){
                    System.out.printf("%6d", 1);
                }
                else{
                    result = result * 3;
                    System.out.printf("%6d", result);
                }
            }

            // Print right side of pyramid
            while(result > 1){
                result = result / 3;
                System.out.printf("%6d", result);
            }

            // Go to next line and reset result to 1
            System.out.println();
            result = 1;
        }
    }
}
