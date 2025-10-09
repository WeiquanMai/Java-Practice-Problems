/**
 * Problem 19.6
 * Problem 19.6 is completed using DifferentPair.java and DifferentTriplet.java
 *
 * (Several Types) Create an Association class that encapsulates two objects of different types.
 * Similar to Programming Exercise 19.5, create a Transition class that does the same of Association class with three objects.
 * @param <E> First object type
 * @param <T> Second object type
 * @param <U> Third object type
 */
public class DifferentTriplet<E,T,U> extends DifferentPair<E,T>{
    private U third;

    // Overloaded Constructor
    public DifferentTriplet(E first, T second, U third) {
        super(first, second);
        this.third = third;
    }

    // Mutator and Accessor
    public U getThird(){
        return third;
    }
    public void setThird(U third){
        this.third = third;
    }
}
