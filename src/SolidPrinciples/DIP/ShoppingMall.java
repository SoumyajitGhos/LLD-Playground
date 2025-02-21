package SolidPrinciples.DIP;

import SolidPrinciples.DIP.Sol.BankCard;

/**
 * Dependency Inversion Principle (DIP) :-
 * It states that we must use abstraction (abstract classes and interfaces)
 * instead of concrete implementations. High-level module should not depend
 * on the low-level module but both should depend on the abstraction.
 */
public class ShoppingMall {
    /** This ShoppingMall class is tightly coupled with the
     *  debitCard class.
     */
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        /* This ShoppingMall class is tightly coupled with the debitCard class. */
        DebitCard card = new DebitCard();
        ShoppingMall mall = new ShoppingMall(card);
        mall.doPurchaseSomething(5000);
    }
}
