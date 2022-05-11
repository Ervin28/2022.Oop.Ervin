package oop.labor03.lab3_2;
import oop.labor03.lab3_1.BankAccount;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer("John","Black");
        BankAccount account=new BankAccount("OTP0001");
        BankAccount account1=new BankAccount("OTP0002");
        BankAccount account2=new BankAccount("OTP0003");
        BankAccount account3=new BankAccount("OTP0004");

        customer.addAccount(account);
        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.addAccount(account3);

        Random random = new Random();
        Customer customer2 = new Customer("Johny", "BLACK");
        for (String s : Arrays.asList("OTP00006", "OTP00007", "OTP00008", "OTP00009", "OTP00010", "OTP00011", "OTP00012", "OTP00013", "OTP00014")) {
            account = new BankAccount(s);
            customer2.addAccount(account);
            customer2.getAccount(s).deposit(random.nextDouble()*15000);
        }
        System.out.println(customer);
        System.out.println(customer2);
        customer.closeAccount("ottp");


    }
}
