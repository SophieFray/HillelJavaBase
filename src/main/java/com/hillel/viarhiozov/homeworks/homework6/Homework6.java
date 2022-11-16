package com.hillel.viarhiozov.homeworks.homework6;

import java.util.Arrays;

public class Homework6 {

    public static void main(String[] args) {


//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.


        int[] team1Ages = new int[25];
        int[] team2Ages = new int[25];
        int avgAgeTeam1 = 0;
        int avgAgeTeam2 = 0;


        for (int i = 0; i < team1Ages.length; i++) {
            team1Ages[i] = (int) (Math.random() * 23) + 18;
            team2Ages[i] = (int) (Math.random() * 23) + 18;

        }

        for (int i = 0; i < team1Ages.length; i++) {

            avgAgeTeam1 += team1Ages[i];
            avgAgeTeam2 += team2Ages[i];

        }

        avgAgeTeam1 = Math.round((float) avgAgeTeam1 / team1Ages.length);
        avgAgeTeam2 = Math.round((float) avgAgeTeam2 / team2Ages.length);


        System.out.println("1st team ages:\n" + Arrays.toString(team1Ages));
        System.out.println("2nd team ages:\n" + Arrays.toString(team2Ages));


        System.out.println("\nAverage age of 1st team: " + avgAgeTeam1);
        System.out.println("Average age of 2nd team: " + avgAgeTeam2);


    }

}
