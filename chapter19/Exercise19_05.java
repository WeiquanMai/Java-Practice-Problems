/**
 *  Problem 19.5
 *  Problem 19.3 extends the Pair class, which is defined in a separate file: Exercise 19_03.java
 *  (Inheritance between generic classes) Create a Triplet class that encapsules three objects of the same data type in a given instance of Triplet.
 * @param <E> generic object type
 */
public class Triplet <E> extends Pair<E>{
    private E object3;

    // Overloaded Constructor
    public Triplet(E object1, E object2, E object3) {
        super(object1, object2);
        this.object3 = object3;
    }

    // Accessor
    public E getThird(){
        return object3;
    }
}
