/**
 * @author Weiquan Mai
 * Problem 7.29
 * (Game: dice)
 * Suppose three dice are thrown at random.
 * Write a program that shows all possible permutations or configurations of the three dice
 * that yield the sum of nine.
 */
public class Exercise07_29 {
    public static void main(String[] args){
        // Initiate and populate dice
        int[] dice = new int[6];
        for(int i = 1; i <= 6; i++){
            dice[i - 1] = i;
        }

        // Use nested loop to simulate three dice rolls
        System.out.println("Possible permutations that add to 9: ");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                for(int k = 0; k < 6; k++){
                    if(dice[i] + dice[j] + dice[k] == 9){
                        System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
                    }
                }
            }
        }
    }
}
