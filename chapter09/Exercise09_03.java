/**
 * @author Weiquan Mai
 * Problem 9.3
 * (Use the Date class)
 * Write a program that creates a Date object, sets its elapsed
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the
 * toString() method, respectively.
 */

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args){
        for(long i = 10000; i <= 100000000000L; i *= 10){
            Date date = new Date(i);
            System.out.print("Elapsed time " + i + ": ");
            System.out.println(date.toString());
        }
    }
}
