/**
 * @author Weiquan Mai
 * Problem 5.8
 * (Find the highest score)
 * Write a program that prompts the user to enter the number of students
 * and each student's name and score, and finally displays the name of the student with the highest score.
 * Use the next() method in the Scanner class to read a name, rather than using the nextLine() method.
 */

import java.util.Scanner;
public class Exercise05_08 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variable
        String maxScoreStudent = "";
        double maxScore = -1;

        // Prompt user for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Iterate through until number of students, asking for student's name and score
        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter student name: ");
            String studentName = input.next();
            System.out.print("Enter student score: ");
            double studentScore = input.nextDouble();
            if(studentScore > maxScore){
                maxScore = studentScore;
                maxScoreStudent = studentName;
            }
        }

        // Display student with highest score
        System.out.println("Student with highest score is " + maxScoreStudent);

        // Close Scanner
        input.close();
    }
}
