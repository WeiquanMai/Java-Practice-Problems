/**
 * @author Weiquan Mai
 * Problem 6.10
 * (Use the isprime Method)
 * Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method
 * for testing whether a number is prime.
 * Use the method to find the number of prime numbers less than 10000.
 */

public class Exercise06_10 {
    public static void main(String[] args){
        // Variables
        int counter = 0;

        // Iterate from 2 to 10000, if number is prime, iterate counter
        for(int i = 2; i <= 10000; i++){
            if(isPrime(i)){
                counter++;
            }
        }

        // Display result
        System.out.println("There are " + counter + " prime numbers less than 10000");
    }

    /**
     * isPrime method from textbook
     * @param number Number to check for prime condition
     * @return True if number is prime, false if not prime
     */
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
