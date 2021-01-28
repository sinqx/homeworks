package com.company;

public interface Callable {

    default  void Call(){
        System.out.println("Телефон звонит");
    }
}
