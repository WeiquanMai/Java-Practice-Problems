/**
 * @author Weiquan Mai
 * Problem 11.14
 * (Combine two lists)
 * Write a method that return sthe union of two array lists of integers
 * using the following header:
 * public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 *
 * For example, the addition of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 * {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are separated by exactly one space.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise11_14 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Prompt user to enter input for two array lists
        System.out.print("Enter five integers for list1: ");
        for(int i = 0; i < 5; i++){
            list1.add(input.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for(int i = 0; i < 5; i++){
            list2.add(input.nextInt());
        }

        // Call union method and display result
        ArrayList<Integer> combinedList = union(list1, list2);
        System.out.print("The combined list is ");
        for(int i = 0; i < combinedList.size(); i++){
            System.out.print(combinedList.get(i) + " ");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Combines two array lists into one array list
     * @param list1 First array list
     * @param list2 Second array list
     * @return Union of two array lists
     */
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();

        // Add list1 and list2 to result
        result.addAll(list1);
        result.addAll(list2);

        // return result
        return result;
    }
}
