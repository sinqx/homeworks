package com.company;

public class Animal {
    int age;
    String name;
    Person owner;
    boolean hair;

    public Animal(){}

    public Animal(int age, String name, Person owner, boolean hair) {
        this.age = age;
        this.name = name;
        this.owner = owner;
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Имя" + this.name + ", возраст: " + this.age + ", владелец: " + this.owner;
    }
}
