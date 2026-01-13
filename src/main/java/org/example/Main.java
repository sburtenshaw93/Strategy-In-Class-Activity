// strategy pattern activity
// driver for banking program
package org.example;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        BankAccount bankAccount = new BankAccount();
        PayPalAccount payPalAccount = new PayPalAccount();
        customer.makePayment(bankAccount, 100);
        customer.makePayment(payPalAccount, 200);
    }

}
