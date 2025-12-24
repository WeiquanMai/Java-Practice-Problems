/**
 * @author Weiquan Mai
 * Problem 6.13
 * (Sum series)
 * Write a method to compute the following series:
 * m(i) = 1/3 + 2/4 + ... + i / i + 2
 *
 * Write a test program that displays the following table:
 * I        m(i)
 * 1        0.3333
 * 2        0.8333
 * ...
 * 19       14.7093
 * 20   15.6184
 */
public class Exercise06_13 {
    public static void main(String[] args){
        // Display header
        System.out.printf("%2s\t\t%2s\n", "I", "m(i)");
        System.out.println("______________");

        // Iterate from 1 to 20, and return sum of each series up to i
        for(int i = 1; i <= 20; i++){
            System.out.printf("%2d\t\t%.4f\n", i, sumSeries(i));
        }
    }

    /**
     * Returns accumulator of a series of i / i + 2
     * @param n ending value of i
     * @return sum of series
     */
    public static double sumSeries(int n){
        double accumulator = 0;

        for(int i = 1; i <= n; i++){
            accumulator += (double) i / (i + 2);
        }

        return accumulator;
    }
}
