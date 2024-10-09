package net.jacobstephens.autoboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public void printStatement() {
        System.out.printf("%s's transactions: %n", this.name);
        for (double transaction : transactions) {
            System.out.printf("$%.2f %n", transaction);
        }
    }

}

