package com.company;

public class Main {
    public static void main(String[] args) {
        int TechCount = 0;

        Book techBook1 = new Book("pluplus","Петцольд",2004);
        Book techBook2 = new Book("c#", "Петцольд", 2006);

        boolean start = true;

        Tech.add(techBook1);

        //Только под конец обнаружил, что couunt в классах не меняется. Из-за экзаменов в универе не успеваю всё доделать
    }
}
