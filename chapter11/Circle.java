/**
 * @author Weiquan Mai
 * Problem 11.6
 * (Use ArrayList)
 * Write a program that creates an ArrayList and
 * adds a Loan object, a Date object, a String, and a Circle object to the list,
 * and uses a loop to display all the elements in the list by invoking the object's toString() method.
 */
class Circle {
    // Variables
    private double radius;

    // Overloaded Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Accessors and Mutators
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle: " + this.radius;
    }
}
