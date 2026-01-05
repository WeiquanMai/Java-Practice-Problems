/**
 * @author Weiquan Mai
 * Problem 6.28
 * (Mersenne prime)
 * A prime number is called a Mersenne prime if it can be written
 * in the form 2^p - 1 for some positive integer p.
 *
 * Write a progrma that finds all Mersenne primes with p <= 31
 * and displays the output as follows:
 * p        2^p-1
 * ______________
 * 2        3
 * 3        7
 * 5        31
 * ...
 */
public class Exercise06_28 {
    public static void main(String[] args){
        // Create header column
        System.out.printf("%-5s %-5s\n", "p", "2^p-1");
        System.out.println("___________");

        // Determine and display Mersenne prime with p <= 31
        for(int i = 2; i <= 31; i++){
            if(isPrime(i) && isPrime(mersennePrime(i))){
                System.out.printf("%-5d %-5d\n", i, mersennePrime(i));
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

    /**
     * Displays the mersennePrime number
     * @param number prime number
     * @return Mersenne number
     */
    public static int mersennePrime(int number){
        return ((int) Math.pow(2, number) )- 1;
    }
}
