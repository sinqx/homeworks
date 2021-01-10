package com.company;

public class Cat extends  Animal{
    int hairCutCost;
    String hairColor;

    public Cat(int age, String name, Person owner, boolean hair, int hairCutCost,  String hairColor) {
        super(age, name, owner, hair);
        this.hairCutCost = hairCutCost;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Имя" + this.name + ", цена стрижки: " + this.hairCutCost + ", цвет шерсти: " + this.hairColor;
    }

    public int getHairCutCost() {
        return hairCutCost;
    }

    public void setHairCutCost(int hairCutCost) {
        this.hairCutCost = hairCutCost;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
