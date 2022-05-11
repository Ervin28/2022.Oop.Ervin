package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1.toString());
        BankAccount account = new BankAccount("OTP00001");
        customer1.setAccount(account);
        System.out.println(customer1.toString());
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.getAccount().deposit(3000);
        System.out.println(customer1);
        customer1.getAccount().withdraw(2000);
        System.out.println(customer1.toString());
        Customer customer2 = new Customer("Mary", "WHITE");
        account = new BankAccount("OTP00002");
        customer2.setAccount(account);
        System.out.println(customer2.toString());
        customer2.getAccount().withdraw(100);
        System.out.println(customer2.toString());
        customer2.getAccount().deposit(4000);
        System.out.println(customer2.toString());
        customer2.getAccount().withdraw(450);
        System.out.println(customer2.toString());
        customer2.closeAccounts();

        System.out.println(customer2.toString());

        customer2.setAccount(customer1.getAccount());
        System.out.println(customer2.toString());
        customer1.getAccount().deposit(200);
        System.out.println(customer2.toString());
        customer2.getAccount().withdraw(500);
        System.out.println(customer2.toString());






    }
}
