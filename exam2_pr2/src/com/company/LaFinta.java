package com.company;

public class LaFinta extends Pizza{
    boolean mushrooms;

    public LaFinta(int cost, double weight, boolean mushrooms) {
        super(cost, weight);
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString(){
        String check;
        if(mushrooms)check = "с грибами.";else check ="без грибов.";
        return "Готовится пицца ЛаФинта, " + check + " Вес: " + weight + " кг. Стоимость: " + cost;
    }

    public void cooking(){
        System.out.println("Готовится пицца ЛаФинта");
    }

    public void delivery(){
        String check;
        if(mushrooms)check = "с грибами.";else check ="без грибов.";
        System.out.println("Везут пиццу ЛаФинта, "  + check + " Вес: " + weight + " кг. Стоимость: " + cost);
    }
}
