import java.util.GregorianCalendar;

/**
 * @author Weiquan Mai
 * Problem 9.5
 * (Use the GregorianCalendar class)
 * Java API has the GregorianCalendar class in the java.util package,
 * which you can use to obtain the year, month, and day of a date.
 * The no-arg constructor constructs an instanec for the current date,
 * and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
 * and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 * Write a program to perform two tasks:
 * 1. Display the current year, month, and day.
 * 2. The GregorianCalendar class has the setTimeInMillis(long),
 * which can be used to set a specified elapsed time since January 1, 1970.
 * Set the value to 1234567898765L and display the year, month, and day.
 */
public class Exercise09_05 {
    public static void main(String[] args){
        // Create a Gregorian calendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // Display current year, month, day
        System.out.println("Current year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        // Display year month day after 1234567898765 milliseconds
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Time after 1234567898765 milliseconds: ");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
