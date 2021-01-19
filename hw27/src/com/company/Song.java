package com.company;

public class Song {
    private String name;
    private String author;
    private String genre;
    private String text;

    public Song(){}

    public Song(String name, String author, String genre, String text) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getGenre() {
        return genre;
    }

    public String fullSong(){
        String fullSong = this.name + "\n" + this.author + "\n" + this.genre + "\n" + this.text;
        return fullSong;
    }
}
