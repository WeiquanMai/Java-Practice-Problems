/**
 * @author Weiquan Mai
 * Problem 7.7
 * (Count single digits)
 * Write a program that generates 200 random integers between 0 and 9,
 * and displays the count for each number.
 */

public class Exercise07_07 {
    public static void main(String[] args){
        // Create an array of 200 random integers
        int[] randomIntArray = new int[200];
        for(int i = 0; i < 200; i++){
            randomIntArray[i] = (int) (getRandomDigitCharacter() - '0');
        }

        // Count integers
        int[] counts = new int[10];
        for(int i = 0; i < randomIntArray.length; i++){
            counts[randomIntArray[i]]++;
        }

        // Display result
        for(int i = 0; i < counts.length; i++){
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }

    /**
     *
     * @return Random digit character between 0 and 9
     */
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }

    /**
     * Generates and returns a random character between ch1 and ch2
     * @param ch1 Beginning character range
     * @param ch2 End character range
     * @return Random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}
f
