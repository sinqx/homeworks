package com.company;

public class CylindricalThings implements Cylindrical{
    String cola;
    String water;
    int cost;

    public CylindricalThings(String water) {
        this.water = water;
    }

    public CylindricalThings(String cola, int cost) {
        this.cola = cola;
        this.cost = cost;
    }

    public String getCola() {
        return cola;
    }

    public String getWater() {
        return water;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void cylindrical() {
        System.out.println("Цилиндрическое");
    }
}
