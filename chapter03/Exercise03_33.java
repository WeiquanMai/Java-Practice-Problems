/**
 * @Author Weiquan Mai
 * Problem 3.33
 * (Financial: compare costs)
 * Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost.
 * The program prompts the user to enter the weight and price of each package
 * and displays the one with the better price.
 */

import java.util.Scanner;

public class Exercise03_33 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for weight and price of package 1
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        // Ask for weight and price of package 2
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Calculate better option
        double pricePerWeight1 = price1 / weight1;
        double pricePerWeight2 = price2 / weight2;

        // Display result
        if(pricePerWeight1 > pricePerWeight2){
            System.out.println("Package 2 has a better price");
        }
        else if(pricePerWeight1 < pricePerWeight2){
            System.out.println("Package 1 has a better price");
        }
        else{
            System.out.println("The two packages have the same price");
        }

        // Close Scanner
        input.close();

    }
}
