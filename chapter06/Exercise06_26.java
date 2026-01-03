import java.util.Scanner;

/**
 * @author Weiquan Mai
 * Problem 6.26
 * (Palindromic prime)
 * A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime,
 * as are 313 and 757.
 * Write a program that displays the first 120 palindromic prime numbers.
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 */
public class Exercise06_26 {
    public static void main(String[] args){
        int counter = 0;
        int lineCounter = 0;
        int i = 2;

        while(counter < 120){
            if((isPrime(i) && (isPalindromic(i)))){
                System.out.print(i + " ");
                counter++;
                lineCounter++;
            }
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
     * Determines if number is palindromic
     * @param number Number to determine if palindromic
     * @return True if number is palindromic, otherwise false
     */
    public static boolean isPalindromic(int number){
        int reverse = 0;
        int temp = number;

        while (temp > 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}
