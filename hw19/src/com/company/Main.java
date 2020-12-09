package com.company;
import com.company.people.*;
import com.company.study.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student Arthur = new Student("Артур","Аспеков",19, "спорт", "м",
                "универ", "ноутбук");
        Student Arstan = new Student("Арстанбек","Усенов",17, "волонтёрство", "м",
                "школа", "ноутбук");
        Student Bermet = new Student("Бермет","Каработоева",25, "тимЛидерство", "ж",
                "IT_academy", "ноутбук");
        Student Kanykei = new Student("Каныкей","Алмазбекова",18, "тимЛидерство", "ж",
                "IT_academy", "ноутбук");

        Student[] students = new Student[]{Arthur,Arstan,Bermet,Kanykei};

        Teacher Sabina = new Teacher("Сабина", "Темирбекова", 25, "ж", "Java", 50000);


        Kurs Java = new Kurs("Java", "10/10/2020", 3,Sabina);
        Group team1 = new Group(students, Java, "15 Сентября",8);
        Lessons firstLesson = new Lessons(LocalDate.of(2020,10,10), students, Java, 10.04, true,false);

        System.out.println(Java);;
    }
}
