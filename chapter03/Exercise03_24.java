/**
 * @Author Weiquan Mai
 * Problem 3.24
 * (Game: pick a card)
 * Write a program that simulates picking a card from a deck of 52 cards.
 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
 * and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */

public class Exercise03_24 {
    public static void main(String[] args){
        // Rank Array
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7",
                        "8", "9", "10", "Jack", "Queen", "King"};
        // Suits Array
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

        // Generate random rank
        int randomRank = (int) (Math.random() * 13);

        // Generate random suit
        int randomSuit = (int) (Math.random() * 4);

        // Display result
        System.out.println("The card you picked is " + rank[randomRank] + " of " + suit[randomSuit]);
    }
}
