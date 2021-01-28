package com.company;

public class Phone extends Ringing implements Callable{
    int cost;
    String name;
    boolean calling;
    public Phone(int cost, String name, boolean calling) {
        this.cost = cost;
        this.name = name;
        this.calling = calling;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public boolean isCalling() {
        return calling;
    }

    @Override
    public void Call() {
        System.out.println("Телефон звонит");
    }
}
