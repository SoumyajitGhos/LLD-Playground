package Interfaces;

public class Main {
    public static void main(String[] args) {
        /**
         * When to use an Interface and Abstract Class ??
         * => An Interface is a good choice when you know a method has to be there,
         *    but it can be implemented differently by independent derived classes
         * => Abstract class is a good choice when I am sure that some methods are
         *    concrete/defined and must be implemented the same way in all derived classes.
         */
        PaymentViaPhonePay gpay = new PaymentViaPhonePay();
        gpay.printReceipt(gpay.makePayment());
    }
}
