package com.hillel.lesssons.lesson11.fisrt;

public class Student {

    static int counter = 0;

    public String name;
    protected String surename;
    //default / package-private
    int age;
    private final double avgPoint;

    public Student(String name, String surename, int age, double avgPoint) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.avgPoint = avgPoint;

        System.out.println(this);
    }

    public Student(String name, String surename, int age) {
        this(name, surename, age, 0.0);
    }

    public Student(String name, String surename) {
        this(name, surename, 0);
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
