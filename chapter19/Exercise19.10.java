/**
 * @Author Weiquan Mai
 * Problem 19.10
 *
 * (Smallest element in ArrayList) Write the following method that returns the smallest element in an ArrayList:
 * public static <E extends Comparable<E>> E min(ArrayList<E> list)
 */
import java.util.ArrayList;

public class Exercise19_10{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(100);
        System.out.println("List: " + list);
        System.out.println("Min: " + min(list));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        if(list == null || list.isEmpty()){
            return null;
        }

        E min = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
        }

        return min;
    }
}
