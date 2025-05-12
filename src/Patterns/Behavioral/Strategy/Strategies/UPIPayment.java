package Patterns.Behavioral.Strategy.Strategies;

import Patterns.Behavioral.Strategy.PaymentStrategy;

public class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " using UPI ID : " + upiId);
    }
}
