/**
 * @Author Weiquan Mai
 * Problem 2.11
 * (Population projection)
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years
 * and display the population after the number of years.
 */
import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;
        double birthsPeryear = secondsPerYear / 7.0;
        double deathsPerYear = secondsPerYear / 13.0;
        double immigrantsPerYear = secondsPerYear / 45.0;
        double yearlyChange = birthsPeryear - deathsPerYear + immigrantsPerYear;

        // Ask for user input
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate new population
        int newPopulation = currentPopulation + (int)(yearlyChange * years);

        System.out.println("The population in " + years + " years is " + newPopulation);

        // Close scanner
        input.close();
    }
}
