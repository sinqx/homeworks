package com.company;

public class Rucksack{
    Cylindrical cylinder;
    Flatable flat;
    Circable[] circle;

    public Rucksack(Circable[] circle, Flatable flat, Cylindrical bottle) {
        this.circle = circle;
        this.flat = flat;
        this.cylinder = bottle;
    }

    public Rucksack(CircleThings[] Apples, CircleThings[] Balls, FlatThings Folder, CylindricalThings Cola) {
        this.circle = Apples;
        this.circle = Balls;
        this.flat = Folder;
        this.cylinder = Cola;
    }

    public Cylindrical getCylinder() {
        return cylinder;
    }

    public Flatable getFlat() {
        return flat;
    }

    public Circable[] getCircle() {
        return circle;
    }

}
