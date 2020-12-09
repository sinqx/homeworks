package com.company;

public class Purchase {
    double cost;
    double weight;

    public Purchase(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
