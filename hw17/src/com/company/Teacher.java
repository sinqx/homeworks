package com.company;

public class Teacher extends  Person{
    String codeLang;
    int salary;

    public Teacher(String name, String surname, int age, String gender, String codeLang, int salary) {
        super(name, surname, age, gender);
        this.codeLang = codeLang;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя:" + this.name + ", язык преподавания : " + this.codeLang;
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
