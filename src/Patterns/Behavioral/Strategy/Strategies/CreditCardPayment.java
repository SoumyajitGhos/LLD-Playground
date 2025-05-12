package Patterns.Behavioral.Strategy.Strategies;

import Patterns.Behavioral.Strategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " using Credit Card Number : " + cardNumber + " of " + cardHolder);
    }
}
