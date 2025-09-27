/*
    Problem 11.3
    Problem 11.3 utilizes the Account, SavingsAccount, and CheckingAccount classes, which are defined in separate files: Account.java, SavingsAccount.java, and CheckingAccount.java

    In Programming Exercise 9.7, the Account class was defined to model a bank account.
    An account has the properties:
        - account number
        - balance
        - annual interest rate
        - date created
       Create two subclasses for checking and savings accounts.
        - A checking account has an overdraft limit, but a savings account cannot be overdrawn.

    Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 */
public class Exercise11_03 {
    public static void main(String[] args){

        System.out.println("Testing default account");
        Account account1 = new Account();
        account1.setId(1);
        account1.setBalance(50);
        System.out.println("Account1 ID: " + account1.getId());
        System.out.println("Account1 Balance: " + account1.getBalance());
        System.out.println("Account1 Date Created: " + account1.getDateCreated());

        account1.deposit(25);
        System.out.println(account1);

        account1.withdraw(25);
        System.out.println(account1);

        account1.withdraw(60);
        System.out.println(account1);

        System.out.println("Testing Overloaded Account");
        Account account2 = new Account(2, 200);
        System.out.println(account2);

        System.out.println("Testing Default Saving Account");
        SavingsAccount account3 = new SavingsAccount();
        System.out.println(account3);

        System.out.println("Testing Overloaded SavingAccount");
        SavingsAccount account4 = new SavingsAccount(4,500);
        System.out.println(account4);
        account4.withdraw(200);
        System.out.println(account4);
        account4.withdraw(400);
        System.out.println(account4);

        System.out.println("Testing default CheckingAccount");
        CheckingAccount account5 = new CheckingAccount();
        System.out.println(account5);

        System.out.println("Testing Overloaded CheckingAccount");
        CheckingAccount account6 = new CheckingAccount(6, 500, 100);
        account6.withdraw(200);
        System.out.println(account6);
        account6.withdraw(400);
        System.out.println(account6);
    }
}
