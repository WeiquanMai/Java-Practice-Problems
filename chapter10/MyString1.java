/**
 * @author Weiquan Mai
 * Problem 10.22
 * (Implement the String class)
 * The String class is provided in the Java library.
 * Provide your own implementation for the following methods
 * (name the new class MyString1):
 * public MyString1(char[] chars);
 * public char charAt(int index);
 * public int length();
 * public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase();
 * public boolean equals(MyString1 s);
 * public static MyString1 valueOf(int i);
 */
public class MyString1 {
    private char[] chars;

    /**
     * Overloaded constructor
     * @param chars Array of chars to form string
     */
    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            this.chars[i] = chars[i];
        }
    }

    /**
     * Returns char at specified index
     */
    public char charAt(int index){
        return chars[index];
    }

    /**
     * Returns length of String
     */
    public int length(){
        return chars.length;
    }

    /**
     * Returns substring of string starting at begin index, and ending at end index
     */
    public MyString1 substring(int begin, int end){
        if(begin < 0 || end > length() || begin > end){
            System.out.println("Invalid indices");
            return null;
        }

        char[] temp = new char[end - begin];
        for(int i = 0; i < temp.length; i++){
            temp[i] = chars[begin + i];
        }
        return new MyString1(temp);
    }

    /**
     * Returns a lowercase version of string
     */
    public MyString1 toLowerCase(){
        char[] temp = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            if(chars[i] > 64 && chars[i] < 91){
                temp[i] = (char)(chars[i] + 32);
            }
            else{
                temp[i] = chars[i];
            }
        }
        return new MyString1(temp);
    }

    /**
     * Returns true if two strings are exactly, equal. Otherwise, false
     */
    public boolean equals(MyString1 s){
        if(this.length() != s.length()){
            return false;
        }
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a string representation of an integer
     */
    public static MyString1 valueOf(int i){
        if(i == 0){
            return new MyString1(new char[] {'0'});
        }
        // Find length of number
        int counter = 0;
        int temp = i;
        while(temp != 0){
            temp = temp / 10;
            counter++;
        }

        // If i is negative, add another space for minus sign
        if(i < 0){
            counter++;
        }

        char[] result = new char[counter];
        int limit = (i < 0) ? 1 : 0;
        if(i < 0){
            result[0] = '-';
        }
        i = Math.abs(i);

        for(int j = counter - 1; j >= limit; j--){
            temp = i % 10;
            i = i / 10;
            char tempC = (char)(temp + '0');
            result[j] = tempC;
        }

        return new MyString1(result);
    }
}
