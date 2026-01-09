/**
 * @author Weiquan Mai
 * Problem 6.38
 * (Generate random characters)
 * Use the methods in RandomCharacter in Listing 6.10
 * to print 200 uppercase letters and then 200 single digits,
 * printing ten per line.
 */
public class Exercise06_38 {
    public static void main(String[] args){
        // Variable
        int lineCounter = 0;

        // Print 200 uppercase letters, ten per line
        for(int i = 0; i < 200; i++){
            System.out.print(getRandomUpperCaseLetter() + " ");
            lineCounter++;

            if(lineCounter == 10){
                System.out.println();
                lineCounter = 0;
            }
        }

        // Then print 200 single digits, ten per line
        for(int i = 0; i < 200; i++){
            System.out.print(getRandomDigitCharacter() + " ");
            lineCounter++;

            if(lineCounter == 10){
                System.out.println();
                lineCounter = 0;
            }
        }
    }

    /**
     * Generate a random character between ch 1 and ch2
     * @param ch1 Beginning character range
     * @param ch2 End character range
     * @return Random character between ch 1 and ch 2
     */
    public static char getRandomCharacter(char ch1, char ch2){
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random uppercase letter
     * @return Random uppercase letter
     */
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     * @return Random digit character
     */
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }
}
