package com.company;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание А -------------------------------------------");
        List<String> testList1 = new ArrayList<>();
        List<String> newList = new ArrayList<>();

        testList1.add("Ветер с моря дул");
        testList1.add("Нагонял беду");
        testList1.add("И сказал ты мне");
        testList1.add("Больше не приду");

        for(int i = 0; i < testList1.size(); i=i+2){
            testList1.add(i+1,testList1.get(i));

            if(testList1.get(i).length() >= 15){
                newList.add(testList1.get(i));
            }
        }

        System.out.println(testList1);
        System.out.println(newList);

        for(int i = 0; i < newList.size(); i++){
            if(newList.get(i).equals("И сказал ты мне")){
                newList.remove(i);
            }
        }
        System.out.println(newList);

        System.out.println("Задание В -------------------------------------------");

        Random random = new Random();

        List<Integer> ArrayList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i <= 50; i++){
            int num = random.nextInt(100);
            ArrayList.add(num);

            if(num %2 == 0){
                evenList.add(num);
            }
            else {
                oddList.add(num);
            }
        }

        System.out.println(ArrayList);
        System.out.println(evenList);
        System.out.println(oddList);

    }
}

//        1. Как вы понимаете массивы? 2. Как вы понимаете ArrayList? 3. В чем отличия между обычным массивом и ArrayList?
// Массив - это сгруппированные по индексам данные одного типа с фиксированной длинной, а ArrayList - это расширяемый массив.
// Если в массиве можно только удалит/заменить элемент без сдвиша самого массива. В ArrayList элементы сдвигаются при удаление/добавлении элемента

//        4. Как вы понимаете Wrapper классы и для чего они нужны?
// Это такие преобразователи примитивов, оболочка для них.

//        5. Чем отличаются методы set(a, b) и add(a, b) у ArrayList
// set(a, b) - заменяет элемент на позиции "а", на элемент "b". add(a, b) добавляет элемент "b" на позицию "а"
