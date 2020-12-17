package com.company;

public class Art {
    static int count = 1;
    static final Book[] massive2 = new Book[count];
    String name = "Художественный";
    int quantity = 0;
    static void add(Book book){
        System.out.println(count);
        massive2[count-1] = book;
        count++;
        otdel.addAll(book, 1);
    }

    public static void find(String author) {
        for (int i = 0; i < massive2.length; i++) {
            if (author.equals(massive2[i].author)) {
                System.out.println(massive2[i].name);
            }
        }
    }

    static void info(){
        int  quantity= 0;
        for(int i = 0; i < massive2.length;i++)
        {
            System.out.println(massive2[i].name);
            quantity++;
        }
    }

    @Override
    public String toString() {
        for(int i = 0; i < massive2.length;i++)
        {
            System.out.println(massive2[i].name);
            quantity++;
        }
        return "Отдел: " + name + ", количество книг: " + quantity;
    }
}
