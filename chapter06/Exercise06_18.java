/**

 @author Weiquan Mai
 Problem 6.18
 (Check password)
 Some websites impose certain rules for passwords.
 Write a method that hcecks whether a string is a valid password.
 Suppose the password rules are as follows:
 A password must have at least ten characters.
 A password consists of only letters and digits
 A password must contain at least three digits
  *
 Write a program that prompts the user to enter a password
 and displays Valid Password if the rules are followed
 or Invalid Password otherwise.*/

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Exercise06_18 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        // Determine if password is valid
        if(isValidPassword(password)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Determines if input password is valid
     * @param password Password to be checked
     * @return True if password is valid, and false if invalid
     */
    public static boolean isValidPassword(String password){
        boolean validPassword = true;

        if(password.length() < 10 || !passwordContainsLettersAndDigits(password) || !passwordContainsThreeDigits(password)){
            validPassword = false;
        }

        return validPassword;
    }

    /**
     * Determines if password only contains letters and digits
     * @param password Password to be checked
     * @return True if password only contains letters and digits, otherwise false
     */
    public static boolean passwordContainsLettersAndDigits(String password){

        boolean passwordOnlyContainsLettersAndDigits = true;

        // Iterate through length of password and determine if each character is a letter or a digit using ASCII chart
        for(int i = 0; i < password.length(); i++){
            if(!((password.charAt(i) > 47 && password.charAt(i) < 58)
                || (password.charAt(i) > 64 && password.charAt(i) < 91 )
                || (password.charAt(i) > 96 && password.charAt(i) < 123))){
                passwordOnlyContainsLettersAndDigits = false;
            }
        }
        return passwordOnlyContainsLettersAndDigits;
    }

    /**
     * Determines if password contains at least three digits
     * @param password Password to be checked
     * @return True if password contains at least three digits, otherwise false
     */
    public static boolean passwordContainsThreeDigits(String password){
        int counter = 0;

        // Iterate through counter and count number of times digits occur
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) > 47 && password.charAt(i) < 58){
                counter++;
            }
        }

        // A password must contain at least three digits
        return counter >= 3;
    }

}
