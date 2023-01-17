package com.hillel.lesssons.lesson10.main1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = getNumber(scanner, "N");
        int m = getNumber(scanner, "M");


        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("First array: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }

        System.out.println("Second array: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


    }


    static int getNumber(Scanner scanner, String str) {
//        int number = 0;
        System.out.println("Please enter integer for " + str);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 0) {
                    System.out.println("Wrong data! Please enter integer > 0");
                } else {
                    return number;
                }
            } else {
                System.out.println("Wrong data! Try again");
                scanner.nextLine();
            }
        }

//        return number;
    }
}
