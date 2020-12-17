package com.company;

public abstract class Pizza {
    int cost;
    double weight;

    public Pizza(int cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void cooking(){System.out.println("Готовится пицца");}
    public void delivery(){System.out.println("Скоро доставят пиццу");}
}
