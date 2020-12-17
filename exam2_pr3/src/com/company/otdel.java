package com.company;

public class otdel {
    static int n = 0;
    static Book[][] allBooks = new Book[4][n+1];
    public otdel(){}
    public otdel(Book[][] test) {
        otdel.allBooks = test;
    }

    public static void addAll(Book book, int otdel){
        System.out.println(n);
        allBooks[otdel][n-2] = book;
    }

    public static void find(String name, int p){
        for(int i = 0; i < allBooks[p].length; i++){
            if(name.equals(allBooks[p][i].name)){
                System.out.println("Нашлось");
            }
        }
    }

    public static void infoAll(){
        for(int i = 0; i < allBooks.length; i++){
            for(int j = 0; j < allBooks[i].length; j++){
                System.out.println(allBooks[i][j].name);
            }
        }
    }


}
