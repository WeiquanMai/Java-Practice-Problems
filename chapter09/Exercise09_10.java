/*
  Problem 9.10
  Program tests the QuadraticEquation class, which is defined in a separate file, QuadraticEquation.java

    Design a class named QuadraticEquation for a quadratic equation ax^2 + bx + c = 0.
    The class contains:
        Private data fields a, b, and c that represent 3 coefficients
        A constructor with arguments for a, b, and c
        Three getter methods for a, b, and c
        A method named getDiscriminant() that returns the discriminant
        The methods named getRoot1() and getRoot2() for returning two roots of the equation

        Write a test program that prompts the user to enter values for a, b, and c
        and displays the result based on the discriminant.
        If the discriminant is positive, display the two roots.
        If the discriminant is , display the one root
        Otherwise display "The equation has no roots"
*/
import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the roots of a quadratic equation.");
        System.out.print("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation object1 = new QuadraticEquation(a,b,c);

        double discriminant = object1.getDiscriminant();

        if(discriminant > 0){
            System.out.println("The equation has two roots " + object1.getRoot1() + " and " + object1.getRoot2());
        }
        else if(discriminant == 0){
            System.out.println("The equation has one root " + object1.getRoot1());
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
