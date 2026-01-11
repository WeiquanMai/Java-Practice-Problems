/**
 * @author Weiquan Mai
 * Problem 7.1
 * (Assign grades)
 * Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * Grade is A if score is >= best -5
 * Grade is B if score is >= best -10;
 * Grade is C if score is >= best -15;
 * Grade is D if score is >= best -20;
 * Grade is F otehrwise.
 *
 * The program prompts the user to enter the total number of students,
 * and then prompts the user to enter all of the scores,
 * and concludes by displaying the grades.
 */

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Input validation
        while(numberOfStudents <= 0){
            System.out.print("Invalid number of students. Please enter a number greater than 0: ");
            numberOfStudents = input.nextInt();
        }

        // Prompt user to enter scores
        System.out.print("Enter " + numberOfStudents + " scores: " );

        // Create an array and populate array utilizing for loop
        double[] studentScores = new double[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++){
            studentScores[i] = input.nextInt();
        }

        // Iterate through the array to find best score
        double best = studentScores[0];

        for(int i = 1; i < studentScores.length; i++){
            if(studentScores[i] > best){
                best = studentScores[i];
            }
        }

        // Determine grades and display results
        for(int i = 0; i < studentScores.length; i++){
            System.out.print("Student " + i + " scores is " + studentScores[i] + " and grade is ");
            if(studentScores[i] >= best - 5){
                System.out.println("A");
            }
            else if(studentScores[i] >= best - 10){
                System.out.println("B");
            }
            else if(studentScores[i] >= best - 15){
                System.out.println("C");
            }
            else if(studentScores[i] >= best - 20){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
        }

        // Close Scanner
        input.close();
    }
}
