/**
 * @author Weiquan Mai
 * Problem 6.32
 * (Game: chance of winning at craps)
 * Revise Exercise 6.30 to run it 15,000 times
 * and display the number of winning games.
 */
public class Exercise06_32 {
    public static void main(String[] args){
        int accumulator = 0;
        String winCondition = "You win";

        // Run the game craps 15000 times
        for(int i = 1; i <= 15000; i++){
            if(craps().equalsIgnoreCase(winCondition)){
                accumulator++;
            }
        }

        // Display result
        System.out.printf("You won %d times out of 15,000 times in craps", accumulator);
    }

    public static String craps(){
        // Variables
        int diceA = 0;
        int diceB = 0;
        int point = 0;

        // Roll two dice
        diceA = rollDice();
        diceB = rollDice();
        int sum = diceA + diceB;

        // Check sum of the two dice and display result
        return checkSum(sum);
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
    public static String checkSum(int sum){
        switch(sum){
            // If sum is 2, 3, or 12 (called craps), you lose
            case 2: case 3: case 12:
                return "You lose";

            // If sum is 7 or 11 (called natural), you win
            case 7: case 11:
                return "You win";
            // If sum is another value, a point is established
            case 4: case 5: case 6: case 8: case 9: case 10:

                while(true){
                    int diceA = rollDice();
                    int diceB = rollDice();
                    int sum2 = diceA + diceB;

                    // Continue to roll the dice until either a 7 or a same point value is rolled
                    // If same point value is rolled, you win
                    if(sum2 == sum){
                        return "You win";
                    }
                    // If 7 is rolled, you lose
                    else if(sum2 == 7){
                        return "You lose";
                    }
                }

        }

        return "Invalid result";
    }
}
