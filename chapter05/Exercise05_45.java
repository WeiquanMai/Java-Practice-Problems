/**
 * @author Weiquan Mai
 * Problem 5.45
 * (Statistics: compute mean and standard deviation)
 * In business applications, you are often asked to compute the mean and standard deviation of data.
 * The mean is simply the average of the numbers. The standard deviation is a statistic
 * that tells you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of students in a class?
 * How close are the ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter 10 numbers
 * and displays the mean and standard deviations of these numbers.
 */

import java.util.Scanner;

public class Exercise05_45 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double sum = 0;
        double sumSquared = 0;
        int n = 10;

        // Prompt user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");


        // Calculate summation
        for(int i = 0; i < 10; i++){
            double number = input.nextDouble();
            sum += number;
            sumSquared = sumSquared + Math.pow(number, 2);
        }

        // Calculate mean
        double mean = sum / n;

        // Calculate standard deviation

        double standardDeviation = Math.sqrt((sumSquared - (Math.pow(sum, 2) / n)) / (n - 1));

        // Display result
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + standardDeviation);

        // Close Scanner
        input.close();
    }
}
