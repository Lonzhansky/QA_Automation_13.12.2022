package com.hillel.lesssons.lesson6;

import java.util.Scanner;

public class Homewrok {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameTeam1 = scanner.nextLine();


        int team1Player1 = 0;
        int team1Player2 = 0;
        int team1Player3 = 0;
        int team1Player4 = 0;
        int team1Player5 = 0;
        
        if (scanner.hasNextInt()) {
            team1Player1 = scanner.nextInt();
        } else {

        }

        System.out.println(team1Player1);



    }
}
