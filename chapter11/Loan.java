/**
 * @author Weiquan Mai
 * Problem 11.6
 * (Use ArrayList)
 * Write a program that creates an ArrayList and
 * adds a Loan object, a Date object, a String, and a Circle object to the list,
 * and uses a loop to display all the elements in the list by invoking the object's toString() method.
 */
class Loan {
    // Variables
    private double amount;
    private int months;
    private double interestRate;

    // Overloaded constructor
    public Loan(double amount, int months, double interestRate){
        this.amount = amount;
        this.months = months;
        this.interestRate = interestRate;
    }

    // Accessors and Mutators
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public int getMonths(){
        return this.months;
    }
    public void setMonths(int months){
        this.months = months;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public String toString(){
        return "Loan: " + this.amount;
    }
}
