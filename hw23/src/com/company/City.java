package com.company;

public class City extends AbstractLocality{
    static City[] Cities = new City[3];

    public City() {}

    public City(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString() {
        String text = "Название города: " + getName() + ". Мэр города: " + getLeader();
        return text;
    }
}
