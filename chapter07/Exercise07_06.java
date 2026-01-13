import java.util.Arrays;

/**
 * @author Weiquan Mai
 * Problem 7.6
 * (The Sieve of Eratosthenes)
 * The Sieve of Eratosthenes is an algorithm that finds all prime numbers
 * up to a given limit, n.
 * It works by creating an array of Booleans, flag, of size n + 1,
 * initializing the array to true (assuming every number is a prime number in the beginning),
 * and iteratively traversing the numbers from 2 to n,
 * setting the values of indices that are multiples of other numbers to false.
 * Write a program using the algorithm above, and display
 * all the prime numbers up to 50.
 */
public class Exercise07_06 {
    public static void main(String[] args){
        // Variables
        boolean[] flag = sieveOfEratosthenes(50);

        // Display all prime numbers up to 50
        for(int i = 2; i <= flag.length - 1; i++){
            if(flag[i] == true){
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Iterates through the array up to a certain value n, and sets multiples of value i as false
     * @param n Iterate up until value n
     * @return A boolean array of true/false, where true represents that the value is prime
     */
    public static boolean[] sieveOfEratosthenes(int n){
        // Create an array of Booleans, flag, of size n + 1
        boolean[] flag = new boolean[n + 1];

        // Initialize the array to true
        Arrays.fill(flag, true);

        /*
        Iteratively traverse the numbers from 2 to n,
        setting the values of indices that are multiples of other numbers to false
         */
        flag[0] = false;
        flag[1] = false;

        for(int i = 2; i <= flag.length - 1; i++){
            if(flag[i] == true){
                for(int j = i * i; j <= n; j += i){
                    flag[j] = false;
                }
            }
        }

        return flag;
    }

}
