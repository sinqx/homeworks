package com.company;

public class Fish extends Animal{
    int aquariumCost;
    boolean multicolored;

    public Fish(int age, String name, Person owner, boolean hair, int aquariumCost, boolean multicolored) {
        super(age, name, owner, hair);
        this.aquariumCost = aquariumCost;
        this.multicolored = multicolored;
    }

    @Override
    public String toString() {
        return "Имя" + this.name + ", цена аквариума: " + this.aquariumCost + ", владелец: " + this.owner;
    }

    public int getAquariumCost() {
        return aquariumCost;
    }

    public void setAquariumCost(int aquariumCost) {
        this.aquariumCost = aquariumCost;
    }

    public boolean isMulticolored() {
        return multicolored;
    }

    public void setMulticolored(boolean multicolored) {
        this.multicolored = multicolored;
    }
}
