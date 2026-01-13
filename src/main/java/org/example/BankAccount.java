package org.example;
import java.time.LocalDate;

// Checking account
public class BankAccount  implements PaymentStrategy {

  public void makePayment(int amount) {
    System.out.println("Payment of $" + amount + " made from bank account.");
  }

  public void writeCheck(int amount, int year, int month, int day, boolean checkImage) {
    System.out.println("Check Amount: $" + amount + "Withdrew: " + month + "/" + day + "/" + year);
    if (checkImage) {
      System.out.println("Check image available");
    } else {
      System.out.println("No available check image");
    }
  }

  public void orderDebitCard(boolean ordered, String designChoice,boolean rushShipping) {

    if (ordered) {
      System.out.println("Card has been ordered");
      System.out.println("Design selected: " + designChoice);
      if (rushShipping) {
        System.out.println("Order has been expedited");
      } else {
        System.out.println("Order has gone through standard shipping");
      } 
    } else {
      System.out.println("There is no current card orders");
    }
  }
}
