/*
  Problem 9.7
  Program tests the Account class, which is defined in a separate file, Account.java

    Design a class named Account that contains:
        a private int data field named id for the account(default 0)
        a private double data field named balance for the account(default 0)
        a private double data field named annualInterestRate that stores the current interest rate (default 0)
            Assume that all accounts have the same interest rate.
        A private Date data field named dateCreated that stores the date when the account was created
        A no-arg constructor that creates a default account
        A constructor that creates an account with the specific id and initial balance
        The accessor and mutator methods for id, balance, and annualInterestRate
        The accessor method for dateCreated
        A method named getMonthlyInterestRate() that returns the monthly interest rate
        A method named withdraw that withdraws a specified amount from the account
        A method named deposit that deposits a specified amount to the account

        Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000
        and an annual interest rate of 4.5%.
        Use the withdraw method to withdraw $2,500.
        Use the deposit method to deposit $3,000.
        Print the balance, the monthly interest, and the date when this account was created.
*/
public class Exercise09_07 {
    public static void main(String[] args){
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance() +
                " Monthly Interest: " + account.getMonthlyInterest() +
                " Date Created: " + account.getDateCreated());
    }
}
