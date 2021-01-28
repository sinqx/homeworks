package com.company;

public class Main {

    public static void main(String[] args) {
        CircleThings[] Apples20 = new CircleThings[20];
        CircleThings[] Apples10 = new CircleThings[10];

        CircleThings[] Balls50 = new CircleThings[50];
        CircleThings[] Balls3 = new CircleThings[30];

        for (int i = 0; i < Apples20.length; i++) {
            Apples20[i] = new CircleThings("green");
        }

        for (int i = 0; i < Apples10.length; i++) {
            Apples10[i] = new CircleThings("yellow");
        }

        for (int i = 0; i < Balls50.length; i++) {
            Balls50[i] = new CircleThings("sportable", "tennis");
        }

        for (int i = 0; i < Balls3.length; i++) {
            Balls50[i] = new CircleThings("sportable", "tennis");
        }

        FlatThings Book = new FlatThings("funny tales",166);
        FlatThings Folder = new FlatThings("KG product");

        CylindricalThings Water = new CylindricalThings("Oasis");
        CylindricalThings Cola = new CylindricalThings("Coca-cola", 30);

	    Rucksack pack1 = new Rucksack(Apples20, Book, Cola);
	    Rucksack pack2 = new Rucksack(Balls50, Folder, Water);
	    Rucksack pack3 = new Rucksack(Apples10, Balls3, Folder, Cola);
    }
}
