package com.company;

public class Main {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep(90, 1, "F", "Минни");
        Sheep sheep2 = new Sheep(110, 2, "M", "Микки");
        Sheep sheep3= new Sheep(80, 1, "M", "Стэн");
        Sheep sheep4 = new Sheep(150, 4, "F", "Крикунья");

        Cow cow1 = new Cow(333, 5, "F", "Буся");
        Cow cow2 = new Cow(210, 2, "F", "Наташа");
        Cow cow3 = new Cow(410, 8, "M", "Грозный");
        Cow cow4 = new Cow(150, 1, "F", "Грозная");
        Cow cow5 = new Cow(275, 2, "M", "Беляш");
        Cow cow6 = new Cow(315, 4, "M", "Черныш");

        Horse horse1 = new Horse(290, 8, "Коричневая","M", "Плотва");
        Horse horse2 = new Horse(420, 15, "Чёрная","M", "Ворон");
        Horse horse3 = new Horse(180, 4, "Белая", "F", "Стрела");


        Farm farm = new Farm("Ацагат", new Cow[]{cow1, cow2, cow3, cow4, cow5}, new Sheep[]{sheep1, sheep2, sheep3}, new Horse[]{horse1,horse2}, "Алексей Алексеевич");
        Farm farm2 = new Farm("Веркола", new Cow[]{cow6}, new Sheep[]{sheep4}, new Horse[]{horse3}, "Игорь Игорович");

        System.out.printf("Владелец: %s, кол-во лошадей: %s, кол-во овец %s, кол-во коров: %s. \n", farm.owner,
                farm.horses.length, farm.sheeps.length, farm.cows.length);

        System.out.printf("Владелец: %s, кол-во лошадей: %s, кол-во овец %s, кол-во коров: %s. \n", farm2.owner,
                farm2.horses.length, farm2.sheeps.length, farm2.cows.length);
    }



}