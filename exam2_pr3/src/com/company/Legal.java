package com.company;

public class Legal {
    static int count = 1;
    static final Book[] massive3 = new Book[count];
    String name = "юридической";
    int quantity = 0;
    boolean comp = true;

    static void add(Book book){
        massive3[count-1] = book;
        count++;
        otdel.addAll(book, 1);
    }

    public static void find(String author) {
        for (int i = 0; i < massive3.length; i++) {
            if (author.equals(massive3[i].author)) {
                System.out.println(massive3[i].name);
            }
        }
    }

    static void info(){
        int  quantity= 0;
        for(int i = 0; i < massive3.length;i++)
        {
            System.out.println(massive3[i].name);
            quantity++;
        }
    }

    @Override
    public String toString() {
        for(int i = 0; i < massive3.length;i++)
        {
            System.out.println(massive3[i].name);
            quantity++;
        }
        return "Отдел: " + name + ", количество книг: " + quantity + ". Имеется компьютер";
    }
}
