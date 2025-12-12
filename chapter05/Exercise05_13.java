/**
 * @author Weiquan Mai
 * Problem 5.13
 * (Find the largest n such that n^2 < 12,000)
 * Use a while loop to find the largest integer n such that n^2 is less than 12,000.
 */
public class Exercise05_13 {
    public static void main(String[] args){
        // Variable
        int n = 0;

        // Iterate in while loop until you find n such that n^2 < 12000
        while(Math.pow(n, 2) < 12000){
            n++;
        }

        // Display result
        System.out.println("Largest integer n such that n^2 is less than 12,000 is " + (n - 1));
    }
}
