/**
 * @author Weiquan Mai
 * Problem 6.12
 * (Display numbers)
 * Write a method that prints numbers using the following header:
 * public static void printNumbers(int num1, int num2, int numberPerLine)
 *
 * This method prints the characters between num1 and num2
 * with the specified numbers per line.
 * Write a test program that prints ten characters per line from 1 to 100.
 * Numbers are separated by exactly one space.
 */
public class Exercise06_12 {
    public static void main(String[] args){
        printNumbers(1, 100, 10);
    }

    /**
     * Display numbers from num1 to num2 with specified numbers per line.
     * @param num1 Beginning number
     * @param num2 Ending number
     * @param numberPerLine Numbers per line to be displayed
     */
    public static void printNumbers(int num1, int num2, int numberPerLine){
        int counter = 0;

        // Iterate from num1 to num2, and display characters based on numberPerLine
        for(int i = num1; i <= num2; i++){
            System.out.print(i + " ");
            counter++;

            if(counter == numberPerLine){
                System.out.println();
                counter = 0;
            }
        }
    }
}
