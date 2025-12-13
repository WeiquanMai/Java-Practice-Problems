/**
 * @author Weiquan Mai
 * Problem 5.23
 * (Demonstrate cancellation errors)
 * A cancellation error occurs when you are manipulating a very large number
 * with a very small number. The large number may cancel out the smaller number.
 * For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0.
 * To avoid cancellation errors and obtain more accurate results,
 * carefully select the order of computation.
 * For example, in computing the following summation, you will obtain a more accurate result
 * by computing from the right to the left rather than from the left to the right:
 * 1 + 1/2 + 1/3 + ... + 1/n
 *
 * Write a program that compares the results of the summation of the preceding series,
 * computing from left to right and from right to left with n = 50000.
 */
public class Exercise05_23 {
    public static void main(String[] args){
        // Variables
        final int COUNTER = 50000;
        double leftToRightSum = 0;
        double rightToLeftSum = 0;

        // Iterate from 1 to counter, and add amount to leftToRightSum
        for(int i = 1; i <= COUNTER; i++){
            leftToRightSum += 1.0 / i;
        }

        // Iterate from counter to 1, and add amount to rightToLeftSum
        for(int i = COUNTER; i >= 1; i--){
            rightToLeftSum += 1.0/i;
        }

        // Display results
        System.out.println("Right to left sum is " + rightToLeftSum);
        System.out.println("Left to right sum is " + leftToRightSum);
    }
}
