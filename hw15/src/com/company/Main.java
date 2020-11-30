package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {        // Задание А
        Person Ivan = new Person("Иван", "Иванов", "Иванович", 17, "парень");
        Person Jenya = new Person("Женя", "Женьев", "Женьевич", 21, "парень");
        Person Lera = new Person("Лера", "Лерьева", "Иванович", 15, "химия", "девушка");
        Person Vlad = new Person("Владимир", "Путин", "Владимиррович", 44, "президент", "парень");
        Person Peskov = new Person("Дмитрий", "Песков ", "Сергеевич ", 33,"почти президент", "парень");
        Person Polina = new Person("Полина", "Розенталь", "Евгеньева", 19, "киберспортсменша", "Девушка");
        Person Musa = new Person("Муса", "Усманов", "Усмнович", 18, "гонщик" ,"парень");
        Person Bema = new Person("Бермет", "Курманбековна", "талантбековна", 18, "модель", "девушка");
        Person Winner = new Person("Победитель", "по", "жизни", 24, "парень");
        Person Alex = new Person("Алексей", "Верчагин", "Алексеевич", 17, "парень");
        Person Egor = new Person("Егор", "Егоров", "Егорович", 13, "парень");
        Person Olya = new Person("Ольга", "Яшкина", "Талантбековна", 20, "девушка");
        Person[] people = new Person[]{Ivan,Jenya,Lera,Vlad,Peskov,Polina,Musa,Bema,Winner,Alex,Egor,Olya};

        for(Person pers : people){
            System.out.printf("Зовут %s %s %s, год рождения:  %s , хобби: %s , и это %s. \n", pers.name, pers.surname, pers.patronymic,
                    pers.birthYear, pers.getHobby(), pers.gender);
        }
     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        String[] lng = new String[3];
        lng[0] = "Ru";
        lng[1] = "Eng";
        lng[2] = "De";
                                                                                // Задание С

        Display boe = new Display(15.6, "boe", "ips");
        ssd eluk = new ssd(512, 1);
        RAM samsung = new RAM(16, "Samsung");
        USB usb = new USB(3.0, 3);
        Keyboard standart = new Keyboard(lng, true, true);

        Computer eluktronics = new Computer(boe, "eluktronics", "Black", samsung, "rtx 2060", usb, standart);


        System.out.printf("\nDisplay: %s, company: %s, color: %s, RAM: %s, Video card: %s, usb Types: %s, keyboard: %s", eluktronics.displayType.madeBy,
                eluktronics.madeBy, eluktronics.color, eluktronics.ramType.madeBy, eluktronics.graphicCard, eluktronics.ubsType.type, eluktronics.keyboardType.lang[1]);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Задание B
//1. Что такое конструктор? -  это специальные методы, которые вызывается при создании объекта. Они нужны для создания объектов
//
//2. Что такое дефолтный конструктор (по умолчанию)? - это конструктор, который не имеет параметров.
//          Он создаётся в классе или нами, или автоматический программой
//
//3. Как работает конструктор? - При создании объекта - мы передаём атрибты этого класса в скобках.
//
//4. Для чего нужен конструктор? - Для создания объектов с одинаковыми свойствами, но с разными атрибутами.Для экономии времени
//
//5. Какой конструктор вызывается когда конструкторов несколько? - Если никакие атрибуты не передаются, то конструктор по умолчанию.
//  Далее только тот, который соответствует количеству передаваемый атрибутов.
//
//6. Что такое this - Когда название локальной переменной в сеттере или в конструкторе совпадает
// с названием переменной в классе, то используется this.
