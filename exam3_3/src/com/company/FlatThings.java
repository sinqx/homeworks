package com.company;

public class FlatThings implements Flatable{
    String bookName;
    String folderName;
    int pages;

    public FlatThings(String bookName, int pages) {
        this.bookName = bookName;
        this.pages = pages;
    }

    public FlatThings(String folder) {
        this.folderName = folder;
    }

    public String getBookName() {
        return bookName;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void Flatable() {
        System.out.println("Cylindrical");
    }
}
