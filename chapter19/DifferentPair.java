/**
 * Problem 19.6
 * Problem 19.6 is completed using DifferentPair.java and DifferentTriplet.java
 *
 * (Several Types) Create an Association class that encapsulates two objects of different types.
 * Similar to Programming Exercise 19.5, create a Transition class that does the same of Association class with three objects.
 * @param <E> First object type
 * @param <T> Second object type
 */
public class DifferentPair <E,T>{
    private E first;
    private T second;

    // Overloaded Constructor
    public DifferentPair(E first, T second){
        this.first = first;
        this.second = second;
    }

    // Mutators and Accessors
    public E getFirst(){
        return first;
    }
    public void setFirst(E first){
        this.first = first;
    }
    public T getSecond(){
        return second;
    }
    public void setSecond(T second){
        this.second = second;
    }
}
