package com.company.other;

import com.company.interfaces.Swimmable;

public class Ship implements Swimmable {
    @Override
    public void makeSound() {
        System.out.println("Toot toot");
    }
    @Override
    public void swim(){
        System.out.println("Swim with engine and blades");
    }
}
