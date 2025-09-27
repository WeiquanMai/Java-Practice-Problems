/*
    Problem 12.2
    
    Write a program that promts the user to enter an integer between 1 and 12
    and then displays the months and its number of days according to the integer entered.
    Your program should display "wrong number" if the user enters a wrong number
    by catching ArrayIndexOutOfBoundsException
 */

import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // String and int array for months and numdays
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int [] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        try{
            // Ask user to enter an integer between 1 and 12
            System.out.print("Enter a number between 1 and 12: ");
            int choice = input.nextInt();
            System.out.println(months[choice - 1] + " has " + dom[choice - 1] + " days");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong number");
        }

        // Close scanner
        input.close();
    }
}
