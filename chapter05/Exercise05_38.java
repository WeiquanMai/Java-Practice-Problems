/**
 * @author Weiquan Mai
 * Problem 5.38
 * (Decimal to octal)
 * Write a program that prompts the user to enter a decimal integer
 * and displays its corresponding octal value.
 * Don't use Java's Integer.toOctalString(int) in this program.
 */
import java.util.Scanner;
public class Exercise05_38 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create StringBuilder
        StringBuilder sb = new StringBuilder();

        // Variables
        int remainder = 0;

        // Prompt user for integer
        System.out.print("Enter an integer number: ");
        int userInput = input.nextInt();

        // Edge case
        if(userInput == 0){
            System.out.println("Octal: 0");
            System.exit(0);
        }

        // Convert to Octal
        remainder = userInput;
        while(remainder > 0){
            int octalChar = remainder % 8;
            remainder= remainder / 8;
            sb.insert(0, octalChar);
        }

        //Display result
        System.out.println("Octal: " + sb);

        // Close Scanner
        input.close();
    }
}
