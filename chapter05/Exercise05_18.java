/**
 * @author Weiquan Mai
 * Problem 5.18
 * (Display four patterns using loops)
 * Use nested loops that display the following patterns in four separate programs:
 * Pattern A
  *
  * *
  * * *
  * * * *
  * * * * *
  * * * * * *

  Pattern B
  * * * * * *
  * * * * *
  * * * *
  * * *
  * *
  *

 Pattern C
           *
         * *
       * * *
     * * * *
   * * * * *
 * * * * * *

 Pattern D
 * * * * * *
   * * * * *
     * * * *
       * * *
         * *
           *
 */
public class Exercise05_18 {
    public static void main(String[] args){
        // Variables
        final int ROW_LENGTH = 6;

        // Pattern A
        System.out.println("Pattern A");
        for(int i = 1; i <= ROW_LENGTH; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern B
        System.out.println("Pattern B");
        for(int i = ROW_LENGTH; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern C
        System.out.println("Pattern C");
        for(int i = 1; i <= ROW_LENGTH; i++){
            int numBlankSpaces = ROW_LENGTH - i;

            for(int j = 1; j <= numBlankSpaces; j++){
                System.out.print("  ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern D
        System.out.println("Pattern D");
        for(int i = ROW_LENGTH; i >= 1; i--){
            int numBlankSpaces = ROW_LENGTH - i;

            for(int j = numBlankSpaces; j > 0; j--){
                System.out.print("  ");
            }

            for(int k = i; k >= 1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
