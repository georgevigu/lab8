package com.company;

public class BankAccount {
    private double balance;

    BankAccount() {
        this.balance=0;
    }

    public void deposit (double money) {
        this.balance += money;
        System.out.println("S-au adaugat " + money + " in cont");
        System.out.println("Sold actual: " + this.balance);
    }

    public void withdraw (double money) {
        if(money > this.balance) {
            System.out.println("Fonduri insuficiente\n");
        }
        else {
            this.balance -= money;
            System.out.println("S-au extras " + money + " din cont");
            System.out.println("Sold actual: " + this.balance);
        }
    }

    public double getBalance () {
        return this.balance;
    }

}
