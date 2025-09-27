class CheckingAccount extends Account{
    private double overdraftLimit;

    // No-arg constructor
    public CheckingAccount(){
        super();
        overdraftLimit = 0;
    }

    // Overloaded constructor
    public CheckingAccount(int id, double balance, double overdraftLimit){
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }


    @Override
    public void withdraw(double withdraw){
        double maxLimit = getOverdraftLimit() + getBalance();

        if(withdraw < 0){
            System.out.println("Cannot withdraw a negative number!");
        }
        else if(withdraw > maxLimit){
            System.out.println("Cannot withdraw past maximum overdraft limit!");
        }
        else{
            setBalance(getBalance() - withdraw);
        }
    }

    @Override
    public String toString(){
        return ("CheckingAccount ID: " + getId() +"\nCheckingAccount balance: " + getBalance());
    }
}
