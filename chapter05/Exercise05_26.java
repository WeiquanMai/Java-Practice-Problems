/**
 * @author Weiquan Mai
 * Problem 5.26
 * (Compute e)
 * You can approximate e using the following summation:
 * e = 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 *
 * Write a program that displays the e value for i = 10000, 20000, ..., and 100000.
 * (Hint: Because i! = i X (i - 1) X ... X 2 X 1, then
 * 1/i! is 1 / (i(i - 1))!
 * Initialize e and item to be 1, and keep adding a new item to e.
 * The new item is the previous item divided by i, for i >= 2.)
 */
public class Exercise05_26 {
    public static void main(String[] args){
        // Variables
        double e = 1.0;
        double item = 1.0;

        // Outer loop to iterate from 10000 to 100000
        for(int i = 10000; i <= 100000; i+= 10000){
            
            // Inner loop to iterate from 1 to i
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    e += 1.0;
                    continue;
                }
                item = item / j;
                e += item;
            }

            // Display result
            System.out.println("Approximation of e for i = " + i + " is " + e);

            // Reset for next iteration
            e = 1.0;
            item = 1.0;
        }
    }
}
