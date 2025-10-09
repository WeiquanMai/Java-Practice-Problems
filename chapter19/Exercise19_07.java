/**
 * Problem 19.7
 * Problem 19.7 utilizes classes which are defined in Exercise 19.6, which are stored under DifferentPair.java and DifferentTriplet.java
 *
 * (Sum of an association) Knowing that any object of type java.lang.Number can be evaluated as a double
 * with its doubleValue() method, write a method that computes and returns the sum of the three numbers
 * in an instance of Transition as defined in Programming Exercise 19.6.
 */
public class Main{
    public static void main(String[] args){
        DifferentTriplet<Integer, Float, Double> triplet = new DifferentTriplet<>(1,1.2f,3.14);
        System.out.println(sumTriplet(triplet));
    }
    public static Number sumTriplet(DifferentTriplet<? extends Number, ? extends Number, ? extends Number> triplet){
        double accumulator = 0;

        accumulator += triplet.getFirst().doubleValue();
        accumulator += triplet.getSecond().doubleValue();
        accumulator += triplet.getThird().doubleValue();

        return accumulator;
    }
}
