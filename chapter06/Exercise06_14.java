/**
 * @author Weiquan Mai
 * Problem 6.14
 * (Estimate PI)
 * PI can be computed using the following summation:
 * m(i) = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^(i+1) / 2i - 1)
 *
 * Write a method that returns m(i) for a given i
 * and write a test program that displays the following table:
 *
 * i        m(i)
 * _______________
 * 1        4.0000
 * 101      3.1515
 * 201      3.1466
 * 301      3.1449
 * 401      3.1441
 * 501      3.1436
 * 601      3.1433
 * 701      3.1430
 * 801      3.1428
 * 901      3.1427
 */
public class Exercise06_14 {
    public static void main(String[] args){
        // Create header
        System.out.printf("%-3s\t\t%6s\n", "I", "m(i)");
        System.out.println("_________________");

        // Iterate from 1 to 901 to display estimated value of PI
        for(int i = 1; i <= 901; i+= 100){
            System.out.printf("%-3d\t\t  %6.4f\n", i, estimatePI(i));
        }
    }

    /**
     * Estimates PI using specified formula up to number n
     * @param n estimate up to nth sequence
     * @return estimated value of PI
     */
    public static double estimatePI(int n){
        double accumulator = 0;

        for(int i = 1; i <= n; i++){
            accumulator += Math.pow(-1, (i + 1)) / (2 * i - 1);
        }

        accumulator *= 4;

        return accumulator;
    }

}
