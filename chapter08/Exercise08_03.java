/**
 * @author Weiquan Mai
 * Problem 8.3
 * (Sort students on grades)
 * Rewrite Listing 8.2, GradeExam.java,
 * to display students in decreasing order of the number of correct answers.
 */
public class Exercise08_03 {
    public static void main(String[] args){
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Result array
        int[][] result = new int[8][2];

        // Grade all answers
        for(int i = 0; i < answers.length; i++){
            // Grade one student
            int correctCount = 0;
            for(int j = 0; j < answers[i].length; j++){
                if(answers[i][j] == keys[j]){
                    correctCount++;
                }
            }

            // Store student number and grade in result array
            result[i][0] = i;
            result[i][1] = correctCount;
        }

        // Utilize bubble sort to sort scores in descending order
        int numberofSwaps;
        boolean isSorted = false;

        while(!isSorted){
            numberofSwaps = 0;

            for(int i = 0; i < result.length - 1; i++){
                // Swap number correct and student score if number correct is bigger
                if(result[i + 1][1] > result[i][1]){
                    int tempScore = result[i + 1][1];
                    result[i + 1][1] = result[i][1];
                    result[i][1] = tempScore;

                    int tempStudent = result[i + 1][0];
                    result[i + 1][0] = result[i][0];
                    result[i][0] = tempStudent;
                    numberofSwaps++;
                }
            }

            if(numberofSwaps == 0){
                isSorted = true;
            }
        }

        // Display result
        for(int i = 0; i < result.length; i++){
            System.out.println("Student " + result[i][0] + " correct count is " + result[i][1]);
        }
    }
}
