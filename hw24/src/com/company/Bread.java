package com.company;

public class Bread implements Bakable{
    @Override
    public void bake(){
        System.out.println("Выпекаемый");
    }
}
