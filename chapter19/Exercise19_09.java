/**
 * @Author Weiquan Mai
 * Problem 19.9
 *
 * (Sort ArrayList) Write the following method that sorts an ArrayList:
 * public static <E extends Comparable<E>> void sort(ArrayList<E> list)
 */
import java.util.ArrayList;

public class Exercise19_09{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(1);
        // Display unsorted list
        System.out.println(list);

        // Display sorted list
        sort(list);
        System.out.println(list);
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){

        if(list == null){
            return;
        }

        // Iterate through list using two loops for selection sort
        for(int i = 0; i < list.size(); i++){
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).compareTo(list.get(minIndex)) < 0){
                    minIndex = j;
                }
            }
            if( minIndex != i){
                // Swap positions
                E temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
