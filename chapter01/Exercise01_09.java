/**
 * @Author Weiquan Mai
 * Problem 1.9
 * (Area and perimeter of a rectangle)
 * Write a program that displays the area and perimeter of a rectangle with
 * a width of 5.3 and height of 8.6 using the following formula:
 * area = width X height
 * perimeter = 2 X (width + height)
 */
public class Exercise01_09 {
    public void main(String[] args){
        // Variables
        double width = 5.3;
        double height = 8.6;
        
        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        // Display
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}
