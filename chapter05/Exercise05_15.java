/**
 * @author Weiquan Mai
 * Problem 5.15
 * (Display the ASCII character table)
 * Write a program that prints the characters in the ASCII character table from ! to ~.
 * Display 1- characters per line.
 */
public class Exercise05_15 {
    public static void main(String[] args) {
        // Variables
        int lineCounter = 0;
        int startingChar = (int) '!';
        int endingChar = (int) '~';

        // Iterate through the list from ! to ~ and display each character
        for (int i = startingChar; i < endingChar + 1; i++) {

            System.out.print((char) i + " ");
            lineCounter++;

            // Display 10 characters per line
            if(lineCounter == 10){
                System.out.println();
                lineCounter = 0;
            }
        }
    }
}
