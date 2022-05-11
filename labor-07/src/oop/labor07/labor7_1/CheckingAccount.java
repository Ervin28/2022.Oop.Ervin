package oop.labor07.labor7_1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public boolean withdraw(double value) {
        if(value > balance + overdraftLimit) {
            return false;
        }
        this.balance -= value;
        return true;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }

}