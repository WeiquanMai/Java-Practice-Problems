/**
 * @author Weiquan Mai
 * Problem 10.16
 * (Divisible by 2 or 3)
 * Find the first 10 numbers with 50 decimal digits that are divisible by 2 or 3.
 */
import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args){
        // Variables
        BigInteger bigInt = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger bigInt3 = new BigInteger("3");
        int resultCounter = 0;
        int counter = 0;

        while(resultCounter < 10){
            BigInteger bigIntb = new BigInteger(Integer.toString(counter));
            BigInteger result1 = (bigInt.add(bigIntb)).remainder(BigInteger.TWO);
            BigInteger result2 = (bigInt.add(bigIntb)).remainder(bigInt3);
            if(result1.compareTo(BigInteger.ZERO) == 0 || result2.compareTo(BigInteger.ZERO) == 0){
                resultCounter++;
                System.out.println(bigInt.add(bigIntb));
            }
            counter++;
        }
    }
}
