/**
 * @Author Weiquan Mai
 * Problem 1.8
 * (Area and perimeter of a circle)
 * Write a program that displays the area and perimeter of a circle that has a radius of 6.5
 * using the following formula:
 * pi = 3.14159
 * perimeter = 2 X radius X pi
 * area = radius X radius X pi
 */
public class Exercise01_08 {
    public static void main(String[] args){
        // Variables
        double PI = 3.14159;
        double radius = 6.5;

        // Calculations
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        // Display
        System.out.println("Perimeter of circle with radius " + radius + "is: " + perimeter);
        System.out.println("Area of circle with radius " + radius +"is: " + area);
    }
}
