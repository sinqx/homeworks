package com.company;

import java.util.Date;

public class Credit {
    private int id;
    private int sum;
    private String date;
    private double percent;

    public Credit(int id, int sum, String date, double percent) {
        this.id = id;
        this.sum = sum;
        this.date = date;
        this.percent = percent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
