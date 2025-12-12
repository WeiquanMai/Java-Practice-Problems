/**
 * @author Weiquan Mai
 * Problem 5.11
 * (Find numbers divisible by 3 or 4, but not both)
 * Write a proram that displays all the numbers from 100 to 200,
 * ten per line, that are divisible by 3 or 4, but not both.
 * Numbers are separated by exactly one space.
 */
public class Exercise05_11 {
    public static void main(String[] args){
        // Variable
        int lineCounter = 0;

        // Iterate from 100 to 200
        for(int i = 100; i < 201; i++){
            // Determine if value is divisible by 3 or 4, but not both
            if((i % 3 == 0 || i % 4 == 0) && (i % 12 != 0)){
                System.out.print(i + " ");
                lineCounter++;

                // If line counter reaches 10, go to next line and reset line counter
                if(lineCounter == 10){
                    System.out.println();
                    lineCounter = 0;
                }
            }
        }
    }
}
