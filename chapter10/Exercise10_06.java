/**
 * @author Weiquan Mai
 * Problem 10.6
 * (Display the prime numbers)
 * Write a program that displays all the prime numbers less than 120 in decreasing order.
 * Use the StackOfIntegers class to store the prime numbers(e.g., 2, 3, 5, ...)
 * and retrieve and display them in reverse order.
 */
public class Exercise10_06 {
    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();

        // Iterate through from 2 to 119
        for(int i = 2; i < 120; i++){
            // Determine if number is prime
            if(isPrime(i)){
                // If number is prime, store number inside stack
                stack.push(i);
            }
        }

        // Display result from stack
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
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
