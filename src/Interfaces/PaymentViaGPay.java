package Interfaces;

class PaymentViaGPay extends ReceiptManager implements PaymentGateWay {
    @Override
    public String makePayment() {
        return "The payment has been successfully completed using GPay";
    }

    @Override
    public void printReceipt(String paymentMessage) {
        System.out.println("Printing the message: " + paymentMessage + ", of type Gpay payment");
    }
}
