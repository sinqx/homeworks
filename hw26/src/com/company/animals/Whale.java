package com.company.animals;

import com.company.interfaces.Swimmable;

public class Whale implements Swimmable {
    @Override
    public void makeSound() {
        System.out.println("whale moans");
    }
    @Override
    public void swim(){
        System.out.println("Swim with their big fins");
    }
}
