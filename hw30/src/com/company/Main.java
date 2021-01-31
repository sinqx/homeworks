package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] catNames = {"Персик", "Васик", "Полик", "Альбус", "Валли", "Зорро", "Гудини", "Рокки"};
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        LinkedList<Cat> catLinkedList = new LinkedList<Cat>();
        Random random = new Random();

        for (int i = 0; i<1000000; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catArrayList.add(new Cat(catNames[randomIndex], randomAge));
        }

        for (int i = 0; i<=1000000; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catLinkedList.add(new Cat(catNames[randomIndex], randomAge));
        }

        long millisBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catArrayList.add(0, new Cat(catNames[randomIndex], randomAge));
        }
        long millisAfter = System.currentTimeMillis();

        System.out.println("Adding to the beginning of an ArrayList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            catArrayList.remove(i);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Removing from the beginning of an ArrayList time: " + (millisAfter - millisBefore));




        millisBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catLinkedList.addFirst(new Cat(catNames[randomIndex], randomAge));
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Adding to the beginning of a LinkedList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            catLinkedList.removeFirst();
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Removing from the beginning of a LinkedList time: " + (millisAfter - millisBefore));

        System.out.println("-----------------------------");

        millisBefore = System.currentTimeMillis();
        int x = catArrayList.toArray().length;
        for (int i = x / 2; i < (x / 2) + 100; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catArrayList.add(i, new Cat(catNames[randomIndex], randomAge));
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Adding to the middle of an ArrayList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        x = catArrayList.toArray().length;
        for (int i = x / 2; i < (x / 2) + 100; i++){
            catArrayList.remove(x / 2);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Removing from the middle of an ArrayList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        x = catArrayList.toArray().length;
        for (int i = x / 2; i < (x / 2) + 100; i++){
            catArrayList.get(i);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Getting from the middle of an ArrayList time: " + (millisAfter - millisBefore));


        millisBefore = System.currentTimeMillis();
        x = catLinkedList.toArray().length;
        for (int i = x / 2; i < (x / 2) + 100; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catLinkedList.add(i, new Cat(catNames[randomIndex], randomAge));
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Adding to the middle of a LinkedList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        x = catLinkedList.toArray().length;
        for (int i = x / 2; i < (x / 2) + 100; i++){
            catLinkedList.remove(x / 2);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Removing from the middle of a LinkedList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        x = catLinkedList.toArray().length;
        for (int i = x / 2; i < (x / 2) + 100; i++){
            catArrayList.get(i);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Getting from the middle of a LinkedList time: " + (millisAfter - millisBefore));


        System.out.println("-----------------------------");


        millisBefore = System.currentTimeMillis();
        x = catArrayList.toArray().length;
        for (int i = x; i < x + 100; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catArrayList.add(new Cat(catNames[randomIndex], randomAge));
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Adding to the end of an ArrayList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        x = catArrayList.toArray().length;
        for (int i = x - 100; i < x; i++){
            catArrayList.get(i);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Getting from the end of an ArrayList time: " + (millisAfter - millisBefore));



        millisBefore = System.currentTimeMillis();
        x = catLinkedList.toArray().length;
        for (int i = x; i < x + 100; i++){
            int randomIndex = random.nextInt(8);
            int randomAge = random.nextInt(20)+1;
            catLinkedList.addLast(new Cat(catNames[randomIndex], randomAge));
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Adding to the end of a LinkedList time: " + (millisAfter - millisBefore));

        millisBefore = System.currentTimeMillis();
        x = catLinkedList.toArray().length;
        for (int i = x - 100; i < x; i++){
            catLinkedList.get(i);
        }
        millisAfter = System.currentTimeMillis();

        System.out.println("Getting from the end of a LinkedList time: " + (millisAfter - millisBefore));

    }
}
