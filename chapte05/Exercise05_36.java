/**
 * @author Weiquan Mai
 * Problem 5.36
 * (Business application: checking ISBN)
 * Use loops to simplify Programing Exercise 3.9.
 */
import java.util.Scanner;
public class Exercise05_36 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter first 9 digit of ISBN
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        // Extract 9 digits from isbn
        int remaining = isbn;
        int dn = 0;
        int d10 = 0;

        for(int i = 1; i < 10; i++){
            int powerE = 9 - i;
            dn = (int)( remaining / (int) Math.pow(10, powerE));
            remaining = (int) (remaining % (Math.pow(10, powerE)));
            d10 += dn * i;
        }

        d10 = d10 % 11;

        // Display result
        System.out.print("The IBSN-10 number is ");
        System.out.printf("%09d", isbn);
        if(d10 == 10){
            System.out.print("X");
        }
        else{
            System.out.println(d10);
        }

        // Close Scanner
        input.close();
    }
}
