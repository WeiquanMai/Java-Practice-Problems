/**
 * @author Weiquan Mai
 * Problem 7.22
 * (Count the number of vowels in a string)
 * Write a program that prompts the user to enter a string,
 * and counts and displays the number of both lowercase and uppercase vowels
 * in the string.
 */

import java.util.Scanner;

public class Exercise07_22 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Vowels
        int numberOfLowercaseVowels = 0;
        int numberOfUppercaseVowels = 0;

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Count the number of both lowercase and uppercase vowels
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') ||
                    (s.charAt(i) == 'o') || (s.charAt(i) == 'u')){
                numberOfLowercaseVowels++;
            }
            else if((s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I') ||
                    (s.charAt(i) == 'O') || (s.charAt(i) == 'U')){
                numberOfUppercaseVowels++;
            }
            else{
                continue;
            }
        }

        // Display result
        System.out.println("Number of lowercase vowels is " + numberOfLowercaseVowels);
        System.out.println("Number of uppercase vowels is " + numberOfUppercaseVowels);

        // Close Scanner
        input.close();
    }
}
