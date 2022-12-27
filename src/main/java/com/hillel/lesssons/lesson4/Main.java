package com.hillel.lesssons.lesson4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;


//       System.out.println(5 + 10);
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//
//
//        System.out.println(a / b);
//        System.out.println((double) a / b);
//        System.out.println(a / (double) b);
//        System.out.println((double) a / (double) b);


//        System.out.println(a % b); // 3 * 3 = 9.  10 - 9 = 1

//        System.out.println(10 % 2); // 5 * 2 = 10. 10 - 10 = 0
//        System.out.println(10 % 3); // 3 * 3 = 9.  10 - 9 = 1
//        System.out.println(10 % 4); // 2
//        System.out.println(10 % 5); // 0
//        System.out.println(10 % 6); // 4
//        System.out.println(10 % 7); // 3
//        System.out.println(10 % 8); // 2
//        System.out.println(10 % 9); // 1

//        int a = 10;
//        int b = 3;

//        a = a + 5;
//        a = a + 5;

//        a += 5;
//        System.out.println(a);
//        a -= 5;
//        System.out.println(a);
//        a *= 5;
//        System.out.println(a);
//        a /= 5;
//        System.out.println(a);
//        a %= 5;
//        System.out.println(a);

//        System.out.println(a + b * a - b);
//        System.out.println((a + b) * a - b);
//        System.out.println((a + b) * (a - b)); // 13 * 7


//        int a = 10;
//        int b = 3;

//        System.out.println(--a); // 9
//        System.out.println(--a); // 8
//        System.out.println(--a); // 7
//        System.out.println(--a); // 6

//        System.out.println(a--);  // 10
//        System.out.println(a--);  // 9
//        System.out.println(a--);  // 8
//        System.out.println(a--); // 7

//        a = a + 1;
//        a += 1;

//        System.out.println("before a = " + a);
//        System.out.println(10 + a++);
//        System.out.println("after a = " + a);

//        System.out.println("a = " + a);  // 10
//        System.out.println("b = " + b);  // 3
//
//        System.out.println(--a + b++ + ++b - a++); // 8
//
//        System.out.println("a = " + a);  // 10
//        System.out.println("b = " + b);  // 5


//        int a = 10;
//        int b = 3;
//
//        System.out.println("a = " + a);  // 10
//        System.out.println("b = " + b);  // 3
//
//        System.out.println(--a * (a++ + --b) + b--); // 101
//
//        System.out.println("a = " + a);  // 10
//        System.out.println("b = " + b);  // 1



        // MATH

//        System.out.println((int) 10.7);
//        System.out.println(Math.round(10.7));
//        System.out.println(Math.round(10.5));
//        System.out.println(Math.round(10.4));

//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));

//        System.out.println(Math.max(10, 11));
//        int max = Math.max(11, 11);
//        System.out.println(max);
//        System.out.println(Math.min(10, 9));

//        System.out.println(Math.sqrt(25));

//        System.out.println(Math.pow(5, 2));


        // from 0.0 to 0.99999999999999999
        // 0.0 * 11 = 0 - min
        // 0.9999999 * 11 = 10.999999999999999999 (int) - 10 - max
//        System.out.println((int) (Math.random() * 11));


        // from 15 to 30

        // 0.0 * 31 = 15 - min
        // 0.9999999 * 16 = 15.999999999999999999 (int) - 15 + 15  =30 - max

        //BAD!
//        System.out.println(15 + (int) (Math.random() * 16));


//        int min = 15;
//        int max = 30;
//        // 30 - 15 + 1 = 16
//        System.out.println((int) (Math.random() * (max - min + 1)) + min);



        //task 1
//        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.

        int a = 500;
        int b = 1500;
        int c = 3500;

        int years = 10 * 12;

        int employee1Salary10years = a * years;
        int employee2Salary10years = b * years;
        int employee3Salary10years = c * years;

        System.out.println("employee1Salary10years = " + employee1Salary10years);
        System.out.println("employee2Salary10years = " + employee2Salary10years);
        System.out.println("employee3Salary10years = " + employee3Salary10years);

        double employee1Salary10yearsWithoutTax = employee1Salary10years * 0.95;
        double employee2Salary10yearsWithoutTax = employee2Salary10years * 0.95;
        double employee3Salary10yearsWithoutTax = employee3Salary10years * 0.95;

        System.out.println();
        System.out.println("employee1Salary10yearsWithoutTax = " + employee1Salary10yearsWithoutTax);
        System.out.println("employee2Salary10yearsWithoutTax = " + employee2Salary10yearsWithoutTax);
        System.out.println("employee3Salary10yearsWithoutTax = " + employee3Salary10yearsWithoutTax);

        double avgWithoutTax = (employee1Salary10years + employee2Salary10years + employee3Salary10years) / 3.0;
        double avgWithTax = (employee1Salary10yearsWithoutTax + employee2Salary10yearsWithoutTax + employee3Salary10yearsWithoutTax) / 3.0;

        System.out.println();
        System.out.println("avgWithoutTax " + avgWithoutTax);
        System.out.println("avgWithTax " + avgWithTax);

    }
}
