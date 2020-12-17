package com.company;

public class Pepperoni extends Pizza{
    boolean spicy;

    public Pepperoni(int cost, double weight, boolean spicy) {
        super(cost, weight);
        this.spicy = spicy;
    }

    @Override
    public String toString(){
        String check;
        if(spicy)check = "острая.";else check ="не острая.";
        return "Готовится пицца Пепперони, " + check + " Вес: " + weight + " кг. Стоимость: " + cost;
    }

    public void cooking(){
        System.out.println("Готовится пицца Пепперони");
    }

    public void delivery(){
        String check;
        if(spicy)check = "острая.";else check ="не острая.";
        System.out.println("Везут пиццу Пепперони, "  + check + " Вес: " + weight + " кг. Стоимость: " + cost);
    }
}

