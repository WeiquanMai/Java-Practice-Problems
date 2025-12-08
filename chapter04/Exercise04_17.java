/**
 * @Author Weiquan Mai
 * Problem 4.17
 * (Days of a month)
 * Write a program that prompts the user to enter the year
 * and the first three letters of a month name (with the first letter in uppercase)
 * and displays the number of days in the month.
 * If the input for month is incorrect, display a message as presented in the following sample runs.
 */
import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ask user to enter a year
        System.out.print("Enter a year: ");
        int userYear = input.nextInt();
        input.nextLine();

        // Ask user to enter a month
        System.out.print("Enter a month: ");
        String userMonth = input.nextLine();

        // Determine if year is a leap year
        boolean isLeapYear = (userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0);

        // Check month name
        boolean isCorrectMonth = false;
        for(int i = 0; i < 12; i++){
            if(userMonth.equals(months[i])){
                isCorrectMonth = true;
                break;
            }
        }

        if(!isCorrectMonth){
            System.out.println(userMonth + " is not a correct month name");
            System.exit(2);
        }

        // Display result

        // February of leap years have 29 days
        if(isLeapYear && userMonth.equals(months[1])){
            System.out.println(userMonth + " " + userYear + " has 29 days");
        }
        else{
            // Find month index
            for(int i = 0; i < 12; i++){
                if(userMonth.equals(months[i])){
                    System.out.println(userMonth + " " + userYear + " has " + days[i] + " days");
                    break;
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
