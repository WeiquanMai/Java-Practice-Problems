/**
 * Problem 19.4
 *
 * (Using wildcards) Write a generic static method that returns the smallest value in an instance of Pair from Programming Exercise 19.3.
 * @param <E> generic object type
 */
public class Exercise19_04 {
    public static void main(String[] args){
        Pair<Double> pair = new Pair<>(1.0, 3.0);
        System.out.println(smallest(pair));
    }

    /**
     * Generic static method to find the smallest value in a Pair
     * @param pair The pair of objects to compare
     * @return Smallest object in Pair
     * @param <E> The type of element
     */
    public static <E extends Comparable<E>> E smallest(Pair<? extends E> pair){
        E value1 = pair.getFirst();
        E value2 = pair.getSecond();

        if(value1.compareTo(value2) < 0){
            return value1;
        }
        return value2;
    }
}
