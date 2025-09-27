/*
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
class MyInteger {
    // Variables
    private int value;

    // Constructor
    public MyInteger(int value){
        this.value = value;
    }

    // Getter method
    public int getValue(){
        return value;
    }

    //methods isEven(), isOdd(), and isPrime()
    public boolean isEven(){
        return getValue() % 2 == 0;
    }
    public boolean isOdd(){
        return getValue() % 2 == 1;
    }
    public boolean isPrime(){
        if(getValue() <= 1){
            System.out.println("Invalid");
            return false;
        }

        for(int i = 2; i * i <= getValue(); i++){
            if(getValue() % i == 0){
                return false;
            }
        }
        return true;
    }

    // Static methods isEven(int), isOdd(int) and isPrime(int)
    public static boolean isEven(int integer){
        return integer % 2 == 0;
    }
    public static boolean isOdd(int integer){
        return integer % 2 == 1;
    }

    public static boolean isPrime(int integer){
        if(integer <= 1){
            System.out.println("Invalid");
            return false;
        }

        for(int i = 2; i * i <= integer; i++){
            if(integer % i == 0){
                return false;
            }
        }
        return true;
    }

    // static methods isEven(MyInteger), isOdd(MyInteger) and isPrime(MyInteger)
    public static boolean isEven(MyInteger myInt){
        int value = myInt.getValue();
        return value % 2 == 0;
    }
    public static boolean isOdd(MyInteger myInt){
        int value = myInt.getValue();
        return value % 2 == 1;
    }
    public static boolean isPrime(MyInteger myInt){
        int value = myInt.getValue();

        if(value <= 1){
            System.out.println("Invalid");
            return false;
        }

        for(int i = 2; i * i <= value; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }

    // equals(int) and equals(MyInteger)
    public boolean equals(int integer){
        return this.getValue() == integer;
    }

    public boolean equals(MyInteger myInt){
        return this.getValue() == myInt.getValue();
    }

    public static int parseInt(char[] a){
        int result = 0;

        for(int i  = 0; i < a.length; i++){
            int digit = a[i] - '0';
            result = (result * 10) + digit;
        }
        return result;
    }

    public static int parseInt(String s){
        char[] chars = s.toCharArray();
        return MyInteger.parseInt(chars);
    }

}
