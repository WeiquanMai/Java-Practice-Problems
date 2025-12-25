/**
 * @author Weiquan Mai
 * Problem 6.16
 * (Number of days in a year)
 * Write a method that returns the number of days in a year
 * using the following header:
 * public static int numberOfDaysInAYear(int year)
 *
 * Write a test program that displays the number of days
 * in the years between 2014 and 2034.
 */

public class Exercise06_16 {
    public static void main(String[] args){
        // Header
        System.out.printf("%-8s%-12s\n", "Year", "Number Of Days");
        System.out.println("______________________");

        // Variable
        int accumulator = 0;

        // Iterate from year 2014 to year 2034
        for(int i = 2014; i <= 2034; i++){
            System.out.printf("%-8d%-12d\n", i, numberOfDaysInAYear(i));
            accumulator += numberOfDaysInAYear(i);
        }

        System.out.printf("%-8s%-12d", "Total", accumulator);
    }

    /**
     * Returns number of days in specified year
     * @param year Year to calculate number of days
     * @return Number of days in that year
     */
    public static int numberOfDaysInAYear(int year){
        boolean isLeapYear = (year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0);
        if(isLeapYear){
            return 366;
        }
        else{
            return 365;
        }
    }
}
