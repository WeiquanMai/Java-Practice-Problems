/**
 * @Author Weiquan Mai
 * Problem 3.11
 * (Find the number of days in a month)
 * Write a program that prompts the user to enter the month and year
 * and displays the number of days in the month.
 * For example, if the user entered month 2 and year 2012, the program should display that
 * February 2012 has 29 days.
 */

import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Create months array
        String[] months = {"January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"};

        // Create days array
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ask user for month and year
        System.out.println("Enter month and year in digit form, e.g., February 2012 is 2 2012");
        System.out.print("Month Year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        // Calculate if year is leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display number of days in month
        if(month == 2 && isLeapYear){
            System.out.println(months[1] + " " + year + " has 29 days");
        }
        else{
            System.out.println(months[month - 1] + " " + year + " has " + days[month - 1] + " days");
        }

        // Close scanner
        input.close();
    }
}
