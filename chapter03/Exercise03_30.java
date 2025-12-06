/**
 * @Author Weiquan Mai
 * Problem 3.30
 * (Current time)
 * Revise Programming Exercise 2.8 to display the hour using a 12-hour clock
 */

import java.util.Scanner;

public class Exercise03_30 {
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
        long currentSecond = totalSeconds % 60;

        // Obtain total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain current minutes
        long currentMinute = totalMinutes % 60;

        // Obtain total hour
        long totalHours = totalMinutes / 60;

        // Offset total hours based on offset
        long totalHoursOffset = totalHours + offset;

        // Obtain current hour
        long currentHour = totalHoursOffset % 24;

        // Display offset time in 12-hour format
        if(currentHour == 0){
            System.out.println("Current time is 12:" + currentMinute + ":" + currentSecond + " AM");
        }
        else if(currentHour < 12){
            System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");
        }
        else if(currentHour == 12){
            System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
        }
        else if(currentHour > 12){
            System.out.println("Current time is " + (currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " PM");
        }
        else{
            System.out.println("Invalid time");
        }

        // Close Scanner
        input.close();
    }
}
