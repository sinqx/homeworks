package com.company;

public class CircleThings implements Circable{
    String Apples;
    String Balls;
    String Sport = "tennis";

    public CircleThings(String apples) {
        this.Apples = apples;
    }

    public CircleThings(String balls, String sport) {
        Balls = balls;
        Sport = "tennis";
    }

    public String getApples() {
        return Apples;
    }

    public String getBalls() {
        return Balls;
    }

    @Override
    public void Circable() {
        System.out.println("Круглое");
    }
}
