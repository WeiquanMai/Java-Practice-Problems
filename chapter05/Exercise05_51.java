/**
 * @author Weiquan Mai
 * Problem 5.51
 * (Longest common prefix)
 * Write a program that prompts the user to enter two strings
 * and displays the largest common prefix of the two strings.
 */

import java.util.Scanner;
public class Exercise05_51 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a stringBuilder
        StringBuilder sb = new StringBuilder();

        // Prompt user to enter two strings
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        // Find the shorter length
        int minStringLength = Math.min(s1.length(), s2.length());

        // Iterate through length and compare values. If values match, append it to string builder
        for(int i = 0; i < minStringLength; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 == ch2){
                sb.append(ch1);
            }
            else{
                break;
            }
        }

        // Display result
        System.out.println("The common prefix is " + sb);

        // Close Scanner
        input.close();
    }
}
