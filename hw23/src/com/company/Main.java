package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City bishkek = new City("Бишкек", "Садырка");
        City Osh = new City("Ош", "Таалайбек Сарыбашов");
        City washington = new City("Вашингтон", "Байден");
        Village Chepaevo = new Village("Чепаево", "Важный дядя");
        Village Vyatskoye = new Village("ВорзогорыВятское", "Важный дядя2");
        District Balykchy = new District("Балыкчы", "Дядя Важный3");

        AbstractLocality[] Localities = {bishkek, Osh, washington,  Chepaevo, Vyatskoye, Balykchy};

        for (AbstractLocality i : Localities) {
            System.out.println(i + " ");
        }

        String name = sc.nextLine();

        for (AbstractLocality i : Localities) {
            if (name.equals(i.getLeader())) {
                System.out.println("Есть совпадение" + "\n" + i);
                break;
            }
        }
    }
}

//        1. Что такое модификатор abstract и зачем он нам? 2. К каким элементам можно применять abstract?
// Модификатор abstract нужен для создания абстрактных методов и классов. Такие методы и классы
// не будут иметь в себе никакого кода, а весь рабочий алгортим будет в наследниках.

//        3. Объясните применение abstract для методов.
// Абстрактные методы создаются в классах и уже в наследниках этого класса прописывается вся логика этих методов черех Override

//        4. Приведите примеры реального мира, которые теоретически следовало бы создать abstract в мире ООП. 5. Объясните применение abstract для классов.
// Когда мы создаём несколько классов, схожие чем-то друг на друга. Например классы электро, дизельный, и бензиновый автомобиль
// Для них мы создаём абстрактный класс Автомобиль, в котором будут общие характеристи для всех этих классов