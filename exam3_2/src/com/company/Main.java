package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception{
        LinkedList<Person> test = new LinkedList<>();

        Person man = new Person("test", "test", "test");
        Person guy = new Person("test2", "test2", "test2");
        Person dude = new Person("test3", "test3", "test3");
        Person imposter = new Person("test3", "test3", "test3");

        add(man,test);
        add(guy,test);
        add(dude,test);
        add(imposter,test);

        System.out.println(test);
    }

    public static void add(Person person, LinkedList<Person> list) throws Exception{
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(person.getName()) &&
                    list.get(i).getSurname().equals(person.getSurname()) &&
                    list.get(i).getPatronymic().equals(person.getPatronymic()) ){

                System.out.println("error");
                throw new Exception();
            }
        }

        list.add(person);
        System.out.println("done");
    }
}
