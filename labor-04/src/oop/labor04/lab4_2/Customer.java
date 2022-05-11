package oop.labor04.lab4_2;
import java.util.ArrayList;
import java.util.Arrays;

public class Customer {


    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private final String firstName;
    private String lastName;

    int numAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getNumAccounts() {
        return numAccounts;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber()))
                return account;
        }
        return null;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    public void closeAccount(String accountNumber){
        accounts.removeIf(account -> accountNumber.equals(account.getAccountNumber()));

    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + accounts +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numAccounts=" + numAccounts +
                '}';


    }
}


