package dev.lpa;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name.toUpperCase();
        this.transactions = new ArrayList<>();
    }

    public void credit(double i){
        transactions.add(i);
    }

    public void debit(double i){
        transactions.add(-i);
    }

    public void printTransactions(){
        System.out.println(name + "'s transactions = " + transactions);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
