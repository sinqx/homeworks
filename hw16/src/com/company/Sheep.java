package com.company;

public class Sheep {
    int weight;
    int age;
    String gender;
    String name;

    public Sheep (){}

    public Sheep (int weight, int age, String gender, String name) {
        this.weight = weight;
        this.age = Math.max(age, 0);
        this.gender = gender;
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
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

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}