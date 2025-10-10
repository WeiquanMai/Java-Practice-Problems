/*
    Exercise 19.8

    (Shuffle ArrayList) Write the following method that shuffles an ArayList:
    public static <E> void shuffle(ArrayList<E> list)
 */
import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        shuffle(list);
        System.out.println(list);

    }
    public static <E> void shuffle(ArrayList<E> list){
        // Create a random object
        Random random = new Random();

        // Iterate and swap from beginning to end
        for(int i = list.size() - 1; i >= 0; i--){
            int randomIndex = random.nextInt(0, i + 1);
            E temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
