/**
 * @author Weiquan Mai
 * Problem 7.35
 * (Game: hangman)
 * Write a hangman game that randomly generates a word and prompts the user to guess one letter at a time,
 * as presented in the sample run. Each letter in the word is displayed as an asterisk.
 * When the user makes a correct guess, the actual letter is then displayed.
 * When the user finishes a word, display the number of misses, and ask the user whether to continue
 * to play with another word. Declare an array to store words, as follows:
 * String[] words = {"write", "that", ...};
 */

import java.util.Scanner;
public class Exercise07_35 {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        boolean keepPlaying = true;

        while(keepPlaying){
            // Variables
            int numberOfMisses = 0;
            boolean validKeepPlaying = false;

            // Obtain random word
            String randomWord = getRandomWord();
            int numberOfCorrect = 0;
            int wordLength = randomWord.length();
            char[] randomWordArray = new char[wordLength];
            for(int i = 0; i < randomWordArray.length; i++){
                randomWordArray[i] = randomWord.charAt(i);
            }
            char[] guessArray = new char[wordLength];
            java.util.Arrays.fill(guessArray, '*');


            while(numberOfCorrect < wordLength){
                // Variables
                boolean guessMatched = false;
                boolean alreadyGuessed = false;

                // Prompt user to enter letter
                System.out.print("(Guess) Enter a letter in word ");
                for(int i = 0; i < guessArray.length; i++){
                    System.out.print(guessArray[i]);
                }
                char guess = input.next().charAt(0);

                // Check if user already made this guess
                for(int i = 0; i < guessArray.length; i++){
                    if(guess == guessArray[i]){
                        System.out.println(guess + " is already in the word");
                        alreadyGuessed = true;
                        break;
                    }
                }

                // If guess is already made, skip the rest of the loop
                if(alreadyGuessed){
                    System.out.println(guess + " is already in the word");
                    continue;
                }

                // Check if guess matches a letter
                for(int i = 0; i < guessArray.length; i++){
                    // If it matches the letter, update guess array and number of correct
                    if(guess == randomWordArray[i]){
                        guessArray[i] = guess;
                        guessMatched = true;
                        numberOfCorrect++;
                    }
                }

                // If guess does not have a match in word array, display incorrect guess, and iterate number of misses
                if(guessMatched == false){
                    System.out.println(guess + " is not in the word");
                    numberOfMisses++;
                }
            }
            // When user finishes guessing, display the word and number of misses
            System.out.println("The word is " + randomWord + ". You missed " + numberOfMisses + " time");
            System.out.println("Do you want to guess another word? Enter y or n: ");
            String keepPlayingInput = input.next();

            while(!validKeepPlaying){
                input.nextLine();
                if(keepPlayingInput.equalsIgnoreCase("y")){
                    keepPlaying = true;
                    validKeepPlaying = true;
                }
                else if (keepPlayingInput.equalsIgnoreCase("n")){
                    keepPlaying = false;
                    validKeepPlaying = true;
                }
                else{
                    System.out.println("Invalid input. Please enter y or n: ");
                    keepPlayingInput = input.next();
                }
            }
        }

        // Close Scanner
        input.close();
    }

    /**
     * Generates a random word from an array of words
     * @return Randomly picked word from word list
     */
    public static String getRandomWord(){
        String[] words = {"write", "that", "program", "introduction", "pokemon"};
        int randomNumber = (int) (Math.random() * words.length);
        return words[randomNumber];
    }
}
