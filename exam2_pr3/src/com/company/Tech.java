package com.company;

public class Tech extends Book{
    static int count = 1;
    static final Book[] massive1 = new Book[count];
    String name = "Технический";
    int  quantity= 0;
     static void add(Book book){

         massive1[count-1] = book;
         count++;
       otdel.addAll(book, 1);
    }

    static void info(){
        int  quantity= 0;
        for(int i = 0; i < massive1.length;i++)
        {
            System.out.println(massive1[i].name);
            quantity++;
        }
    }

    public static void find(String author) {
        for (int i = 0; i < massive1.length; i++) {
            if (author.equals(massive1[i].author)) {
                System.out.println(massive1[i].name);
            }
        }
    }

    @Override
    public String toString() {
        for(int i = 0; i < massive1.length;i++)
        {
            System.out.println(massive1[i].name);
            quantity++;
        }
        return "Отдел: " + name + ", количество книг: " + quantity;
    }
}
