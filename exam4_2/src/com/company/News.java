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

}