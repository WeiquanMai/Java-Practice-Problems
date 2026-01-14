/**
 * @author Weiquan Mai
 * Problem 7.24
 * (Simulation: coupon collector's problem)
 * Coupon collector is a classic statistics problemw ith many practical applications.
 * The problem is to repeatedly pick objects from a set of objects and find out
 * how many picks are needed for all the objects to be picked at least once.
 *
 * A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly,
 * and find out how many picks are needed before you see one of each suit.
 * Assume a picked card is placed back in the deck before picking another.
 * Write a program to simulate the number of picks needed to get four cards from each suit
 * and display the four cards picked (it is possible a card may be picked twice).
 */

public class Exercise07_24 {
    public static void main(String[] args){
        // Variables
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                          "10", "Jack", "Queen", "King"};
        boolean[] suitsPicked = new boolean[4];
        java.util.Arrays.fill(suitsPicked, false);
        int numberOfPicks = 0;
        int counter = 0;

        // Initialize deck of cards
        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        // Keep picking cards until we get one from each suit
        while(counter < 4){
            int randomPick = (int) (Math.random() * 52);

            if(suitsPicked[deck[randomPick] / 13] == false){
                System.out.println(ranks[deck[randomPick] % 13] + " of " + suits[deck[randomPick] / 13]);
                suitsPicked[deck[randomPick] / 13] = true;
                counter++;
            }

            numberOfPicks++;
        }

        System.out.println("Number of picks: " + numberOfPicks);
    }
}
