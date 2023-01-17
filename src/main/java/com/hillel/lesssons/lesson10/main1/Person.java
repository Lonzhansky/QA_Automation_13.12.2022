package com.hillel.lesssons.lesson10.main1;

public class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, int x) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println(name + " say hello");
    }

    int getAge() {
        return age;
    }

    void increaseAge() {
        age++;
    }

    void demo() {
        int someVariable;

//        System.out.println(someVariable);
    }

    void demo2() {
        String name = "qwerty";

        System.out.println(name);
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
