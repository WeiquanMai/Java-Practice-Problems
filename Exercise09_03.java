/*
    Problem 9.3
    (Use the Date class)
    Write a program that creates a Date object, sets its elapsed time to:
        10000
        100000
        1000000
        10000000
        100000000
        1000000000
        10000000000
        100000000000
    and displays the date and time using the toString() method, respectively.
*/

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args){

        // Get current time
        long currentTime = System.currentTimeMillis();

        // Initialize elapsed time to 1000
        long elapsedTime = 1000;


        // Utilize for loop to iterate through elapsedTime
        for(int i = 0; i < 8; i++){
            elapsedTime = elapsedTime * 10;
            long futureTime = currentTime + elapsedTime;
            Date futureDate = new Date(futureTime);
            System.out.println("After " + elapsedTime + " milliseconds" + ", it will be " + futureDate);
        }
    }
}
