/*
    Problem 13.3
    
    Write the following method that sorts an ArrayList of numbers:
       public static void sort(ArrayList<Number> list)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise13_03 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();

        list.add(1);
        list.add(2.5);
        list.add(-1);

        System.out.println(list);
        sort(list);
        System.out.println(list);

        // Close scanner
        input.close();

    }
    public static void sort(ArrayList<Number> list){
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = 0; j < list.size() - 1 - i; j++){
                if(list.get(j).doubleValue() > list.get(j + 1).doubleValue()){
                    Number temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
