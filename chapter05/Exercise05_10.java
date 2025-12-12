/**
 * @author Weiquan Mai
 * Problem 5.10
 * (Find numbers divisible by 3 and 4)
 * Write a program that displays all the numbers from 100 to 1,000,
 * ten per line, that are divisible by 3 and 4.
 * Numbers are separated by exactly one space.
 */
public class Exercise05_10 {
    public static void main(String[] args){
        // Variable
        int lineCounter = 0;

        // Iterate from 100 to 1000
        for(int i = 100; i < 1001; i++){
            // Determine if number is divisible by both 3 and 4
            if((i % 3 == 0) && (i % 4 == 0)){
                System.out.print(i + " ");
                lineCounter++;

                // If line counter is 10, go to next line and reset counter
                if(lineCounter == 10){
                    System.out.println();
                    lineCounter = 0;
                }
            }
        }
    }
}
