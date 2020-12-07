package com.company.study;
import com.company.people.Student;

public class Group {
    private Student[] classmates;
    private Kurs kurs;
    private String startDate;
    private int duration;

    public Group(Student[] classmates, Kurs kurs, String startDate, int duration) {
        this.classmates = classmates;
        this.kurs = kurs;
        this.startDate = startDate;
        this.duration = duration;
    }

    @Override
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