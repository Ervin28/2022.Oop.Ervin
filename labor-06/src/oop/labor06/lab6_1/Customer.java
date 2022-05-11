package oop.labor06.lab6_1;
import java.util.ArrayList;
public class Customer {

    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private static int numCustomers = 1;
    private final int ID = numCustomers;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numCustomers++;

    }

    public int getID() {
        return ID;
    }

    public int getNumCustomers() {
        return numCustomers;
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> accountNumbers = new ArrayList<>();
        for (BankAccount account : accounts) {
            String s = account.getAccountNumber();
            accountNumbers.add(s);
        }
        return accountNumbers;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber()))
                return account;
        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber) {

        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                accounts.remove(account);
                break;
            }
        }
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID: " + ID + ", " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}