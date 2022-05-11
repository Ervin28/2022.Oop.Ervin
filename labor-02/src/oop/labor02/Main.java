package oop.labor02;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        boolean result = account1.withdraw(500);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        result = account1.withdraw(1000);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        account2.deposit(1000);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());

        Auto auto1 =new Auto();
        Auto auto2=new Auto("Green");
        System.out.println(auto1.getSebesseg());
        for (int i = 0; i < 12; i++) {
            auto1.novelSebesseg();
        }
        System.out.println(auto1.getSebesseg());

        System.out.println(auto1.toString());
        auto1.recolor("Red");
        System.out.println(auto1.toString());
        for (int i = 0; i < 6; i++) {
            auto2.novelSebesseg();
        }
        System.out.println(auto2.toString());
       if(DateUtil.isValidDate(2001, 13, 32))
           System.out.println("It is a valid date");
       else
           System.out.println("It isn't a valid date");

        if(DateUtil.leapYear(2020))
            System.out.println("It was a leap year");
        else System.out.println("It wasn't a leap year");
        DateUtil date1=new DateUtil();
        date1.leapYear(2011);
        date1.isValidDate(2001,12,23);

    }

}
