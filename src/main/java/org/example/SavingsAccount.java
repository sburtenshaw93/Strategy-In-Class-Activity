package org.example;
import java.time.LocalDate;

public class SavingsAccount implements PaymentStrategy{

    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from bank account.");
    }

    public void currentSavings(int amount, int month, int day) {
    System.out.println("Current savings amount: $" + amount + " Month: " + month + " Day: " + day);
    } 

    public void calculateInterest(int amount, float interest, int month, int day) {
        float interestEarned = amount * interest;
        System.out.println("Interest earned: $" + interestEarned + " on " + month + "/" + day);
    }

    public void checkWithdrawalLimit(int amount, int withdrawals, int month, int day) {
        int withdrawalLimit = 6;
        
        if (withdrawals >= withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded. You've made " + withdrawals + " withdrawals this month.");
            System.out.println("Maximum allowed: " + withdrawalLimit);
        } else {
            System.out.println("Withdrawal of $" + amount + " approved on " + month + "/" + day);
            System.out.println("Withdrawals used: " + withdrawals + "/" + withdrawalLimit);
        }
    }
} 