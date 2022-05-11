package oop.labor07.labor7_1;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){ balance += interestRate * balance;}

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}