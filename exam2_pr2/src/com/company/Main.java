package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza testPep = new Pepperoni(15, 1.8, true);
        Pizza testMarg = new Margarita(10,0.6,false);
        Pizza testLa= new LaFinta(20,2.1,true);

        System.out.println(testPep); // Этикетка
        testMarg.cooking(); // Готовка
        testLa.delivery(); // Доставка
    }
}
