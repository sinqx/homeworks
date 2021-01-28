package com.company;

public class RightPocket {
    Money money;
    Note shpargalka;

    public RightPocket() {
    }

    public RightPocket(Money money, Note shpargalka) {
        this.money = money;
        this.shpargalka = shpargalka;
    }

    public Money getMoney() {
        return money;
    }

    public Note getShpargalka() {
        return shpargalka;
    }
}
