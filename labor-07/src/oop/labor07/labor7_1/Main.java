package oop.labor07.labor7_1;

public class Main {
    public static void main(String[] args) {


    Bank OTP = new Bank("OTP");
        OTP.addCustomer(new Customer("Kemeny", "Karoly"));
        OTP.getCustomer(1).addAccount(new CheckingAccount(300));
        OTP.getCustomer(1).addAccount(new SavingAccount(20));
        OTP.addCustomer(new Customer("Vastag", "Joska"));
        OTP.getCustomer(2).addAccount(new CheckingAccount(1000));
        OTP.getCustomer(2).addAccount(new SavingAccount(60));
        OTP.printCustomersToStdout();

        for (int i = 1; i <= OTP.numCustomers(); i++) {
        for (String id : OTP.getCustomer(i).getAccountNumbers()) {
            OTP.getCustomer(i).getAccount(id).deposit(1000);

        }
            System.out.println(OTP.getCustomer(2));
    }
        OTP.printCustomersToStdout();
        for (int i = 1; i <= OTP.numCustomers(); i++) {
        for (String id : OTP.getCustomer(i).getAccountNumbers()) {
            BankAccount account = OTP.getCustomer(i).getAccount(id);
            if (account instanceof SavingAccount) {
                ((SavingAccount) account).addInterest();
            }
        }
    }
        OTP.printCustomersToStdout();
        for (int i = 1; i <= OTP.numCustomers(); i++) {
        for (String id : OTP.getCustomer(i).getAccountNumbers()) {
            OTP.getCustomer(i).getAccount(id).withdraw(300);
        }
    }
        OTP.printCustomersToStdout();
}
}
