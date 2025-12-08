/**
 * @Author Weiquan Mai
 * Problem 4.24
 * (Enter three countries)
 * Write a program that prompts the user to enter three countries
 * and displays them in descending order.
 */

import java.util.Scanner;
public class Exercise04_24 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        String[] country = new String[3];

        // Ask user to enter three countries
        System.out.print("Enter the first country: ");
        country[0] = input.nextLine();
        System.out.print("Enter the second country: ");
        country[1] = input.nextLine();
        System.out.print("Enter the third country: ");
        country[2] = input.nextLine();

        // Compare the three countries
        String temp = "";

        for(int i = 0; i < 2; i++){
            for(int j = i + 1; j <= 2; j++){
                // Swap the countries if i is less than j
                if(country[i].compareTo(country[j]) < 0){
                    temp = country[i];
                    country[i] = country[j];
                    country[j] = temp;
                }
            }
        }
        // Display result
        System.out.println("The three countries in descending order are " + country[0] + " "
                            + country[1] + " " + country[2]);

        // Close Scanner
        input.close();
    }
}
