package com.company.study;
import com.company.people.Student;

import java.time.LocalDate;

public class Lessons {
    private LocalDate time;
    private Student[] stud;
    private Kurs datKurs;
    private double start;
    private boolean hw = false;
    private boolean exam = false;

    public Lessons(LocalDate time, Student[] stud, Kurs datKurs, double start, boolean hw, boolean exam) {
        this.time = time;
        this.stud = stud;
        this.datKurs = datKurs;
        this.start = start;
        this.hw = hw;
        this.exam = exam;
    }

    @Override
    public String toString() {
        String examCheck;
        String hwCheck;
        if (this.exam) { examCheck = "были"; } else { examCheck = "не было"; }
        if (this.hw) { hwCheck = "были"; } else { hwCheck = "не было"; }

        String message;
        message = "Урок по курсу " + this.datKurs.name + ", начинается " + this.start + " числа. Дз - " + hwCheck + ". Экзамены: " + examCheck;
        return message;
    }

    public LocalDate getTime() {
        return this.time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Student[] getStud() {
        return this.stud;
    }

    public void setStud(Student[] stud) {
        this.stud = stud;
    }

    public Kurs getdatKurs() {
        return this.datKurs;
    }

    public void setdatKurs(Kurs datKurs) {
        this.datKurs = datKurs;
    }

    public double getStart() {
        return this.start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public boolean isHw() {
        return this.hw;
    }

    public void setHw(boolean hw) {
        this.hw = true;
    }

    public boolean isExam() {
        return this.exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }
}
