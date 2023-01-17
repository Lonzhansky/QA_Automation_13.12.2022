package com.hillel.lesssons.lesson10.main2;

public class Parrot extends Animal {

    int age;

    void fly() {
        System.out.println(name + " fly");
    }

    @Override
    void run() {
        System.out.println(name + " cant run!!!");
    }

}
