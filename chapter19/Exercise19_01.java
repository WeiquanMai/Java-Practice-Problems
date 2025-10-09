/**
 * Problem 19.1
 * Revise the GenericStack class in Listing 19.1 to implement it using an array rather than an ArrayList.
 * You should check the array size before adding a new element to the stack.
 * If the array is full, create a new array that doubles the current array size,
 * and copy the elements from the current array to the new array.
 */

class GenericArrayStack<E> {
    private int size;
    private int capacity;
    private Object[] elements;

    // No args constructor
    public GenericArrayStack(){
        this(10);
    }

    // Overloaded constructor
    public GenericArrayStack(int capacity){
        this.size = 0;
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public int getSize(){
        return size;
    }

    private void increaseCapacity(){
        if(isFull()){
            capacity = capacity * 2;
            Object[] temp = new Object[capacity];

            for(int i = 0; i < size; i++){
                temp[i] = elements[i];
            }
            elements = temp;
        }
    }
    public E peek(){
        return (E) elements[size - 1];
    }

    public void push(E o){
        if(isFull()){
            increaseCapacity();
        }

        elements[size] = o;
        size++;

    }
    public E pop(){
        if(isEmpty()){
            return null;
        }
        E temp = (E) elements[getSize() - 1];
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "Stack is empty";
        }
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Stack: [");
        for(int i = 0; i < size; i++){
            stringBuilder.append(elements[i]);
            if(i < size - 1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
