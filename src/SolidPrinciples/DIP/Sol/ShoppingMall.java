package SolidPrinciples.DIP.Sol;

import SolidPrinciples.DIP.DebitCard;

public class ShoppingMall {
    private BankCard card;

    public ShoppingMall(BankCard card) {
        this.card = card;
    }

    public void doPurchaseSomething(long amount) {
        card.doTransaction(amount);
    }

    public static void main(String[] args) {
        /* This ShoppingMall class is loosely coupled with the debitCard or creditCard class. */
        SolidPrinciples.DIP.Sol.BankCard card = new SolidPrinciples.DIP.Sol.DebitCard(); // any implemtation will be fine
        SolidPrinciples.DIP.Sol.ShoppingMall mall = new SolidPrinciples.DIP.Sol.ShoppingMall(card);
        mall.doPurchaseSomething(5000);
    }
}
