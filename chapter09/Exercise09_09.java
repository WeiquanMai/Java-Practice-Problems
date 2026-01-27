/**
 * @author Weiquan Mai
 * Problem 9.9
 * (Geometry: n-sided regular polygon)
 * In an n-sided regular polygon, all sides have the same length and all angles have the same degree
 * (i.e., the polygon is both equilateral and equiangular).
 * Design a class named RegularPolygon that contains:
 * - A private int data field named n that defines the number of sides in the polygon with default value 3.
 * - A private double data field named side that stores the length of the side with default value 1.
 * - A private double data field named x that defines the x-coordinate of the polygon's center with default value 0.
 * - A private double data field named y that defines the y-coordinate of the polygon's center with default value 0.
 * - A no-arg constructor that creates a regular polygon with default values.
 * - A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
 * - A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
 * - The accessor and mutator methods for all data fields.
 * - The method getPerimeter() that returns the perimeter of the polygon.
 * - The method getArea() that returns the area of the polygon.
 * The formula for computing the area of a regular polygon is
 * Area = n x s^2 / 4 x tan(PI/n)
 *
 * Write a test program that creates three RegularPolygon objects,
 * created using the no-arg constructor, using RegularPolygon(6, 4),
 * and using RegularPolygon(10, 4, 5.6, 7.8).
 * For each object, display its perimeter and area.
 */
public class Exercise09_09 {
    public static void main(String[] args){
        // Create three RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display the perimeter and area of each object
        System.out.printf("Polygon1 area %.2f, Polygon1 perimeter %.2f\n", polygon1.getArea(), polygon1.getPerimeter());
        System.out.printf("Polygon2 area %.2f, Polygon2 perimeter %.2f\n", polygon2.getArea(), polygon2.getPerimeter());
        System.out.printf("Polygon3 area %.2f, Polygon3 perimeter %.2f\n", polygon3.getArea(), polygon3.getPerimeter());

    }
}
