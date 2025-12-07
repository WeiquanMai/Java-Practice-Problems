/**
 * @Author Weiquan Mai
 * Problem 4.12
 * (Hex to binary)
 * Write a program that prompts the user to enter a hex digit
 * and displays its corresponding binary number
 */

import java.util.Scanner;

public class Exercise04_12 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter a hex digit
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Convert hex input to binary
        if(hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        int value = 0;

        if('A' <= ch && ch <= 'F'){
            value = ch - 'A' + 10;
        }
        else if (Character.isDigit(ch)){
            value = (int) ch - '0';
        }
        else{
            System.out.println(ch + " is an invalid input");
            System.exit(2);
        }

        // Display binary result
        switch(value){
            case 0 :
                System.out.println("0000");
                break;
            case 1:
                System.out.println("0001");
                break;
            case 2:
                System.out.println("0010");
                break;
            case 3:
                System.out.println("0011");
                break;
            case 4:
                System.out.println("0100");
                break;
            case 5:
                System.out.println("0101");
                break;
            case 6:
                System.out.println("0110");
                break;
            case 7:
                System.out.println("0111");
                break;
            case 8:
                System.out.println("1000");
                break;
            case 9:
                System.out.println("1001");
                break;
            case 10:
                System.out.println("1010");
                break;
            case 11:
                System.out.println("1011");
                break;
            case 12:
                System.out.println("1100");
                break;
            case 13:
                System.out.println("1101");
                break;
            case 14:
                System.out.println("1110");
                break;
            case 15:
                System.out.println("1111");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        // Close Scanner
        input.close();

    }
}
