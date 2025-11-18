/**
 * @Author Weiquan Mai
 * Problem 2.8
 * (Current time)
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the time zon offset to GMT
 * and displays the time in the specified time zone.
 */

import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the time zone offset to GMT: ");
        long offset = input.nextLong();

        // Obtain total milliseconds
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain total seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Obtain current seconds
        long currentSeconds = totalSeconds % 60;

        // Obtain total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain current minutes
        long currentMinutes = totalMinutes % 60;

        // Obtain total hour
        long totalHours = totalMinutes / 60;

        // Obtain current hour
        long currentHour = totalHours % 24;

        // Calculate offset hour
        long offsetHour =  currentHour + offset;

        // Display result
        System.out.println("The current time is " + offsetHour + ":"
            + currentMinutes + ":" + currentSeconds);

        // Close scanner
        input.close();
    }
}
