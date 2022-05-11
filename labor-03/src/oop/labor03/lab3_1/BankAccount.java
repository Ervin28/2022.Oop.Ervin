package oop.labor03.lab3_1;


public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double d) {
        this.balance += d;
    }

    public boolean withdraw(double d) {
        if (this.balance >= d) {
            this.balance -= d;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}