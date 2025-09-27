import java.util.Date;

public class Account {
    // Private Variables
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // No-arg constructor
    public Account(){
        this.id = 0;
        this.balance = 0;
        dateCreated = new java.util.Date();
    }

    // Overloaded constructor
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    // Accessors and Mutators for id, balance, and annualInterestRate
    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate / 100;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    // Accessor method for dateCreated
    public Date getDateCreated(){
        return dateCreated;
    }
    // Returns monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    // Returns monthly interest
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double withdraw){
        if(withdraw > balance){
            System.out.println("Cannot withdraw higher than balance!");
        }
        else if(withdraw < 0){
            System.out.println("Cannot withdraw a negative number!");
        }
        else{
            balance = balance - withdraw;
        }
    }

    public void deposit(double deposit){
        if (deposit < 0){
            System.out.println("Cannot deposit negative number!");
        }
        else{
            balance = balance + deposit;
        }
    }
}
