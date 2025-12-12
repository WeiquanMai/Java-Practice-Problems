/**
 * @author Weiquan Mai
 * Problem 5.9
 * (Find the two lowest scores)
 * Write a program that prompts the user to enter the number of students and each student's name and score,
 * and finally displays the names of the students with the lowest and second-lowest scores.
 */

import java.util.Scanner;
public class Exercise05_09 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        String lowestScoreStudent = "";
        String secondLowestScoreStudent = "";
        double lowestScore = Double.POSITIVE_INFINITY;
        double secondLowestScore = Double.POSITIVE_INFINITY;

        // Prompt user for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Iterate through the loop for number of students
        for(int i = 0; i < numStudents; i++){
            // Prompt for student name and score
            System.out.print("Enter student name: ");
            String studentName = input.next();
            System.out.print("Enter student score: ");
            double studentScore = input.nextDouble();

            // Determine if score is lowest and/or second lowest
            if(studentScore < lowestScore){
                secondLowestScore = lowestScore;
                secondLowestScoreStudent = lowestScoreStudent;
                
                lowestScore = studentScore;
                lowestScoreStudent = studentName;
            }
            else if(studentScore < secondLowestScore){
                secondLowestScore = studentScore;
                secondLowestScoreStudent = studentName;
            }
        }

        // Display output
        System.out.println("Student with lowest score is " + lowestScoreStudent);
        System.out.println("Student with second lowest score is " + secondLowestScoreStudent);

        // Close Scanner
        input.close();
    }
}
