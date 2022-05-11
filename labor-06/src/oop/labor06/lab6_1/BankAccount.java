package oop.labor06.lab6_1;

public class BankAccount {

    protected final String accountNumber;
    protected double balance;
    private static int numAccounts = 0;
    public static final String PREFIX = "OTP";  //constans
    public static final int ACCOUNT_NUMBER_LENGTH = 10;   //constans

    private static String createAccountNumber() {
        String s;
        s = PREFIX;
        int nL = 1;
        int sNumAccounts = numAccounts;
        while (sNumAccounts != 0) {
            nL++;
            sNumAccounts /= 10;
        }
        for (int i = 0; i < 8 - nL; i++) {
            s = s + "0";
        }
        s = s + numAccounts;


        return s;
    }

    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
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
                "}\n";
    }
}
