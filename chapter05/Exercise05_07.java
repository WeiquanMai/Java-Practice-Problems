/**
 * @author Weiquan Mai
 * Problem 5.7
 * (Financial application: compute future tuition)
 * Suppose that the tuition for a university is $10,000 this year and increases 6% every year.
 * In one year, the tuition will be $10,600.
 * Write a program that computes the tuition in ten years
 * and the total cost of four years' worth of tuition after the tenth year.
 */
public class Exercise05_07 {
    public static void main(String[] args){
        // Variables
        final double YEARLY_INCREASE = 1.06;
        double currentTuition = 10000;
        double totalTuition = 0;

        // Calculate tuition after 10 years
        for(int i = 0; i < 10; i++){
            currentTuition = (currentTuition * YEARLY_INCREASE);
        }

        // Calculate total cost of four years of tuition after tenth year
        for(int i = 0; i < 4; i++){
            currentTuition = currentTuition * YEARLY_INCREASE;
            totalTuition += currentTuition;
        }

        // Display result
        System.out.printf("Total cost of four years' worth of tuition after the tenth year is $%.2f", totalTuition);
    }
}
