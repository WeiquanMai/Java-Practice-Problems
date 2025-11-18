/**
 * @Author Weiquan Mai
 * Problem 1.7
 * (Approximate pi)
 * Pi can be computed using the following formula:
 * pi = 4 * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * Write a program that displays the result of 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).
 * use 1.0 instead of 1 in your program.
 */
public class Exercise01_07 {
    public static void main(String[] args){
        double approximatePI1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double approximatePI2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        System.out.println("Approximate 1: " + approximatePI1);
        System.out.println("Approximate 2: " + approximatePI2);
    }
}
