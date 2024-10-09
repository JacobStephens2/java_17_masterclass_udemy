package net.jacobstephens.autoboxing;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer Dakota = new Customer("Dakota");
        bank.addCustomer(Dakota);
        bank.addTransaction(Dakota, 15.00);
        bank.addTransaction(Dakota, -20.00);
        bank.printStatement(Dakota);

        Customer Blair = new Customer("Blair");
        bank.addCustomer(Blair);
        bank.addTransaction(Blair, -1.00);
        bank.addTransaction(Blair, 100.00);
        bank.printStatement(Blair);

        Customer BlairPaper = new Customer("Blair");
        bank.addCustomer(Blair);
    }
}
