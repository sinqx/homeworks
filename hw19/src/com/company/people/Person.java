package com.company.people;

import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected int birthYear;
    protected String hobby;
    protected String gender;
    int age;

    public Person(){}

    public Person(String name, String surname,  int age, String hobby, String gender) {
        this.name = name;
        this.surname = surname;
        this.birthYear = 2020 - age;
        setHobby(hobby);
        this.gender = gender;
    }

    public Person(String name, String surname,  int age, String gender){
        this.name = name;
        this.surname = surname;
        this.birthYear = 2020 - age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        String message;
        message = "Имя: " + this.name + "фамилия: " + this.surname + ", дата рождения: " + this.birthYear;
        return message;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = 2020 - age;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getHobby() {
        return Objects.requireNonNullElse(hobby, "нет");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}