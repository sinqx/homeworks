package com.company;
import java.util.Random;

public class Circle {
    Random random = new Random();
    final double PI = 3.14;
    int R;
    int S;

    public void CircleGenerate(){
        this.R = random.nextInt(11);
        this.S = (int) (PI * R * R);
    }

    public double getS() {
        return S;
    }
}
