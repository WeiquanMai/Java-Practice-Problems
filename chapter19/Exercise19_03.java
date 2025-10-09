/**
 * Problem 19.3
 *
 * (Pair of objects of the same type) Create a Pair class that encapsulates two objects of the same data type in an instance of Pair.
 * @param <E> generic object type
 */
public class Pair <E>{
    private E object1;
    private E object2;

    public Pair(E object1, E object2){
        this.object1 = object1;
        this.object2 = object2;
    }
    public E getFirst(){
        return object1;
    }
    public E getSecond(){
        return object2;
    }
}
