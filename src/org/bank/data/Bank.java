package org.bank.data;

import java.util.ArrayList;

public class Bank {
    // attributes
    private String bankName;
    private ArrayList<User> bankCustomers;

    // constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankCustomers = new ArrayList<>();
    }

    // methods
    public String getBankName() {
        return bankName;
    }

    public void addCustomer(User user) {
        this.bankCustomers.add(user);
    }

    public ArrayList<User> getBankCustomers() {
        return bankCustomers;
    }
}