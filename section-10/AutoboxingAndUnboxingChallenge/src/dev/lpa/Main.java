package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Customer robert = new Customer("Robert");
        Bank chase = new Bank("Chase");
        robert.credit(50);
        robert.credit(25);
        robert.debit(30);
        robert.printTransactions();

        chase.addCustomer(robert);
        chase.customerCredit("robert", 71);
        robert.printTransactions();

        chase.addCustomer("george");
        chase.printCustomers();
        chase.customerCredit("george", 50);
        chase.customerDebit("robert", 57);
        chase.customerDebit("george", 98);
        chase.printCustomerTransactions("robert");
        chase.printCustomerTransactions("george");
    }
}
