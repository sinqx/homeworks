package com.company;

public class Book {
    int id;
    String name;
    String author;
    int year;

    public Book(){}

    public Book(String name, String author, int year) {
        otdel.n++;
        this.id= otdel.n;
        this.name = name;
        this.author = author;
        this.year = year;
    }

}
