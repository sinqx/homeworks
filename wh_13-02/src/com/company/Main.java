package com.company;

public class Main {

    public static void main(String[] args) {
	Student programmer = new Student();
	Student lingvist = new Student();
	Student engineer = new Student();

	programmer.kurs =2;
	lingvist.kurs = 1;
	engineer.kurs = 4;

    programmer.name = "Bakyt";
    lingvist.name = "Sergey";
    engineer.name = "Dilshodbek";               // Задане А

    programmer.avgMark = 3.4;
    lingvist.avgMark= 4.2;
    engineer.avgMark= 4.5;

    studentPrint(programmer.kurs, programmer.name, programmer.avgMark);
    studentPrint(lingvist.kurs, lingvist.name, lingvist.avgMark);
    studentPrint(engineer.kurs, engineer.name, engineer.avgMark);

        System.out.print("\n\n");
//////////////////////////////////////////////////////////////////////

    Car jeep = new Car();
    Car formula1 = new Car();
    Car standart = new Car();

    jeep.color = "black";
    formula1.color = "red";
    standart.color = "white";

    jeep.speed = 150;
    formula1.speed = 340;
    standart.speed = 170;

    jeep.type = "mountains";
    formula1.type = "race";
    standart.type = "family";                   //Задание B + C

    jeep.price = 35;
    formula1.price = 855.3;
    standart.price = 11.2;

    carPrint(jeep.color, jeep.speed, jeep.type, jeep.price);
    carPrint(formula1.color, formula1.speed, formula1.type, formula1.price);
    carPrint(standart.color, standart.speed, standart.type, standart.price);
    }



    public static void studentPrint (int kurs, String name, double avgMark)
    {
        System.out.print("Курс: " + kurs + ", имя: " + name + ", средний балл: " + avgMark +"\n");
    }

    public static void carPrint (String color, int speed, String type, double price)
    {
        System.out.print("Цвет: " + color + ", Скорость: " + speed + ", Предназначение: " + type + ", цена: " + price +" К\n");
    }
}


class Student{
    int kurs;
    String name;
    double avgMark;
}

class Car{
    String color;
    int speed;
    String type;
    double price;
}
/////////////////////////////////////////////


 //       · 1. Что такое парадигма ООП? - Метод разработки кода. Некий шаблон, как писать код.
//                                        Решение задачи, путём создания классов, объектов и их свойств.

//        · 2. Что такое классы в Java? - Шаблон для создания объекта. Позде создания класса, можно создать несколько объектов

//        · 3. Что такое свойства класса? - Описание класса. Что может быть изменино. Что имеет в себе этот класс.