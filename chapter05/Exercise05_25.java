/**
 * @author Weiquan Mai
 * Problem 5.25
 * (Compute PI)
 * You can approximate PI by using the following summation:
 * PI = 4 ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-)^i+1 / (2i - 1))
 *
 * Write a program that displays the PI value for i = 10000, 20000, ... and 100000.
 */
public class Exercise05_25 {
    public static void main(String[] args){
        // Variable
        double approximatePI = 0;
        double accumulator = 0;
        double sign = 1.0;


        // Iterate from 10000 to 20000 to 100000
        for(int i = 10000; i <= 100000; i += 10000){
            // Approximate PI using formula
            for(int j = 1; j <= i; j += 2){
                if(j == 1){
                    accumulator += 1;
                    continue;
                }
                else{
                    sign = sign * -1.0;
                    accumulator += sign / j;
                }
            }

            // Calculate approximation of PI and display result
            approximatePI = accumulator * 4;
            System.out.println("Approximation of PI for i = " + i + " is " + approximatePI);

            // Reset for next iteration
            accumulator = 0;
            sign = 1.0;
        }
    }
}
