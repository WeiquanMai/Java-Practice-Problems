/**
 * @author Weiquan Mai
 * Problem 5.3
 * (Conversion from C to F)
 * Write a program that displays the following table (note that farenheit = celsius * 9/5 + 32)
 * Celsius   Fahrenheit
 * 0              32.0
 * 2              35.6
 * ...
 * 98            208.4
 * 100           212.0
 */
public class Exercise05_03 {
    public static void main(String[] args){

        // Display header column
        System.out.println("Celsius   Fahrenheit");

        // Iterate from 0 to 100 but display even numbers only
        for(int i = 0; i < 101; i+= 2){
            double fahrenheit = i * (9.0/5) + 32;
            System.out.printf("%-10d %9.1f\n", i, fahrenheit);
        }
    }
}
