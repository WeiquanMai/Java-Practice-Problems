/**
 * @Author Weiquan Mai
 * Problem 4.16
 * (Random character)
 * Write a program that displays a random lowercase letter using the Math.random() method.
 */
public class Exercise04_16 {
    public static void main(String[] args){
        // Generate random integer that encapsules lowercase letters in ASCII chart
        int randomInt = 97 + (int)(Math.random() * 26);

        // Convert randomInt into a char
        char ch = (char) randomInt;

        // Display random lowercase letter
        System.out.println("Random lowercase letter: " + ch);
    }
}
