/**
 * @author Weiquan Mai
 * Problem 11.6
 * (Use ArrayList)
 * Write a program that creates an ArrayList and
 * adds a Loan object, a Date object, a String, and a Circle object to the list,
 * and uses a loop to display all the elements in the list by invoking the object's toString() method.
 */

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args){
        // Create an ArrayList and add a Loan, Date, String, and Circle object
        ArrayList<Object> arrayList = new ArrayList<>();
        Loan loan = new Loan(30000, 12,3.5);
        Date date = new Date();
        String string = "String";
        Circle circle = new Circle(2.5);
        arrayList.add(loan);
        arrayList.add(date);
        arrayList.add(string);
        arrayList.add(circle);

        // Use a loop to display elements in the list
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
