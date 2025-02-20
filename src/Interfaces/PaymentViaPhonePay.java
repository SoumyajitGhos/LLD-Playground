package Interfaces;

class PaymentViaPhonePay extends ReceiptManager implements PaymentGateWay {

    @Override
    public String makePayment() {
        return "The payment has been successfully completed using PhonePay";
    }

    @Override
    public void printReceipt(String paymentMessage) {
        System.out.println("Printing the message: " + paymentMessage + ", of type PhonePay payment");
    }
}
