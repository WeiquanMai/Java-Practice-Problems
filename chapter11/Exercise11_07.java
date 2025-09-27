/*
    Problem 11.7
    
    Write the following method that shuffles the elements in an ArrayList of integers:
    public static void shuffle(ArrayList<Integer> list)
 */
import java.util.ArrayList;
import java.util.Random;

public class Exercise11_07 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list:" + list);
        shuffle(list);
        System.out.println("Shuffled list:" + list);
    }

    public static void shuffle(ArrayList<Integer> list){
        // Create a random object
        Random random = new Random();

        // Loop backwards from end of list
        for(int i = list.size() - 1; i > 0; i--){
            // Pick a random index from 0 up to the current index
            int randomIndex = random.nextInt(i + 1);

            // Store the element at the random index in a temporary variable
            Integer temp = list.get(randomIndex);

            // Swap the element at the current index with element at the random index
            list.set(randomIndex, list.get(i));

            // Set the element at the current index to be the value from the temporary variable
            list.set(i, temp);
        }
    }
}
