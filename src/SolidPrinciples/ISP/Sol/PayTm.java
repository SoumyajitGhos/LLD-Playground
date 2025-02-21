package SolidPrinciples.ISP.Sol;

public class PayTm implements UPIPayments {
    /** We don't force PayTm class to implement the cashBack Method
     *  because we segregated that method in another interface
     **/
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
