package com.hillel.lesssons.lesson11.fisrt;

public class Main {
    public static void main(String[] args) {

        runApp();

        Student student1 = new Student("Den", "Lonzhanskyi");
        Student student2 = new Student("Alex", "Lonzhanskyi", 28);
        Student student3 = new Student("Oleg", "Lonzhanskyi", 28, 100.0);

        Student.counter = 10;

        System.out.println(Student.counter);

        System.out.println(student1.counter);
        System.out.println(student2.counter);
        System.out.println(student3.counter);

        System.out.println();
        System.out.println();
        System.out.println();

        Demo.printStaticVariable();
        System.out.println(Student.counter);


        System.out.println(student1.name);

        System.out.println(student1.getAvgPoint());
//        student1.setAvgPoint(11.1);



    }

    static void demo() {

    }

    static void runApp() {
        Student student1 = new Student("Den", "Lonzhanskyi");
    }
}
