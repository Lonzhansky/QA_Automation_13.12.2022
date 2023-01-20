package com.hillel.lesssons.lesson11.interfaces;

public class Parrot extends Animal implements Flyieble, Runnable {

    @Override
    public void fly() {
        System.out.println(name + " fly");
    }

    @Override
    public void run() {
        System.out.println(name + " cant run");
    }
}
