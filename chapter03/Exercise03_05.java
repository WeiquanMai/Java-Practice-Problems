/**
 * @Author Weiquan Mai
 * Problem 3.5
 * (Find future dates)
 * Write a program that prompts the user to enter an integer for today's day of the week
 * (Sunday is 0, Monday is 1, ..., and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future day
 * and display the future day of the week.
 */

import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for today's day
        System.out.print("Enter today's day: ");
        int currentDay = input.nextInt();

        // Ask for number of days elapsed
        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfDaysElapsed = input.nextInt();

        // Calculate and future day
        int futureDay = (currentDay + numberOfDaysElapsed) % 7;

        // Day array
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Display result
        System.out.println("Today is " + days[currentDay] + " and the future day is " + days[futureDay]);

        // Close Scanner
        input.close();
    }
}
