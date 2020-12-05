package com.company;

public class Parrot extends Animal {
    String color;
    boolean wild;

    public Parrot(int age, String name, Person owner, boolean hair, String color, boolean wild) {
        super(age, name, owner, hair);
        this.color = color;
        this.wild = wild;
    }

    @Override
    public String toString() {
        String wildChek;
        if(wild){wildChek = "из леса";} else{wildChek = "из магазина";}
        return "Имя" + this.name + ", цвет: " + this.color + ", взят " + wildChek;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }
}
