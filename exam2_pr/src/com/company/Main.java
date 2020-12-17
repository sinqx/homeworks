package com.company;

public class Main {

    public static void main(String[] args) {
    int count = 0;

	Circle[] circles = new Circle[10];

	for(int i =0 ; i < circles.length; i++){
        circles[i] = new Circle();
	    circles[i].CircleGenerate();

        System.out.println(circles[i].getS());
        if(circles[i].getS() % 3 == 0){
            count++;
        }
    }
        System.out.println(count);
    }
}
