package oop.labor03.lab3_1;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstname,String lastName){
        this.firstName=firstname;
        this.lastName=lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
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
public void closeAccounts(){
        this.account=null;
}

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
