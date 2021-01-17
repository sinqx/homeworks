package com.company;

public class Village extends AbstractLocality{
    static Village[] Villages = new Village[2];

    public Village() {}

    public Village(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String text = "Название деревни: " + getName() + ". Председатель деревни: " + getLeader();
        return text;
    }
}
