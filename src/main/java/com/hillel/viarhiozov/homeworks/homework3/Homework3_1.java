package com.hillel.viarhiozov.homeworks.homework3;

public class Homework3_1 {
    public static void main(String[] args) {

        int liWarriorCount = 860;
        int liArcherCount = 860;
        int liHorseMenCount = 860;

        int minWarriorCount = (int) (liWarriorCount * 1.5);
        int minArcherCount = (int) (liArcherCount * 1.5);
        int minHorseMenCount = (int) (liHorseMenCount * 1.5);

        int liWarriorAtk = 13 * liWarriorCount;
        int liArcherAtk = 24 * liArcherCount;
        int liHorseMenAtk = 46 * liHorseMenCount;

        int minWarriorAtk = 9 * minWarriorCount;
        int minArcherAtk = 35 * minArcherCount;
        int minHorseMenAtk = 12 * minHorseMenCount;

        System.out.println("Let the Battle Begin!");

        System.out.println("\nLi`s Total Attack Power:");
        System.out.println("Warriors - " + liWarriorAtk);
        System.out.println("Archers - " + liArcherAtk);
        System.out.println("Horsemen - " + liHorseMenAtk);

        System.out.println("\nVersus");

        System.out.println("\nMin`s Total Attack Power:");
        System.out.println("Warriors - " + minWarriorAtk);
        System.out.println("Archers - " + minArcherAtk);
        System.out.println("Horsemen - " + minHorseMenAtk);

        System.out.println("\nTotal: " + "Li`s " + (liWarriorAtk + liArcherAtk + liHorseMenAtk) + " Min`s " + (minWarriorAtk + minArcherAtk + minHorseMenAtk));


    }
}
