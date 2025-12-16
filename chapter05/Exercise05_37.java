/**
 * @author Weiquan Mai
 * Problem 5.37
 * (Decimal to binary)
 * Write a program that prompts the user to enter a decimal integer
 * then display its corresponding binary value.
 * Don't use Java's Integer.toBinaryString(int) in this program.
 */
import java.util.Scanner;
public class Exercise05_37 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create StringBuilder
        StringBuilder sb = new StringBuilder();

        // Variables
        int remainder = 0;
        int stringLength = 0;

        // Prompt user for integer
        System.out.print("Enter an integer number: ");
        int userInput = input.nextInt();

        // Determine length of binary string
        stringLength = (int) (Math.log(userInput) / Math.log(2));

        if(userInput <= 1){
            if(userInput == 1){
                System.out.println("Binary: 1");
                System.exit(1);
            }
            else if(userInput == 0){
                System.out.println("Binary: 0");
                System.exit(0);
            }
        }
        else{
            stringLength += 1;
        }

        // Convert to binary
        remainder = userInput;

        for(int i = stringLength; i > 0; i--){
            if(Math.pow(2, i - 1) <= remainder){
                remainder = remainder - (int)(Math.pow(2, i - 1));
                sb.append("1");
            }
            else{
                sb.append("0");
            }
        }

        //Display result
        System.out.println("Binary: " + sb);

        // Close Scanner
        input.close();
    }
}
