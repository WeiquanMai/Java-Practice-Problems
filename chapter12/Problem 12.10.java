/*
    Problem 12.10
    Problem 12.10 utilizes the NullDenominatorException, which is defined in a separate file, Exercise12_07.java
    
    Create a class Fraction with two integer final fields: numerator and denominator.
    Its constructor creates fractions when given values for both, but it has to avoid fractions
    with null denominators by throwing a NullDenominatorException.
 */
class Fraction {
    final int numerator;
    final int denominator;

    // Overloaded Constructor
    public Fraction(int numerator, int denominator)
    throws NullDenominatorException{
        if(denominator == 0){
            throw new NullDenominatorException("Denominator cannot be 0!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
