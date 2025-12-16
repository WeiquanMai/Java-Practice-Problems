/**
 * @author Weiquan Mai
 * Problem 5.42
 * (Financial application: find the sales amount)
 * Rewrite Programming Exercise 5.39 as follows:
 * Use a while loop instead of a do-while loop
 * Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */
import java.util.Scanner;

public class Exercise05_42 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variable
        double commission = 0;
        double sales = 0;

        // Prompt user for commission sought
        System.out.print("Enter amount of commission sought: ");
        double commissionSought = input.nextDouble();

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

        // Close Scanner
        input.close();
    }
}
