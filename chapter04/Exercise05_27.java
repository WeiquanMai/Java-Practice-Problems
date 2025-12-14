/**
 * @author Weiquan Mai
 * Problem 5.27
 * (Display leap years)
 * Write a program that displays all the leap years, ten per line, from 2014 to 2114,
 * separated by exactly one space. Also display the number of leap years in this period.
 */
public class Exercise05_27 {
    public static void main(String[] args){
        // Variables
        int numberOfLeapYears = 0;
        int lineCounter = 0;

        // Iterate from 2014 to 2114
        for(int i = 2014; i <= 2114; i++){
            // Determine if i is a leap year
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                System.out.print(i + " ");
                lineCounter++;
                numberOfLeapYears++;

                // Display ten leap years per line
                if(lineCounter == 10){
                    System.out.println();
                    lineCounter = 0;
                }
            }
        }
        System.out.println("\nNumber of leap years from 2014 to 2114 is " + numberOfLeapYears);
    }
}
