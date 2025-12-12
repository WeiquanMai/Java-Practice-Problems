/**
 * @author Weiquan Mai
 * Problem 5.5
 * (Conversion from C to F and F to C)
 * Write a program that displays the following two tables side by side:
 * Celsius   Fahrenheit   |   Fahrenheit   Celsius
 * 0             32.000   |   20            -6.667
 * 2             49.575   |   25            -3.889
 * ...
 * 98           208.400   |   265          129.444
 * 100          212.000   |   270          132.222
 */
public class Exercise05_05 {
    public static void main(String[] args){
        // Header column
        System.out.printf("%-8s %-10s   |   %10s   %7s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        // Iterate through from 0 to 100 for Celsius and 20 to 270 for Fahrenheit
        for(int i = 0, j = 20; i < 102; i += 2, j+=5){
            double fahrenheit1 = i * (9.0 / 5) + 32;
            double celsius2 = (j - 32) * (5.0 / 9);
            System.out.printf("%-7d  %10.3f   |   %-10d   %-7.3f\n", i, fahrenheit1, j, celsius2);
        }
    }
}
