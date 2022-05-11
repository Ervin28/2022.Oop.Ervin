package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        try (Scanner scanner = new Scanner(new File("lab4_2_input.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty())
                    continue;
                String[] datas = line.split(",");
                if (datas[0].trim().equals("Customer")) {
                    Customer customer = new Customer(datas[1].trim(), datas[2].trim());
                    customers.add(customer);
                    continue;
                }
                if (datas[0].trim().equals("Account")) {
                    Customer last=customers.get(customers.size()-1);
                    BankAccount account= new BankAccount(datas[1].trim());
                    account.deposit(Double.parseDouble(datas[2].trim()));
                    last.addAccount(account);
                }
            }
            for(Customer customer:customers)
            System.out.println(customer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
