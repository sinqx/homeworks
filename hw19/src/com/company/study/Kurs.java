package com.company.study;
import com.company.people.Teacher;

public class Kurs {
    protected String name;
    private String date;
    private int id;
    private Teacher teacher;

    public Kurs(String name, String date, int id, Teacher teacher) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Название курса " + this.name + ", ID: " + this.id;
    }

    public void setAll(String name, String date, int id, Teacher teacher) {
        this.name = name;
        this.date = date;
        this.setId(id);
        this.teacher = teacher;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID не может быть равен нулю");
        }

    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public int getId() {
        return this.id;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }
}