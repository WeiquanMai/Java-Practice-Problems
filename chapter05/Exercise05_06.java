/**
 * @author Weiquan Mai
 * Problem 5.6
 * (Conversion from square meter to ping)
 * Write a program that displays the following two tables side by side (note that 1 ping = 3.305 square meters):
 * Ping    Square meter   |   Square meter    Ping
 * 10            33.050   |   30             9.077
 * 15            49.575   |   35            10.590
 * ...
 * 75           247.875   |   95            28.744
 * 80           264.400   |   100           30.257
 */
public class Exercise05_06 {
    public static void main(String[] args){
        // Header column
        System.out.printf("%4s   %12s  |  %12s   %4s\n", "Ping", "Square meter", "Square meter", "Ping");

        // Iterate through from 10 to 80
        for(int i = 10, j = 30; i < 85; i += 5, j += 5){
            double squareMeter1 = i * 3.305;
            double ping2 = j / 3.305;

            System.out.printf("%-4d   %12.3f  |  %-12d  %-5.3f\n", i, squareMeter1, j, ping2);
        }
    }
}
