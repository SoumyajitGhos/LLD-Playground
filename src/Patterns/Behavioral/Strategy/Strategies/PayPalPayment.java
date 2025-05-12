package Patterns.Behavioral.Strategy.Strategies;

import Patterns.Behavioral.Strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    private String payPalId;

    public PayPalPayment(String payPalId) {
        this.payPalId = payPalId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " using Pay Pal ID : " + payPalId);
    }
}
