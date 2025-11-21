/**
 * @Author Weiquan Mai
 * Problem 1.13
 * (Algebra solve 2 X 2 linear equations)
 * You can use Cramer's rule to solve the following 2 X 2 system of linear equation
 * provided that ad - bc is not 0:
 *    ax + by = e
 *    cx + dy = f
 * x = ed - bf / ad - bc
 * y = af - ec / ad - bc
 *
 * Write a program that solves the following equation and displays the value for x and y:
 * (Hint: replace the symbols in the formula with numbers to compute x and y.
 * This exercise can be done in Chapter 1 without using materials in later chapters.)
 *
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */
public class Exercise01_13 {
    public static void main(String[] args){
        // Variables
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
