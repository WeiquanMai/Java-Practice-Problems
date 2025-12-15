/**
 * @author Weiquan Mai
 * Problem 5.33
 * (Perfect number)
 * A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors,
 * excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1.
 * The next is 28 = 14 + 7 + 4 + 2 + 1.
 * There are four perfect numbers < 10,000. Write a program to find all these four numbers.
 */

public class Exercise05_33 {
    public static void main(String[] args){
        // Iterate from 6 to 9999, since 6 is the first perfect number
        for(int i = 6; i < 10000; i++){
            // Determine if i is a perfect number
            int perfectSum = 0;

            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    perfectSum += j;
                }
                }
            if(perfectSum == i){
                System.out.print(i + " ");

                // Reset tracker
                perfectSum = 0;
            }
        }
    }
}
