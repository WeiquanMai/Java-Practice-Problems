/**
 * @author Weiquan Mai
 * Problem 10.17
 * (Square numbers)
 * Find the first 10 square numbers that are greater than Long.MAX_VALUE.
 * A square number is a number in the form of n2. For example, 4, 9,
 * and 16 are square numbers. Find an efficient approach to run your program fast.
 */
import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args){
        // Variables
        BigInteger sqrtMaxValue = new BigInteger(Long.toString(Math.round(Math.sqrt(Long.MAX_VALUE))));
        BigInteger longMax = new BigInteger((Long.toString(Long.MAX_VALUE)));
        BigInteger bigInt = sqrtMaxValue;
        int resultCounter = 0;
        int counter = 0;

        while(resultCounter < 10){
            bigInt = bigInt.add(BigInteger.ONE);
            BigInteger bigIntSquared = bigInt.multiply(bigInt);
            if(bigIntSquared.compareTo(longMax) >= 1){
                System.out.println(bigIntSquared);
                resultCounter++;
            }
        }
    }
}
