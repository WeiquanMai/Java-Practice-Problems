/**
 * @author Weiquan Mai
 * Problem 6.9
 * (Conversions between pounds and kilograms)
 * Write a class that contains the following two methods
 * public static double poundToKilogram(double pound)
 * public static double kilogramToPound(double kilogram)
 *
 * The formula for the conversion is:
 * pound = 2.204 * kilogram
 * kilogram = 0.453 * pound
 *
 * Write a test program tht invokes these methods to display the following tables:
 * Kilograms    Pounds    |    Pounds    Kilograms
 * _______________________________________________
 * 1            2.2       |    20        9.09
 * 3            6.6       |    25        11.36
 * ...
 * 197          433.4     |    510       231.82
 * 199          437.8     |    515       234.09
 */

public class Exercise06_09 {
    public static void main(String[] args){
        // Display header
        System.out.printf("%-13s%-10s|    %-10s%-13s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        System.out.println("_______________________________________________");

        // Iterate and display table
        for(int i = 1, j = 20; i <= 199; i += 2, j+= 5){
            System.out.printf("%-13d%-10.1f|    %-10d%-13.2f\n", i, kilogramToPound(i), j, poundToKilogram(j));
        }
    }

    /**
     * Converts pound to kilogram
     * @param pound Input pound to be converted
     * @return Kilogram amount for input pound
     */
    public static double poundToKilogram(double pound){
        final double POUND_TO_KILOGRAM_CONVERSION = 0.453;
        return pound * POUND_TO_KILOGRAM_CONVERSION;
    }

    /**
     * Converts kilogram to pound
     * @param kilogram Input kilogram to be converted
     * @return Pound amount for input kilogram
     */
    public static double kilogramToPound(double kilogram){
        final double KILOGRAM_TO_POUND_CONVERSION = 2.204;
        return kilogram * KILOGRAM_TO_POUND_CONVERSION;
    }
}
