package com.company;

public class Credit {
    private int id;
    private int sum;
    private String date;
    private double percent;
    static int quantity;
    private static int allSum;
    private static double avg;

    public Credit(int id, int sum, String date, double percent) {
        this.id = id;
        this.sum = sum;
        this.date = date;
        this.percent = percent;
        this.allSum += sum;
        this.quantity++;
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

    public void setSum(int sum) { this.sum = sum; }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPercent() { return percent; }

    public void setPercent(double percent) {
        this.percent = percent;
    }


    public static int getQuantity() {
        return quantity;
    }

    public static int getAllSum() {
        return allSum;
    }

    public static double getAvg() {
        avg = allSum / quantity;

        return avg;
    }
}
