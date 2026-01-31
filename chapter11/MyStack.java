/**
 * @author Weiquan Mai
 * Problem 11.10
 * (Implement MyStack using inheritance)
 * In Listing 11.10, MyStack is implemented using composition.
 * Define a new stack class that extends ArrayList.
 * Write a test program that prompts the user to enter five strings
 * and displays them in reverse order.
 */
import java.util.ArrayList;

class MyStack<E> extends ArrayList<E> {

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return size();
    }

    public E peek(){
        return get(getSize() - 1);
    }

    public E pop(){
        E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push (E o){
        add(o);
    }

    @Override
    public String toString(){
        return "stack: " + super.toString();
    }
}
