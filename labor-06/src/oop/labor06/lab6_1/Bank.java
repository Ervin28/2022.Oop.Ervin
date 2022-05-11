package oop.labor06.lab6_1;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getID() == id)
                return customer;
        }
        return null;
    }

    public void addCustomer(Customer actual){
        customers.add(actual);
    }

    public int numCustomers(){
        return customers.size();
    }

    private void printCustomers( PrintStream ps ){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getID()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();

    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}