/*
    Problem 9.4
    (Use the Random class)
    Write a program that creates a Random object with seed 1000,
    and displays the first 50 random integers between 0 and 100 using the nextInt(100) method.
*/

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args){
        Random randomGenerator = new Random(1000);

        System.out.println("50 randomly generated numbers");
        for(int i = 0; i < 50; i++){
            System.out.print(randomGenerator.nextInt(100) + " ");
        }
    }
}
