//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Group {
    Student[] classmates;
    Kurs kurs;
    String startDate;
    int duration;

    public Group(Student[] classmates, Kurs kurs, String startDate, int duration) {
        this.classmates = classmates;
        this.kurs = kurs;
        this.startDate = startDate;
        this.duration = duration;
    }

    public String toString() {
        return "Продолжительность: " + this.duration + ", ходит на курсы " + this.kurs.name + ". Кол-во учеников: " + this.classmates.length;
    }

    public Student[] getClassmates() {
        return this.classmates;
    }

    public void setClassmates(Student[] classmates) {
        this.classmates = classmates;
    }

    public Kurs getKurs() {
        return this.kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
