/*
    Problem 12.3

    The previous program works well as long as the user enters an integer.
    Otherwise, you may get another kind of exception.
    For instance, if you use nextInt() of Scanner, you could have an InputMismatachException.
    Modify it to prevent users entering anything other than an integer

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // String and int array for months and numdays
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int [] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean keepRunning = true;

        do{
            try{
                // Ask user to enter an integer between 1 and 12
                System.out.print("Enter a number between 1 and 12: ");
                int choice = input.nextInt();

                System.out.println(months[choice - 1] + " has " + dom[choice - 1] + " days");
                keepRunning = false;
            }
            catch(ArrayIndexOutOfBoundsException | InputMismatchException e){
                System.out.println("Wrong number. Enter an integer between 1 and 12.");
                input.nextLine();
            }
        }
        while(keepRunning);


        // Close scanner
        input.close();
    }
}
