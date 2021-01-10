package com.company.other;

import com.company.interfaces.Flyable;

public class Plane implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("vvvjuuuuh");
    }
    @Override
    public void fly() {
        System.out.println("Fly with engine and wings");
    }

}
