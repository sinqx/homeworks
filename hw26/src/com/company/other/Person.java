package com.company.other;

import com.company.interfaces.Walkable;

public class Person implements Walkable {
    @Override
    public void makeSound() {
        System.out.println("Person make many sounds");
    }
    @Override
    public void walk(){
        System.out.println("Person walk with his legs");
    }
}
