package net.jacobstephens.oop.inheritance;

public class Account {
    private int balance = 0;

    public String deposit(int amount) {
        this.balance += amount;
        return "Deposit successful. Your new balance is $" + this.balance;
    }

    public String withdraw(int amount) {
        if (amount > this.balance) {
            return "You cannot withdraw $" + amount + " because your balance is $" + this.balance;
        } else {
            this.balance -= amount;
            return "Withdrawal successful. Your new balance is $" + this.balance;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
