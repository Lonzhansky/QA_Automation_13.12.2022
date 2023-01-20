package com.hillel.lesssons.lesson11.fisrt.qwerty;

import com.hillel.lesssons.lesson11.fisrt.Student;

public class StudentChild extends Student {
    public StudentChild(String name, String surename, int age, double avgPoint) {
        super(name, surename, age, avgPoint);
    }

    public StudentChild(String name, String surename, int age) {
        super(name, surename, age);
    }

    public StudentChild(String name, String surename) {
        super(name, surename);
    }


    void demo() {
        System.out.println(surename);
//        System.out.println(avgPoint);
    }
}
