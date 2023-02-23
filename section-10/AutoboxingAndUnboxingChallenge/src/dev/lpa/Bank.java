package dev.lpa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name.toUpperCase();
    }

    public void addCustomer(Customer customer){
        if(!customers.contains(customer)){
            customers.add(customer);
        }else{
            System.out.println(customer + " is already a customer");
        }
    }

    public void addCustomer(String name){
        if(getCustomer(name) == null){
            Customer customer = new Customer(name);
            customers.add(customer);
        }else{
            System.out.println(name.toUpperCase() + " is already a customer");
        }
    }

    public Customer getCustomer(String customerName){
        for(var customer : customers){
            if (customer.getName().equals(customerName.toUpperCase())) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) was not found %n", customerName);
        return null;
    }

    public void customerCredit(String name, double value){
        Customer customer = getCustomer(name.toUpperCase());
        customer.credit(value);
        System.out.println(value + " has been credited to " + customer.getName() + "'s account");
    }

    public void customerDebit(String name, double value){
        Customer customer = getCustomer(name.toUpperCase());
        customer.debit(value);
        System.out.println(value + " has been debited to " + customer.getName() + "'s account");
    }

    public void printCustomers(){
        System.out.println(name + "'s customers: " + customers);
    }

    public void printCustomerTransactions(String name){
        Customer customer = getCustomer(name);
        customer.printTransactions();
    }
}
