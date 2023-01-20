package com.hillel.lesssons.lesson11.fisrt;

public class Demo {

    static void printStaticVariable() {
        System.out.println(Student.counter);
        Student.counter = 5;
    }
}
