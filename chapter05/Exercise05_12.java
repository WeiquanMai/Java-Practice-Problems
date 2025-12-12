/**
 * @author Weiquan Mai
 * Problem 5.12
 * (Find the smallest n such that n^3 > 12,000)
 * Use a while loop to find the smallest integer n such that n^3 is greater than 12,000.
 */
public class Exercise05_12 {
    public static void main(String[] args){
        // Variable
        int n = 0;

        // Iterate in while loop to find n such that n^3 > 12000
        while(Math.pow(n, 3 ) <= 12000){
            n++;
        }

        // Display result
        System.out.println("Lowest value n such that n^3 > 12000 is " + n);
    }
}
