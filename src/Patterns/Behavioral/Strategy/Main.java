package Patterns.Behavioral.Strategy;

import Patterns.Behavioral.Strategy.Strategies.CreditCardPayment;
import Patterns.Behavioral.Strategy.Strategies.PayPalPayment;
import Patterns.Behavioral.Strategy.Strategies.UPIPayment;

public class Main {
    public static void main(String args[]) {
        /* The Strategy Design Pattern is a behavioral design pattern used to define a family of algorithms, 
        *  encapsulate each one, and make them interchangeable. 
        *  It allows the algorithm to vary independently from clients that use it.
        */

        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9999", "John Doe"));
        context.payAmount(1500);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("john@example.com"));
        context.payAmount(2000);

        // Pay using UPI
        context.setPaymentStrategy(new UPIPayment("john@upi"));
        context.payAmount(500);
    }

    /* Other examples of this pattern
     * 1) RouteStrategy
     * 2) Sorting Algorithms
     * 3) Data Exporter(pdf, word, etc)
     * 4) Password Encryption
     * 5) Notification Sending System(Email, sms, whatsapp)
     */
}                               