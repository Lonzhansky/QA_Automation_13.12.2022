package com.hillel.lesssons.lesson11.task;

public interface Participant {

    void jump();

    void swim();

    default void demoDefault() {
        System.out.println("sdfghffdfgfdg");
    }
}
