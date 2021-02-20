package com.company;

import java.time.LocalDateTime;


public class News {
    private int id;
    private String title;
    private String text;
    private LocalDateTime time;

    public News(int id, String title, String text, LocalDateTime time) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        String text = getId()+ "\n" + getTitle() + "\n" + getText() + "\n" + getTime();
        return text;
    }
}