// customer account
// new accounts must be added here, breaks open/closed principle
//
package org.example;
public class Customer {

  public void makePayment(PaymentStrategy account, int amount)
  {
    account.makePayment(amount);
  }
}
