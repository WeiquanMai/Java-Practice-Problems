/**
 * @author Weiquan Mai
 * Problem 11.18
 * (ArrayList of Character)
 * Write a method that returns an array list of Character from a string
 * using the following header:
 * public static ArrayList<Character> toCharacterArray(String s)
 *
 * For example, toCharacterArray("abc") returns an array list that contains
 * characters 'a', 'b', and 'c'.
 */
import java.util.ArrayList;

public class Exercise11_18 {
    public static void main(String[] args){
        // Variables
        String s = "abc";

        ArrayList<Character> list = toCharacterArray(s);

        System.out.println(list);

    }

    /**
     * Turns a string into an array list of characters
     * @param s String
     * @return Array list of characters
     */
    public static ArrayList<Character> toCharacterArray(String s){
        // Variable
        ArrayList<Character> list = new ArrayList<>();

        // Iterate through string and add each char to array list
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        return list;
    }
}
