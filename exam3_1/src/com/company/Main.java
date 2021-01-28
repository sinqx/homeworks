package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashSetNumbers = new HashSet<>();
        int massive[] = new int[100];

        for(int i = 0; i< massive.length; i++){
            massive[i] = i+1;
        }
        for(int i = 0; i< massive.length; i++){
            System.out.println(massive[i]);
        }

        for(int i: massive){
            if(i%2 == 0){
                hashSetNumbers.add(i);
            }
        }
            // Перечитав много статей, подвёл итог, что порядок в HashSet невозможен.
    }
}
