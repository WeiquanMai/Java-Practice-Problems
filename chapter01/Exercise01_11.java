/**
 * @Author Weiquan Mai
 * (Population projection)
 * The U.S. Census Bureau projects population based on the following assumptions:
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 * Assume that the current population is 312,032,486,
 * and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated.
 * To get an accurate result with the fractional part, one of the values involved
 * in the division must be a number with a decimal point.
 */
public class Exercise01_11 {
    public static void main(String[] args){
        // Variable
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;

        // Calculate births, deaths, and new immigrants per year
        double birthsPeryear = secondsPerYear / 7.0;
        double deathsPerYear = secondsPerYear / 13.0;
        double immigrantsPerYear = secondsPerYear / 45.0;
        double yearlyChange = birthsPeryear - deathsPerYear + immigrantsPerYear;

        // Calculate next five years
        double year1 = currentPopulation + yearlyChange;
        double year2 = year1 + yearlyChange;
        double year3 = year2 + yearlyChange;
        double year4 = year3 + yearlyChange;
        double year5 = year4 + yearlyChange;

        // Display results
        System.out.println("Population in one year: " + year1);
        System.out.println("Population in two years: " + year2);
        System.out.println("Population in three years: " + year3);
        System.out.println("Population in four years: " + year4);
        System.out.println("Population in five years: " + year5);
    }
}
