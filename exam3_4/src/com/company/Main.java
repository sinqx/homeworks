package com.company;

public class Main {

    public static void main(String[] args) {
    LeftPocket pocket1 = new LeftPocket(new Phone(32000,"Oneplus 3t",false), new Keys(3,"От дома"));
    RightPocket pocket2 = new RightPocket(new Money(250, "Сом"), new Note(true,"Шпаргалка для экзамена"));

        pocket1.phone.Call();
        System.out.println(pocket2.shpargalka.whatWritten);
    }
}
