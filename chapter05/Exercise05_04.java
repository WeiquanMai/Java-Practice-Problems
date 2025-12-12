/**
 * @author Weiquan Mai
 * Problem 5.4
 * (Conversion from inch to centimeter)
 * Write a program that displays the following table(note that 1 inch is 2.54 centimeters):
 *
 * Inches   Centimeters
 * 1        2.54
 * 2        5.08
 * ...
 * 9        22.86
 * 10       25.4
 */
public class Exercise05_04 {
    public static void main(String[] args){
        // Header column
        System.out.println("Inches    Centimeters");

        // Iterate from 1 to 10
        for(int i = 1; i < 11; i++){
            double centimeters = i * 2.54;

            System.out.printf("%6d %8.2f\n", i, centimeters);
        }
    }
}
