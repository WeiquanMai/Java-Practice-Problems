/*
    Problem 12.7 In preparation for a class Fraction,
    create a class NullDenominatorException that must be a checked exception
    whose instances are thrown if the denominator of an object of class Fraction is 0.
 */

class NullDenominatorException extends Exception{
    public NullDenominatorException(String message){
        super(message);
    }
}
