package com.company;

import com.company.animals.*;
import com.company.other.*;
import com.company.interfaces.*;

public class Main {

    public static void main(String[] args) {

        Swimmable[] Ocean = new Swimmable[4];
        Ocean[0] = new Duck();
        Ocean[1] = new Shark();
        Ocean[2] = new Whale();
        Ocean[3] = new Ship();

        Flyable[] Sky = new Flyable[4];
        Sky[0] = new Plane();
        Sky[1] = new Parrot();
        Sky[2] = new Plane();
        Sky[3] = new Duck();

        Walkable[] Walkers = new Walkable[3];
        Walkers[0] = new Cat();
        Walkers[1] = new Person();
        Walkers[2] = new Duck();

        for (Swimmable swimmer : Ocean) {
            swimmer.swim();
        }
        System.out.println("");

        for (Flyable flier : Sky) {
            flier.fly();
        }
        System.out.println("");

        for (Walkable walker : Walkers) {
            walker.walk();
            walker.makeSound();
        }
    }
}
//1. Как вы понимаете понятие полиморфизма
// Это способность использовать различные методы с разными параметрами в одном или сразу в нескольких классах.

//2. Что такое кастинг(cast) типов в мире программирования?
// Это преобразование одних типов данных в другой тип. Это расширение типа,
// например можно преобразовать переменную float в long, но нельзя наоборот.

//3. Зачем мы храним объекты типа Shark, Duck, Turtle в одном массиве?
// Эти объекты имеют что-то общее. В нашем случае, все они могут плавать, тобишь имеют интерфейс swimmable.
// Тем самым мы сможем пройтиись по этому массиву через цикл и вызвать метод этого интерфейса, например

//4. Какие есть ограничения при хранении разных типов (Shark, Duck, Turtle и т.д.) в одном массиве (Swimmable)
// Мы можем обратиться только к интерфейсу swimmable, но например Duck может ещё летать/ходить,
// и этот интерфейс мы уже не сможем использовать

//5. Что произойдет после того как отработает следующая строчка кода, опишите подробнее:  Person[] people;
// Если Person - это класс, то мы создадим массив пока ещё не созданных объектов класса Person, при этом, мы не указываем размер массива.
// Можно сказать, мы подготовили пустой массив, который будем заполнять именно этими объектами

