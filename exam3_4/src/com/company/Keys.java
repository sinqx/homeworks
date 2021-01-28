package com.company;

public class Keys extends Ringing{
    int quantity;
    String forWhat;

    public Keys(int quantity, String forWhat) {
        this.quantity = quantity;
        this.forWhat = forWhat;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getForWhat() {
        return forWhat;
    }
}
