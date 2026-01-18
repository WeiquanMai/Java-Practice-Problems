/**
 * @author Weiquan Mai
 * Problem 8.4
 * (Compute the weekly hours for each employee)
 * Suppose the weekly hours for all employees are stored in a two-dimensional array.
 * Each row records an employee's seven-day work hours with seven columns.
 * Write a program that displays employees and their total hours
 * in increasing order of the total hours.
 */
public class Exercise08_04 {
    public static void main(String[] args){
        // Employee hours
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // Results array
        int[][] result = new int[8][2];

        // Compute total hours and store it in result array
        for(int row = 0; row < hours.length; row++){
            int totalHours = 0;
            for(int column = 0; column < hours[row].length; column++){
                totalHours += hours[row][column];
            }

            result[row][0] = row;
            result[row][1] = totalHours;
        }

        // Sort result array with bubble sort
        boolean isSorted = false;
        int numberOfSwaps;

        while(!isSorted){
            numberOfSwaps = 0;
            for(int i = 0; i < result.length - 1; i++){
                // Swap hours if they are smaller so that it displays in increasing order
                if(result[i + 1][1] < result[i][1]){
                    // Swap hours
                    int tempHour = result[i + 1][1];
                    result[i + 1][1] = result[i][1];
                    result[i][1] = tempHour;
                    numberOfSwaps++;

                    // Swap number
                    int tempNumber = result[i + 1][0];
                    result[i + 1][0] = result[i][0];
                    result[i][0] = tempNumber;
                }
            }

            if(numberOfSwaps == 0){
                isSorted = true;
            }
        }

        // Display result
        for(int i = 0; i < result.length; i++){
            System.out.println("Employee " + result[i][0] + " worked " + result[i][1] + " hours");
        }


    }
}
