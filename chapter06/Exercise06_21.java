/**
 * @author Weiquan Mai
 * Problem 6.21
 * (Phone keypads)
 * The international standard letter/number mapping for telephones
 * is given in Programming Exercise 4.15.
 * Write a method that returns a number, given an uppercase letter,
 * as follows:
 * public static int getNumber(char uppercaseLetter)
 *
 * Write a test program that prompts the user to enter a phone number as a string.
 * The input number may contain letters.
 * The program translates a letter(uppercase or lowercase) to a digit
 * and leaves all other characters intact.
 */

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Exercise06_21 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        s = s.toUpperCase();

        /*
        Iterate through length of the string
        If a letter is found, convert it to the appropriate number.
         */
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(isLetter(c)){
                System.out.print(getNumber(c));
            }
            else{
                System.out.print(s.charAt(i));
            }
        }

        // Close Scanner
        input.close();
    }

    /**
     * Converts letter to number based on international standard letter/number mapping
     * @param uppercaseLetter Uppercase letter to be converted
     * @return Number corresponding to uppercase letter according to international standard letter/number mapping
     */
    public static int getNumber(char uppercaseLetter){
        int num = 0;

        if(uppercaseLetter >= 'A' && uppercaseLetter <= 'C'){
            num = 2;
        }
        else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            num = 3;
        }
        else if(uppercaseLetter >= 'G' && uppercaseLetter <= 'I'){
            num = 4;
        }
        else if(uppercaseLetter >= 'J' && uppercaseLetter <= 'L'){
            num = 5;
        }
        else if(uppercaseLetter >= 'M' && uppercaseLetter <= 'O'){
            num = 6;
        }
        else if(uppercaseLetter >= 'P' && uppercaseLetter <= 'S'){
            num = 7;
        }
        else if(uppercaseLetter >= 'T' && uppercaseLetter <= 'V'){
            num = 8;
        }
        else if(uppercaseLetter >= 'W' && uppercaseLetter <= 'Z'){
            num = 9;
        }
        else{
            System.out.println(uppercaseLetter + " is an invalid input");
        }
        return num;
    }

}
