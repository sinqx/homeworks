package com.company;
import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas{        // Задача Б

    int size = 350;
    int x = 80;
    int y = 10;
    int type = 2;
    final String[] INFO = new String[size/10];

    public Drawing(int x, int y, int size, int type) {
        this.x = x;                // На каком расстоянии от левой стенки будет строиться парабола
        this.y = y;               // На каком расстоянии от верхней стенки будет строиться парабола
        this.size = size;        // Чем выше зачение - тем длинее и больше парабола
        this.type = type;       // квадратичная или кубическая парабола. Вводится цифра 2 или 3
    }

    public String[] getINFO() {
        return INFO;
    }

    public static final int FRAME_SIZE = 800;
    public Drawing(){}

    @Override
    public void paint(Graphics graphics){
        int coordinateX = x;
        int coordinateY = y;
        int corrector = 0;// Корректор -  переменная, которая исправляет длину параболы
                            // Без нее одна из сторон получается длинее/короче. Не совсем понимаю, почему так происходит.
        int step= size/-20;

        if(size/10%2 == 0)
            {
            corrector = 10 ;
            if(size%2 == 0) {
                 corrector = 0;
            }
        } else {
            corrector = 10;
            if(size%10 != 0){
                corrector = 20;
            }
        }

        if(size < 100){
            System.out.println("Недопустимое значение размера. Введите значение, которое будет больше 100");
        }
        if(type != 2 || type != 3)
        {
            System.out.println("Введите цифру 2 или три - Квадраитчная или кубическая парабола");
        }
        if(type == 3)
        {
            y= +150+size;
        }

        int i = -1;
        for(int x = coordinateX ; x < size + coordinateX - corrector; x=x+10)
        {
            int x2 = x+10;
            int y = (int)Math.pow(step++,type) + coordinateY;
            int y2 = (int)Math.pow(step++,type)+ coordinateY;
            graphics.drawLine(x,y,x2,y2);

            INFO[++i]  = "------ Линия номер " + --step + " начинается с Х1- " + x + ", Y1- " + y +
                    " и заканчивается на Х2 -" + x2 + ", Y2-" + y2;
            System.out.println( INFO[i]);
        }
    }

    public static void main(String[] args){
        Drawing canvas = new Drawing();
        JFrame jFrame = new JFrame();
        jFrame.setSize(FRAME_SIZE, FRAME_SIZE);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(canvas);
        jFrame.setVisible(true);
    }
}