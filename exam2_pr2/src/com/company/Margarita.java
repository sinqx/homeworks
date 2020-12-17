package com.company;

public class Margarita extends  Pizza{
    boolean meat;

    public Margarita(int cost, double weight, boolean meat) {
        super(cost, weight);
        this.meat = meat;
    }

    @Override
    public String toString(){
        String check;
        if(meat)check = "с мясов.";else check ="без мяса.";
        return "Готовится пицца Маргарита, " + check + " Вес: " + weight + " кг. Стоимость: " + cost;
    }

    public void cooking(){
        System.out.println("Готовится пицца Маргарита");
    }

    public void delivery(){
        String check;
        if(meat)check = "с мясов.";else check ="без мяса.";
        System.out.println("Везут пиццу Маргарита, "  + check + " Вес: " + weight + " кг. Стоимость: " + cost);
    }
}
