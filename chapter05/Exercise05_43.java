/**
 * @author Weiquan Mai
 * Problem 5.43
 * (Math: combinations)
 * Write a program that displays all possible combinations for picking two numbers from integers 1 to 7.
 * Also display the total number of all combinations.
 */
public class Exercise05_43 {
    public static void main(String[] args){
        // Variable
        int combinationCounter = 0;

        // Utilize 2 for loops
        for(int i = 1; i < 8; i++){
            for(int j = i; j < 8; j++){
                // If i and j are the same, skip
                if(i == j){
                    continue;
                }
                // Else, display it and increase combination counter
                else{
                    System.out.println(i + " " + j);
                    combinationCounter++;
                }
            }
        }

        // Display result
        System.out.println("The total number of all combinations is " + combinationCounter);
    }
}
