/**
 * @author Weiquan Mai
 * Problem 9.6
 * (Stopwatch)
 * Design a class named StopWatch. The class contains:
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 *
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */
import java.util.Random;

public class Exercise09_06 {
    public static void main(String[] args){
        // Create a StopWatch object
        StopWatch stopwatch = new StopWatch();

        // Generate 100,000 random numbers
        Random random = new Random();
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }

        // Initialize start time
        stopwatch.start();

        // Sort the array using selection sort
        for(int i = 0; i < array.length; i++){
            int smallest = array[i];
            int smallestIndex = i;

            for(int j = i; j < array.length; j++){
                if(array[j] < smallest){
                    smallest = array[j];
                    smallestIndex = j;
                }
            }

            // Swap the selected numbers
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }

        // Initialize end time and calculate elapsed time
        stopwatch.stop();

        System.out.println("Selection sort execution time: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}
