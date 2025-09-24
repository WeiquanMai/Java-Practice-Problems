/*
    Problem 10.3
    Program tests the MyInteger class, which is defined in a separate file, MyInteger.java
    
    Design a class named MyInteger
    The class contains:
        - an int data field named value that stores the int value represented by this object
        - a constructor that creates a MyInteger object for the specified int value
        - a getter method that returns the int value
        - the methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime
        - The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime
        - The methods equals(int) and equals(myInteger) that return true if the value in this object is equal to the specified value
        - A static method parseInt(char[]) that converts an array of numeric characters to an int value
        - A static method parseInt(String) that converts a string into an int value
 */

public class Exercise10_03 {
    public static void main(String[] args){
        MyInteger integer = new MyInteger(7);
        System.out.println("Value: " + integer.getValue());
        System.out.println("Testing isEven(), isOdd(), and isPrime()");
        System.out.println("Even: " + integer.isEven());
        System.out.println("Odd: " + integer.isOdd());
        System.out.println("Prime: " + integer.isPrime());

        System.out.println("Testing isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)");
        System.out.println("Even: " + MyInteger.isEven(integer));
        System.out.println("Odd: " + MyInteger.isOdd(integer));
        System.out.println("Prime: " + MyInteger.isPrime(integer));

        int x = 7;
        System.out.println("Testing isEven(int), isOdd(int), and isPrime(int) ");
        System.out.println("Even: " + MyInteger.isEven(x));
        System.out.println("Odd: " + MyInteger.isOdd(x));
        System.out.println("Prime: " + MyInteger.isPrime(x));

        System.out.println("Testing equals(int)");
        System.out.println(integer.getValue() + " equals 7 " + integer.equals(7));
        System.out.println(integer.getValue() + " equals 5 " + integer.equals(5));

        System.out.println("Testing equals(MyInteger)");
        MyInteger num2 = new MyInteger(7);
        MyInteger num3 = new MyInteger(5);
        System.out.println(integer.getValue() + " equals 7 " + integer.equals(num2));
        System.out.println(integer.getValue() + " equals 5 " + integer.equals(num3));

        System.out.println("Testing parseInt(char[])");
        char[] c = {'1', '2', '3'};
        System.out.println("Parsing {1,2,3} equals " + MyInteger.parseInt(c));

        System.out.println("Testing parseInt(String)");
        String s = "123";
        System.out.println("Parsing s = 123 equals " + MyInteger.parseInt(s));
    }
}
