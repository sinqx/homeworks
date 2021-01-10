package com.company.animals;

import com.company.interfaces.Flyable;
import com.company.interfaces.Swimmable;
import com.company.interfaces.Walkable;

public class Duck implements Swimmable, Walkable, Flyable {
    @Override
    public void makeSound() {
        System.out.println("Duck duck");
    }
    @Override
    public void walk(){
        System.out.println("Walk with duck feet");
    }

    @Override
    public void swim() {
        System.out.println("Swim with duck feet");
    }

    @Override
    public void fly() {
        System.out.println("Fly with their wings");
    }
}
