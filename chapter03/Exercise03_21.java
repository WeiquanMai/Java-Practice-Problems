/**
 * @Author Weiquan Mai
 * Problem 3.21
 * (Science: day of the week)
 * Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
 * The formula is:
 *      h = (q + 26(m + 1)/ 10 + k + k/4 + j/4 + 5j) % 7
 *      where:
 *          h is the day of the week(0:Saturday, 1:Sunday, 2:Monday, 3:Tuesday, 4:Wednesday, 5: Thursday, 6:Friday).
 *          q is the day of the month
 *          m is the month (3: March, 4:April,...,12:December)
 *              January and February are counted as months 13 and 14 of the previous year
 *          j is year / 100
 *          k is the year of the century (i.e., year % 100)
 *
 * Note all divisions in this exercise perform an integer division.
 * Write a program that prompts the user to enter a year, month, and day of the month,
 * and displays the name of the day of the week.
 */

import java.util.Scanner;

public class Exercise03_21 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user for year, month, and day of month
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: (1-31): ");
        int day = input.nextInt();

        // January and February are counted as 13 and 14 in the previous year
        if(month == 1 || month == 2){
            month = month + 12;
            year = year - 1;
        }

        // Calculate day using Zeller's congruence
        int j = year / 100;
        int k = year % 100;
        

        // Zeller's congruence formula
        int h = (day + (26 * (month + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

        // Display result
        String[] dayOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("Day of the week is " + dayOfWeek[h]);

        // Close Scanner
        input.close();
    }
}
