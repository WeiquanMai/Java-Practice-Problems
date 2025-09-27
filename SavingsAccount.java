class SavingsAccount extends Account{

    // No-arg constructor
    public SavingsAccount(){
        super();
    }

    // Overloaded constructor
    public SavingsAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public String toString(){
        return ("SavingsAccount ID: " + getId() + "\nSavingsAccount Balance " + getBalance());
    }
}
