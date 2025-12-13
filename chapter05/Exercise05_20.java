/**
 * @author Weiquan Mai
 * Problem 5.20
 * (Display prime numbers between 2 and 1,200)
 * Modify Listing 5.15 to display all the prime numbers between 2 and 1,200, inclusive.
 * Display eight prime numbers per line. Numbers are separated by exactly one space.
 */

public class Exercise05_20 {
    public static void main(String[] args){
        // Variables
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int lineCounter = 0;

        // Iterate from 2 to 1,200 inclusive
        for(int i = 2; i <= 1200; i++){
            boolean isPrime = true;

            // Test whether number is prime
            for(int divisor = 2; divisor <= i / 2; divisor++){
                if(i % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            // If the value is prime, display the value and increase the line counter
            if(isPrime){
                System.out.print(i + " ");
                lineCounter++;

                // Move to new line if there are 8 primes in the line
                if(lineCounter == 8){
                    System.out.println();
                    lineCounter = 0;
                }
            }
        }
    }
}
