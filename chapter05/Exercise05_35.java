/**
 * @author Weiquan Mai
 * Problem 5.35
 * (Summation)
 * Write a program to compute the following summation:
 * 1 / 1 + sqrt(2) + 1 / sqrt(2) + sqrt(3) + 1 / sqrt(3) + sqrt(4) + ... + 1 / sqrt(999) + sqrt(1000)
 */

public class Exercise05_35 {
    public static void main(String[] args){
        // Variable
        double summationTotal = 0;

        // Iterate from 1 to 9999
        for(int i = 1; i < 1000; i++){
            summationTotal += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        // Display result
        System.out.println("Summation total is " + summationTotal);
    }
}
