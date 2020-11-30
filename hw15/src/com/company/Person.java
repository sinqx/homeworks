package com.company;

import java.util.Objects;

public class Person {
    String name;
    String surname;
    String patronymic;
    int birthYear;
    String hobby;
    String gender;
    int age;

    public Person(String name, String surname, String patronymic, int age, String hobby, String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = 2020 - age;
        setHobby(hobby);
        this.gender = gender;
    }

    public Person(String name, String surname, String patronymic, int age, String gender){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = 2020 - age;
        this.gender = gender;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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
