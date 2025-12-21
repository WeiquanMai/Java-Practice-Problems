/**
 * @author Weiquan Mai
 * Problem 6.11
 * (Financial application: compute commissions)
 * Write a method that computes the commission, using the scheme in Programming Execise 5.39.
 * The header of the method is as follows:
 * public static double computeCommission (double salesAmount)
 * Write a test program that displays the following table:
 * Sales Amount    Commission
 * __________________________
 * 10000            900.0
 * 15000           1500.0
 * ...
 * 95000          11100.0
 * 100000         11700.0
 */
public class Exercise06_11 {
    public static void main(String[] args){
        // Print header
        System.out.printf("%-12s    %-10s\n", "Sales Amount", "Commission");
        System.out.println("__________________________");

        // Iterate from 10000 to 100000 and display the commission
        for(int i = 10000; i <= 100000; i += 5000){
            System.out.printf("%-12d    %10.1f\n", i, computeCommission(i));
        }
    }

    /**
     * Calculate commission for an input sales amount based on the following commission rate:
     * 8% for first $5,000
     * 10% for next $5,000
     * 12% for everything afterward
     * @param salesAmount Input salesAmount used to calculate commission
     * @return Commission for sales amount given commission rate.
     */
    public static double computeCommission(double salesAmount){
        // Variables
        double commission = 0;

        // Logic for calculating commission
        if(salesAmount <= 5000){
            commission = salesAmount * 0.08;
        }
        else if(salesAmount <= 10000){
            commission = (5000 * 0.08) + ((salesAmount - 5000) * 0.1);
        }
        else{
            commission = (5000 * 0.08) + (5000 * 0.1) + ((salesAmount - 10000) * 0.12);
        }

        return commission;
    }
}
