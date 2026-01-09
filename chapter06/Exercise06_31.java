/**
 * @author Weiquan Mai
 * Problem 6.31
 * (Financial: credit card number validation)
 * Credit card numbers follow certain patterns.
 * A credit card number must have between 13 and 16 digits.
 * It must start with
 *      4 for Visa cards
 *      5 for Master cards
 *      37 for American Express cards
 *      6 for Discover cards
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers.
 * The algorithm is useful to determine whether a credit card number is entered correctly,
 * or whether a credit card is scanned correctly by a scanner.
 * Credit card numbers are generated following this validity check,
 * commonly known as the Luhn check or the Mod 10 check.
 *
 * Write a program that prompts the user to enter a credit card number as a long integer.
 * Display whether the number is valid or invalid.
 */
import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a credit card number
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        // Determine and display result
        if(isValid(number)){
            System.out.printf("%d is valid", number);
        }
        else{
            System.out.printf("%d is invalid", number);
        }

        // Close Scanner
        input.close();
    }

    /**
     * Return true if the card number is valid
     * @param number Card number to check
     * @return True if card number is valid, otherwise false
     */
    public static boolean isValid(long number){
        int num1 = sumOfDoubleEvenPlace(number);
        int num2 = sumOfOddPlace(number);
        int sum = num1 + num2;

        // If the result is divisible by 10, the card number is valid
        if(sum % 10 == 0){
            if(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6)
                || prefixMatched(number, 37)){
                return true;
            }
        }
        return false;
    }

    /**
     * Get the result from Step 2
     * @param number Credit card number to check
     * @return Sum of result from step 2
     *
     */
    public static int sumOfDoubleEvenPlace(long number){
        int numberSize = getSize(number);
        int accumulator = 0;
        String s = Long.toString(number);

        // Double every second digit from right to left
        for(int i = numberSize - 2; i >= 0; i -= 2){
            int digit = getDigit( s.charAt(i) - '0');
            accumulator += digit;
        }

        return accumulator;
    }

    /**
     * Return this number if it is a single digit,
     * otherwise, return the sum of the two digits
     * @param number Number to calculate
     * @return Either this digit, or the sum of the two digits
     */
    public static int getDigit(int number){
        int sum = number * 2;

        // If doubling of digit results in a two-digit number, add up the two digits
        if(sum >= 10){
            int digit1 = sum % 10;
            int digit2 = (sum - digit1) / 10;

            sum = digit1 + digit2;
        }
        return sum;
    }

    /**
     * Return sum of odd-place digits in number
     * @param number Credit card number to check
     * @return Sum of odd place digits in number
     */
    public static int sumOfOddPlace(long number){
        int numberSize = getSize(number);
        int accumulator = 0;
        String s = Long.toString(number);

        // Sum every odd digit from right to left
        for(int i = numberSize - 1; i >= 0; i -= 2){
            int digit = s.charAt(i) - '0';
            accumulator += digit;
        }

        return accumulator;
    }

    /**
     * Return true if the number d is a prefix for number
     * @param number Number to check
     * @param d Prefix value to check
     * @return True if d is a prefix value for number
     */
    public static boolean prefixMatched(long number, int d){
        int dSize = getSize(d);
        String dString = Integer.toString(d);
        String numberString = Long.toString(number);

        // Match d in number
        for(int i = 0; i <= dSize - 1; i++){
            if(dString.charAt(i) != numberString.charAt(i)){
                return false;
            }
        }

        return true;
    }

    /**
     * Return the number of digits in d
     * @param d Input d to get number of digits
     * @return Number of digits in d
     */
    public static int getSize(long d){
        String s = Long.toString(d);
        return s.length();
    }

    /**
     * Return the first k number of digits from number.
     * If the number of digits in number is less than k, return number.
     * @param number Number to check
     * @param k Number of digits to return from number
     * @return K number of digits if number of digits is less than K, otherwise, return number
     */
    public static long getPrefix(long number, int k){
        int numberLength = getSize(number);
        if(numberLength < k){
            return number;
        }

        String numberString = Long.toString(number);
        return Integer.parseInt(numberString.substring(0, k));
    }
}
