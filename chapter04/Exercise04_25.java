/**
 * @Author Weiquan Mai
 * Problem 4.25
 * (Generate vehicle plate numbers)
 * Assume that a vehicle plate number consists of three uppercase letters followed by four digits.
 * Write a program to generate a plate number.
 */

public class Exercise04_25 {
    public static void main(String[] args){
        // Generate three random uppercase letters
        // ASCII character A is 65 and Z is 90
        char ch1 = (char) (65 + (int) (Math.random() * 26));
        char ch2 = (char) (65 + (int) (Math.random() * 26));
        char ch3 = (char) (65 + (int) (Math.random() * 26));

        // Generate four random digits(0-9)
        int int1 = (int) (Math.random( ) * 10);
        int int2 = (int) (Math.random( ) * 10);
        int int3 = (int) (Math.random( ) * 10);
        int int4 = (int) (Math.random( ) * 10);

        System.out.println("Random vehicle plate number: " + ch1 + ch2 + ch3 + int1 + int2 + int3 + int4);
    }
}
