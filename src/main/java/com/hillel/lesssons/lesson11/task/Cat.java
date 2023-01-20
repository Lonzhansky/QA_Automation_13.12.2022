package com.hillel.lesssons.lesson11.task;

public class Cat implements Participant {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " swimming...");
    }

    @Override
    public void jump() {
        System.out.println(name + " jumping...");
    }


    public void demo() {
        System.out.println("sqwerewdfd");
    }

}
