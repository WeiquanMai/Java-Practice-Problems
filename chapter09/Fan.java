/**
 * @author Weiquan Mai
 * Problem 9.8
 * (The Fan class)
 * Design a class named Fan to represent a fan. The class contains:
 * - Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
 * to denote the fan speed.
 * - A private int data field named speed that specifies the speed of the fan
 * (the default is SLOW).
 * - A private boolean data field named on that specifies whether the fan is on
 * (the default is false).
 * - A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * - A string data field named color that specifies the color of the fan
 * (the default is blue).
 * - The accessor and mutator methods for all four data fields
 * - A no-arg constructor that creates a default fan.
 * - A method named toString() that returns a string description for the fan.
 * If the fan is on, the method returns the fan speed, color, and radius
 * in one combined string. If the fan is not on, the method returns the fan color
 * and radius along with the string "fan is off" is one combined string.
 *
 * Write a test program that creates two Fan objects.
 * Assign mximum speed, radius 10, color yellow, and turn it on to the first object.
 * Assign medium speed, radius 5, color blue, and turn it off to the second object.
 * Display the objects by invoking their toString method.
 */
class Fan {
    // Variables
    private static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor
    public Fan(){
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // Overloaded constructor
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Accessors and Mutators
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean isOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    // Override toString
    @Override
    public String toString(){
        if(isOn()){
            return this.speed + " " + this.color + " " + this.radius;
        }
        else{
            return this.color + " " + this.radius + " fan is off";
        }
    }
}
