/**
 * @Author Weiquan Mai
 * Problem 4.18
 * (Student major and status)
 * Write a program that prompts the user to enter two characters
 * and displays the major and status represented in the characters.
 * The first character indicates the major, and the second is a number character 1, 2, 3, 4,
 * which indicates whether a student is a freshman, sophomore, junior, or senior.
 * Suppose the following characters are used to denote the majors:
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 */

import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        String[] status = {"Freshman", "Sophomore", "Junior", "Senior"};

        // Ask user to enter two characters
        System.out.print("Enter two characters: ");
        String userInput = input.nextLine();

        // Input validation for only two characters
        if(userInput.length() != 2){
            System.out.println("You must enter exactly two characters!");
            System.exit(2);
        }

        // Parse input into major and status
        char userMajor = userInput.charAt(0);
        int userStatus = userInput.charAt(1) - '0';

        // Input validation for array range
        if(userStatus < 1 || userStatus > 4){
            System.out.println("Invalid input");
            System.exit(3);
        }


        // Determine output based on user input
        switch(userMajor){
            case 'I':{
                System.out.println("Information Management " + status[userStatus - 1]);
                break;
            }
            case 'C':{
                System.out.println("Computer Science " + status[userStatus - 1]);
                break;
            }
            case 'A':{
                System.out.println("Accounting " + status[userStatus - 1]);
                break;
            }
            default:
                System.out.println("Invalid input");
                break;
        }

        // Close Scanner
        input.close();
    }
}
