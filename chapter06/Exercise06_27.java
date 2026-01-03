/**
 * @author Weiquan Mai
 * Problem 6.27
 * (Emirp)
 * An emirp (prime spelled backward) is a nonpalindromic prime number
 * whose reversal is also a prime.
 * For example, 17 is a prim enumber and 71 is a prime, so 17 and 71 are emirps.
 * Write a program that displays the first 120 emirps.
 * Display 10 numbers per line, separated by exactly one space.
 */
public class Exercise06_27 {
    public static void main(String[] args){
        // Variables
        int lineCounter = 0;
        int counter = 0;
        int i = 2;

        // Display the first 120 emirps
        while(counter < 120){
            if(isPrime(i) && isPrime(reverseNumber(i)) && !isPalindromic(i)){
                System.out.print(i + " ");
                counter++;
                lineCounter++;
            }

            // Display 10 per line
            if(lineCounter == 10){
                lineCounter = 0;
                System.out.println();
            }

            i++;
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
     * Reverses the input number
     * @param number input number
     * @return Reverse of input number
     */
    public static int reverseNumber(int number){
        int temp = number;
        int reverse = 0;

        while(temp > 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return reverse;
    }

    /**
     * Determines if number is palindromic
     * @param number Number to determine if palindromic
     * @return True if number is palindromic, otherwise false
     */
    public static boolean isPalindromic(int number){
        return number == reverseNumber(number);
    }
}
