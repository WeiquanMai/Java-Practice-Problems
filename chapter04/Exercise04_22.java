/**
 * @Author Weiquan Mai
 * Problem 4.22
 * (Check substring)
 * Write a program that prompts the user to enter two strings,
 * and reports whether the second string is a substring of the first string.
 */
import java.util.Scanner;

public class Exercise04_22 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to input string 1 and string 2
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        // Determine if string 2 is a substring of string 1
        boolean isSubstring = s1.contains(s2);

        // Display result
        if(isSubstring){
            System.out.println(s2 + " is a substring of " + s1);
        }
        else{
            System.out.println(s2 + " is not a substring of " + s1);
        }

        // Close Scanner
        input.close();
    }
}
