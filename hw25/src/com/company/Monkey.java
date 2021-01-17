package com.company;

public class Monkey implements Climbable,Eatable{
    boolean carry;

    public Monkey(){}

    public Monkey(boolean carry) {
        this.carry = carry;
    }

    @Override
    public void climb(){
        System.out.println("Я могу карабкаться");
    }

    @Override
    public void eat(){
        System.out.println("Я кушаю фрукты");
    }

    public void Carry(){
        if(carry){
            System.out.println("Я несу на спине обезяну");
        }
    }
}
