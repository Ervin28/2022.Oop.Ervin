package oop.labor06.lab6_1;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts=new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            accounts.add(new BankAccount());

        }

        System.out.println(accounts);

        ArrayList<Customer> costumerss=new ArrayList<>();
        costumerss.add(new Customer("Kemeny","Karoly"));
        Bank OTP = new Bank("OTP");
        OTP.addCustomer(new Customer("Kecskes", "Feri"));
        OTP.addCustomer(new Customer("Hoher", "Jozsef"));

        OTP.printCustomersToStdout();
        for (int i = 1; i <= OTP.numCustomers(); i++) {
            for (String id : OTP.getCustomer(i).getAccountNumbers()) {
                OTP.getCustomer(i).getAccount(id).deposit(100);
            }
        }

        OTP.printCustomersToStdout();
        OTP.printCustomersToStdout();
        for (int i = 1; i <= OTP.numCustomers(); i++) {
            for (String id : OTP.getCustomer(i).getAccountNumbers()) {
                OTP.getCustomer(i).getAccount(id).withdraw(300);
            }
        }
        OTP.printCustomersToStdout();
    }
}