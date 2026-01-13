package org.example;
//public class PayPalAccount implements Account{
  public class PayPalAccount implements PaymentStrategy {

  public void makePayment(int amount) {
    System.out.println("Payment of $" + amount + " made from PayPal account.");
  }

}
