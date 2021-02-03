package com.company;

public class Person {
    String surname;
    String name;
    String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString(){
        return "Фамилия: " + getName() + ", имя: " + getSurname() + ", отчество: " + getPatronymic();
    }
}
