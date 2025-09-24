/*
    A linear equation can be solved using Cramer's rule.
    Design a class named LinearEquation for a 2x2 system of linear equations.
    The class contains:
        - Private data fields a, b, c, d, e, and f
        - A constructor with the arguments for a, b, c, d, e, and f
        - Six getter methods for a, b, c, d, e, and f
        - A method named isSolvable() that returns true if ad - bc is not 0
        - Methods getX() and getY() that return the solution for the equation

        Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result.
        If ad-bc is 0, report that "The equation has no solution."
 */
import java.util.Scanner;

public class Exercise09_11 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt for linear equations
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);

        if(equation.isSolvable()){
            System.out.printf("x is %.2f and y is %.2f \n", equation.getX(), equation.getY());
        }
        else{
            System.out.println("This equation has no solution.");
        }

        // Close scanner
        input.close();
    }
}
