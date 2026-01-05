/**
 * @author Weiquan Mai
 * Problem 6.29
 * (Twin primes)
 * Twin primes are a pair of prime numbers that differ by 2.
 * For example, 3 and 5 are twin primes,
 * 5 and 7 are twin primes,
 * and 11 and 13 are twin primes.
 * Write a program to find all twin primes less than 1,200.
 * Display the output as follows:
 * (3, 5)
 * (5, 7)
 * ...
 *
 */
public class Exercise06_29 {
    public static void main(String[] args){
        // Find all twin primes less than 1,200
        for(int i = 2; i <= 1200; i++){
            if(isPrime(i) && isPrime(i + 2)){
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
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
