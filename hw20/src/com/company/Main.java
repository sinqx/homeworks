package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shop Ozon = new Shop(20,5,5,20);
        Shop Amazon = new Shop(35,14,15,5);
        Shop AliBaba = new Shop(10,9,15,14);

        Shop[] shopList = new Shop[]{Ozon,Amazon,AliBaba};

        System.out.println("Введите цену вещи: ");
        double cost = sc.nextDouble();

        System.out.println("Введите вес вещи: ");
        double weight = sc.nextDouble();

        Purchase thing = new Purchase(cost,weight);

        System.out.println("Выберитечто для вас важней:\n" +
                "1.Быстрая доставка\n" +
                "2.Дешёвая доставка\n" +
                "3.Безопасная доставка\n ");
        int choice = sc.nextInt();

        switch (choice){
            case(1):
                System.out.printf("Самая быстрая доставка у магазина Ozon: %s дней.", Ozon.delivTime);break;
            case(2):
                System.out.printf("Cамая выгодна покупка составит %s долларов.", cheapBuy(shopList,thing));break;
            case(3):
                if (thing.cost>10000){
                    System.out.printf("Самая безопаская доставка у магазина Amazon: %s риска.", Amazon.risk);
                } else{
                    System.out.println("С ценой до 10000 долларов - у вас нет никаких рисков.");
                }
                break;
            default:System.out.println("Выберите один из трёх вариантов");break;
        }

    }

    static String cheapBuy(Shop[] shop, Purchase Glasses){
        int daysOzon, daysAmazon, daysAliBaba;
        daysOzon = (int) (shop[0].delivery *  Glasses.weight + shop[0].tax * Glasses.cost);
        daysAmazon = (int) (shop[1].delivery * Glasses.weight + (shop[1].tax * Glasses.cost));
        daysAliBaba = (int) (shop[2].delivery *  Glasses.weight + shop[2].tax * Glasses.cost);
        String best;

        if(daysOzon<daysAmazon) { best = "Магазин Ozon" + daysOzon;
        }else if(daysOzon>daysAmazon){ best = "Магазин Amazon" + daysAmazon;
        }else{ best = "Магазин Alibaba" + daysAliBaba;}
        return best;
    }
}
