package com.company.animals;

import com.company.interfaces.Swimmable;

public class Shark implements Swimmable {
    @Override
    public void makeSound() {
        System.out.println("....");
    }
    @Override
    public void swim(){
        System.out.println("Swim with their fins");
    }
}
