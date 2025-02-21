package SolidPrinciples.ISP;

public class PayTm implements  UPIPayments {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        /** This option is not applicable for PayTm **/
    }
}
