/**
 * @Author Weiquan Mai
 * Problem 1.12
 * (Average speed in kilometers)
 * Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour
 * (Note 1 mile is equal to 1.6 kilometers)
 */
public class Exercise01_12 {
    public static void main(String[] args){
        // Variables
        int miles = 24;

        // Convert time to seconds, and then to hour
        int seconds = (1 * 60 * 60) + (40 * 60) + 35;
        double hour = seconds / (60.0 * 60.0);

        // Calculate result
        double kilometer = miles * 1.6;
        double kph = kilometer / hour;

        // Display result
        System.out.println("Kilometers Per Hour: " + kph);
    }
}
