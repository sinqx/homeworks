package com.company.animals;

import com.company.interfaces.Flyable;

public class Parrot implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("chik brick i v damki");
    }
    @Override
    public void fly() {
        System.out.println("Fly with their wings");
    }
}
