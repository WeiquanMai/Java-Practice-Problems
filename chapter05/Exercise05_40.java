/**
 * @author Weiquan Mai
 * Problem 5.40
 * (Simulation: heads or tails)
 * Write a program that simulates flipping a coin two million times
 * and displays the number of heads and tails.
 */

public class Exercise05_40 {
    public static void main(String[] args){
        // Variables
        int numberOfHeads = 0;
        int numberOfTails = 0;
        int counter = 0;

        // Iterate from 1 to 2 million
        while(counter < 2000000){
            int random = (int) (Math.random() * 2);
            if(random == 0){
                numberOfTails++;
            }
            else{
                numberOfHeads++;
            }
            counter++;
        }

        // Display results
        System.out.println("Number of heads is " + numberOfHeads);
        System.out.println("Number of tails is " + numberOfTails);
    }
}
