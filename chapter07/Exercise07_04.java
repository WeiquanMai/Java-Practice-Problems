/**
 * @author Weiquan Mai
 * Problem 7.4
 * (Analyze scores)
 * Write a programt hat reads an unspecified number of scores
 * and determiens how many scores are above or equal to the average,
 * and how many scores are below the average.
 * Enter a negative number to signify the end of the input.
 * Assume the maximum number of scores is 100.
 */

import java.util.Scanner;
public class Exercise07_04 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double[] scores = new double[100]; // Assume the maximum number of scores is 100
        int counter = 0;
        double accumulator = 0;
        double average = 0;
        int counterAboveAverage = 0;
        int counterEqualAverage = 0;
        int counterBelowAverage = 0;

        // Prompt user to enter scores
        System.out.print("Enter scores between 0 and 100 (negative number to exit): ");
        double number = input.nextDouble();

        // Enter a negative number to signify the end of the input
        while(number >= 0){
            scores[counter] = number;
            counter++;

            // Update average
            accumulator += number;
            average = accumulator / counter;

            number = input.nextDouble();
        }

        // Determine how many scores are above, equal to average, or below average.
        for(int i = 0; i < counter; i++){
            if(scores[i] > average){
                counterAboveAverage++;
            }
            else if(scores[i] < average){
                counterBelowAverage++;
            }
            else{
                counterEqualAverage++;
            }
        }

        // Display result
        System.out.println(counterAboveAverage + " scores above average");
        System.out.println(counterEqualAverage + " scores equal to average");
        System.out.println(counterBelowAverage + " scores below average");

        // Close Scanner
        input.close();
    }
}
