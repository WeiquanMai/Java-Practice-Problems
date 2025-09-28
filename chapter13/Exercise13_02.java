/*
    Problem 13.2
    
    Write the following method that averages an ArrayList of integers:
    public static double average(ArrayList<Integer> list)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise13_02 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(average(list));

        // Close scanner
        input.close();
    }
    public static double average(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            return 0;
        }
        double accumulator = 0;

        for(int i = 0; i < list.size(); i++){
            accumulator += list.get(i);
        }
        return accumulator / list.size();
    }
}
