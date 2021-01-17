package com.company;

public class District extends AbstractLocality{
    public District() {}

    public District(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String text = "Название района: " + getName() + ". Руководитель района: " + getLeader();
        return text;
    }
}
