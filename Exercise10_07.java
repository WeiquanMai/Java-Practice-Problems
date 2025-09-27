/*
    Problem 10.7
    Program utilizes the Account class, which is defined in a separate file, Account.java
    
    Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine.
    Create 10 accounts in an array with id 0,1,...,9 and an initial balance of $100.
    The system prompts the user to enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
    Once an id is accepted, the main menu is displayed as shown in the sample run.
    You can enter:
    - choice 1 for viewing the current balance
    - choice 2 for withdrawing money
    - choice 3 for depositing money
    - choice 4 for exiting the main menu
 */
import java.util.Scanner;

public class Exercise10_07 {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Create 10 accounts in an array with an initial balance of $100
        Account [] accounts = new Account[10];
        for(int i = 0; i < 10; i++){
            accounts[i] = new Account(i, 100);
        }

        while(true){
        int currentUserId = -1;

        while(true){
            // Prompt the user to enter an id
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            // If id is entered incorrectly, ask the usesr to enter a correct id
            if(id >= 0 && id < accounts.length){
                currentUserId = id;
                break;
            }
            else{
                System.out.println("Incorrect id. Please try again.");
            }
        }

        // Once an id is accepted, the main menu is displayed
        boolean keepRunning = true;

        while(keepRunning) {
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");


            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("The balance is " + accounts[currentUserId].getBalance() + "\n");
                    break;
                }
                case 2: {
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    accounts[currentUserId].withdraw(withdraw);
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.print("Enter an amount to deposit: ");
                    double deposit = input.nextDouble();
                    accounts[currentUserId].deposit(deposit);
                    System.out.println();
                    break;
                }
                case 4: {
                    keepRunning = false;
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        }
    }
}
