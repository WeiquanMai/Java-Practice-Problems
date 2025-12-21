/**
 * @author Weiquan Mai
 * Problem 6.8
 * (Conversions between mile and kilometer)
 * Write a class that contains the following two methods:
 *
 * public static double mileToKilometer (double mile)
 * public static double kilometerToMile(double kilometer)
 *
 * The formula for conversion is:
 * 1 mile = 1.6 kilometers
 * Write a test program that invokes these methods to display the following tables:
 *
 * Miles    Kilometers    |    Kilometers    Miles
 * _______________________________________________
 * 1        1.609         |    20            12.430
 * 2        3.218         |    25            15.538
 * ...
 * 9        14.481        |    60            37.290
 * 10       16.090        |    65            40.398
 */

public class Exercise06_08 {
    public static void main(String[] args){
        System.out.printf("%-8s %-14s|    %-14s %-8s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("____________________________________________________");

        // Iterate from 1 to 10 for miles, and 20 to 65 for kilometers, and display appropriate conversions
        for(int i = 1, j = 20; i <= 10; i++, j+= 5){
            System.out.printf("%-9d%-14.3f|    %d             %.3f\n", i, mileToKilometer(i), j, kilometerToMile(j));
        }
    }

    /**
     * Converts mile to kilometer
     * @param mile Input mile to be converted
     * @return Kilometer for input mile
     */
    public static double mileToKilometer (double mile){
        return mile * 1.6;
    }

    /**
     * Converts kilometer to mile
     * @param kilometer Input kilometer to be converted
     * @return Mile for input kilometer
     */
    public static double kilometerToMile (double kilometer){
        return kilometer / 1.6;
    }
}
