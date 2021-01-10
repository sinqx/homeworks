package com.company.animals;

import com.company.interfaces.Walkable;

public class Cat implements Walkable {
    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
    @Override
    public void walk(){
        System.out.println("Walk with paws");
    }
}
