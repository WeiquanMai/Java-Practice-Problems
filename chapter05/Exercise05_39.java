/**
 * @author Weiquan Mai
 * Problem 5.39
 * (Financial application: find the sales amount)
 * You have just started a sales job in a department store.
 * Yor pay consists of a base salary and a commission.
 * The base salary is $5,000. Your commission is determined by a commission rate.
 * Note that this is a graduated rate.
 * The rate for the first $5,000 is at 6%, the next $5,000 is at 8%,
 * and the rest is at 10%. If your sales amounts to $25,000,
 * the commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200.
 * Your goal is to earn $30,000 a year.
 * Write a program to find the minimum sales you have to generate in order to make $30,000.
 */
public class Exercise05_39 {
    public static void main(String[] args){
        // Variable
        double commission = 0;
        double sales = 0;
        double commissionSought = 30000;

        // Utilize while loop until commission is greater than or equal to commission sought
        while(commission < commissionSought){
            sales++;

            if(sales <= 5000){
                commission = sales * 0.06;
            }
            else if(sales <= 10000){
                commission = (5000 * 0.06) + ((sales - 5000) * 0.08);
            }
            else{
                commission = (5000 * 0.06) + (5000 * 0.08) + ((sales - 10000) * 0.10);
            }
        }

        // Display result
        System.out.printf("Sales required to earn $%.2f is $%.2f", commissionSought, sales);
    }
}
