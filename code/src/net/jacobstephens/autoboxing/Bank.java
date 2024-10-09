package net.jacobstephens.autoboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        if (customers.contains(customer)) {
            System.out.printf("%s already has an account with this bank.%n", customer.getName());
        } else {
            customers.add(customer);
        }
    }

    public void addTransaction(Customer customer, double amount) {
        int index = customers.lastIndexOf(customer);
        customers.get(index).addTransaction(amount);
    }

    public void printStatement(Customer customer) {
        int index = customers.lastIndexOf(customer);
        customers.get(index).printStatement();
    }
}
