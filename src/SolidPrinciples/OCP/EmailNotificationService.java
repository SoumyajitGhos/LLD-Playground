package SolidPrinciples.OCP;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        System.out.println("The OTP has been sent to Email");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("The transaction report has been sent to Email");
    }
}
