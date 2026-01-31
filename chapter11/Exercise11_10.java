/**
 * @author Weiquan Mai
 * Problem 11.10
 * (Implement MyStack using inheritance)
 * In Listing 11.10, MyStack is implemented using composition.
 * Define a new stack class that extends ArrayList.
 * Write a test program that prompts the user to enter five strings
 * and displays them in reverse order.
 */

import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        MyStack<String> stack = new MyStack<>();

        // Prompt user to enter five strings
        System.out.println("Enter 5 strings: ");
        System.out.print("Enter String1: ");
        String string1 = input.nextLine();
        System.out.print("Enter String2: ");
        String string2 = input.nextLine();
        System.out.print("Enter String3: ");
        String string3 = input.nextLine();
        System.out.print("Enter String4: ");
        String string4 = input.nextLine();
        System.out.print("Enter String5: ");
        String string5 = input.nextLine();

        // Push the five strings into stack
        stack.push(string1);
        stack.push(string2);
        stack.push(string3);
        stack.push(string4);
        stack.push(string5);

        // Display them in reverse order
        while(!stack.isEmpty()){
            System.out.println("stack " + stack.pop());
        }

        // Close Scanner
        input.close();
    }
}
