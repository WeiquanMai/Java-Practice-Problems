/**
 * @author Weiquan Mai
 * Problem 6.30
 * (Game: craps)
 * Craps is a popular dice game played in casinos.
 * Write a program to play a variation of the game, as follows:
 * Roll two dice.
 * Each die has six faces representing values 1, 2, ..., and 6, respectively.
 * Check the sum of the two dice.
 * If the sum is 2, 3, or 12 (called craps), you lose;
 * if the sum is 7 or 11 (called natural), you win;
 * if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established.
 * Continue to roll the dice until either a 7 or the same point value is rolled.
 * If 7 is rolled, you lose.
 * Otherwise, you win.
 * Your program acts as a single player.
 */
public class Exercise06_30 {
    public static void main(String[] args){
        // Variables
        int diceA = 0;
        int diceB = 0;
        int point = 0;

        // Roll two dice
        diceA = rollDice();
        diceB = rollDice();
        int sum = diceA + diceB;

        // Display roll
        System.out.printf("You rolled %d + %d = %d\n", diceA, diceB, sum);

        // Check sum of the two dice and display result
        checkSum(sum);
    }

    /**
     * Generates a random number between 1 and 6 inclusive
     * @return Integer between 1 and 6 inclusive
     */
    public static int rollDice(){
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * Displays result of the sum of the two dice roll
     * @param sum Input sum of two dice roll
     */
    public static void checkSum(int sum){
        switch(sum){
            // If sum is 2, 3, or 12 (called craps), you lose
            case 2: case 3: case 12:
                System.out.println("You lose");
                break;

                // If sum is 7 or 11 (called natural), you win
            case 7: case 11:
                System.out.println("You win");
                break;
                // If sum is another value, a point is established
            case 4: case 5: case 6: case 8: case 9: case 10:
                System.out.println("point is " + sum);
                
                while(true){
                    int diceA = rollDice();
                    int diceB = rollDice();
                    int sum2 = diceA + diceB;

                    System.out.printf("You rolled %d + %d = %d\n", diceA, diceB, sum2);

                    // Continue to roll the dice until either a 7 or a same point value is rolled
                    // If same point value is rolled, you win
                    if(sum2 == sum){
                        System.out.println("You win");
                        break;
                    }
                    // If 7 is rolled, you lose
                    else if(sum2 == 7){
                        System.out.println("You lose");
                        break;
                    }
                }

        }
    }
}
