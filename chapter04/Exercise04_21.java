/**
 * @Author Weiquan Mai
 * Problem 4.21
 * (Check SSN)
 * Write a program that prompts the user to enter a Social Security Number in the format DDD-DD-DDDD,
 * where D is a digit.
 * Your program should check whether the input is valid.
 */

import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a SSN
        System.out.print("Enter a SSN in DDD-DD-DDDD format:");
        String ssn = input.nextLine();

        boolean validSSN = true;

        // Input validation on Social Security Number

        // Length validation
        if(ssn.length() != 11){
            validSSN = false;
        }
        // Hyphen validation
        else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-'){
            validSSN = false;
        }

        // Digit validation
        int ddd = Integer.parseInt(ssn.substring(0,3));
        int dd = Integer.parseInt(ssn.substring(4,6));
        int dddd = Integer.parseInt(ssn.substring(7,11));
        boolean validIntegers = (ddd <= 999 && dd <= 99 && dddd <= 9999);

        if(!validIntegers){
            validSSN = false;
        }

        // Display results
        if(validSSN){
            System.out.println(ssn + " is a valid social security number");
        }
        else if(!validSSN){
            System.out.println(ssn + " is an invalid social security number");
        }
        else{
            System.out.println("Invalid input");
        }

        // Close Scanner
        input.close();
    }
}
