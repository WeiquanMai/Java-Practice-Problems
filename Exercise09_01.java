/*
    Problem 9.1 
    Program tests the Rectangle class, which is defined in a separate file, Rectangle.java
    Design a class named Rectangle to represent a rectangle.
    The class contains:
        Two double data fields named width and height that specify the width and height of the rectangle
            The default values are 1 for both width and height
        A no-arg constructor that creates a rectangle
        A constructor that creates a rectangle with the specified width and height
        A method named getArea() that returns the area of this rectangle
        A method named getPerimeter() that returns the perimeter
        Write a test program that creates two Rectangle objects- one with width 4 and height 40, and one with width 3.5 and height 35.9.
        Display the width, height, area, and perimeter of each rectangle in this order.
 */
public class Exercise09_01{
        public static void main(String[] args){
            Rectangle rectangle1 = new Rectangle(4.0, 40.0);
            Rectangle rectangle2 = new Rectangle(3.5,35.9);

            System.out.println("Rectangle1: ");
            System.out.println("Width: " + rectangle1.getWidth() + " Height: " + rectangle1.getHeight() + " Area: "
                    + rectangle1.getArea() + " Perimeter: " + rectangle1.getPerimeter() );
            System.out.println("Rectangle2: ");
            System.out.println("Width: " + rectangle2.getWidth() + " Height: " + rectangle2.getHeight() + " Area: "
                    + rectangle2.getArea() + " Perimeter: " + rectangle2.getPerimeter() );
        }
}
