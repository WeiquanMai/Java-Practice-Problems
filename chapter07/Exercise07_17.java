/**
 * @author Weiquan Mai
 * Problem 7.17
 * (Sort students)
 * Write a program that prompts the user to enter the number of students,
 * the students' names, and their scores, and prints student names in
 * decreasing order of their scores.
 * Assume the name is a string without spaces, use the Scanner's next() method to read a name.
 */

import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of students, students' names, and their scores
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        String[] studentNames = new String[numberOfStudents];
        double[] studentScores = new double[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++){
            System.out.print("Enter name and score for student " + (i + 1) + ": ");
            studentNames[i] = input.next();
            studentScores[i] = input.nextDouble();
        }

        // Sort the scores and corresponding names from highest to lowest
        for(int i = 0; i < numberOfStudents; i++){
            // Find the max score in the list
            double currentMax = studentScores[i];
            int currentMaxIndex = i;
            String currentMaxName = studentNames[i];

            for(int j = i + 1; j < numberOfStudents; j++){
                if(currentMax < studentScores[j]){
                    currentMax = studentScores[j];
                    currentMaxIndex = j;
                    currentMaxName = studentNames[j];
                }
            }

            // Swap indexes if necessary
            if(currentMaxIndex != i){
                studentScores[currentMaxIndex] = studentScores[i];
                studentScores[i] = currentMax;
                studentNames[currentMaxIndex] = studentNames[i];
                studentNames[i] = currentMaxName;
            }
        }

        // Display results
        for(int i = 0; i < numberOfStudents; i++){
            System.out.println(studentNames[i] + " " + studentScores[i]);
        }

        // Close Scanner
        input.close();
    }
}
