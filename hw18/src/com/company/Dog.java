
package com.company;

public class Dog extends Animal{
    int trainingCost;
    String skinColor;

    public Dog(int age, String name, Person owner, boolean hair, int trainingCost, String skinColor) {
        super(age, name, owner, hair);
        this.trainingCost = trainingCost;
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Имя" + this.name + ", цена дрессировки: " + this.trainingCost + ", цвет собаки: " + this.skinColor;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

    public void setTrainingCost(int trainingCost) {
        this.trainingCost = trainingCost;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}