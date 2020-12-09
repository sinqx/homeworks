package com.company;

public class Shop {
    int delivery;
    int delivTime;
    int tax;
    int risk;

    public Shop(int delivery, int delivTime, int tax, int risk) {
        this.delivery = delivery;
        this.delivTime = delivTime;
        this.tax = tax;
        this.risk = risk;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public int getDelivTime() {
        return delivTime;
    }

    public void setDelivTime(int delivTime) {
        this.delivTime = delivTime;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }
}

