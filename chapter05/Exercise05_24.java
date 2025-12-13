/**
 * @author Weiquan Mai
 * Problem 5.24
 * (Sum a series)
 * Write a program to compute the following summation:
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
 */
public class Exercise05_24 {
    public static void main(String[] args){
        // Variable
        double summationTotal = 0;

        // Iterate from 1 to 97
        for(double i = 1, j = 3; i <= 97; i+= 2, j+= 2){
            summationTotal += i / j;
        }

        // Display results
        System.out.println("Summation total is " + summationTotal);
    }
}
