package com.company;

public class Money extends PaperThings{
    int quantity;
    String currency;

    public Money(int quantity, String currency) {
        this.quantity = quantity;
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCurrency() {
        return currency;
    }
}
