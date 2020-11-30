package com.company;

public class Horse {
    int weight;
    int age;
    String color;
    String gender;
    String name;

    public Horse () {}

    public Horse (int weight, int age, String color, String gender, String name) {
        this.weight = weight;
        this.age = Math.max(age, 0);
        this.color = color;
        this.gender = gender;
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
