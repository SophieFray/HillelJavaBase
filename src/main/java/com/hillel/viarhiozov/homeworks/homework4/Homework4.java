package com.hillel.viarhiozov.homeworks.homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int player11 = 0;
        int player21 = 0;
        int player31 = 0;
        int player41 = 0;
        int player51 = 0;
        int player12 = 0;
        int player22 = 0;
        int player32 = 0;
        int player42 = 0;
        int player52 = 0;

        String firstTeam;
        String secondTeam;


        System.out.println("Enter the name of the first team:");

        firstTeam = (scanner.nextLine());


        System.out.println("Enter count of the first Player`s frags of " + "'" + firstTeam + "'" + " team : ");

        if (scanner.hasNextInt()) {

            player11 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }


        System.out.println("Enter count of the second Player`s frags of " + "'" + firstTeam + "'" + " team : ");

        if (scanner.hasNextInt()) {

            player21 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Enter count of the third Player`s frags of " + "'" + firstTeam + "'" + " team : ");

        if (scanner.hasNextInt()) {

            player31 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Enter count of the fourth Player`s frags of " + "'" + firstTeam + "'" + " team : ");

        if (scanner.hasNextInt()) {

            player41 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Enter count of the fifth Player`s frags of " + "'" + firstTeam + "'" + " team : ");

        if (scanner.hasNextInt()) {

            player51 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }


        System.out.println();
        System.out.println();

        System.out.println("Enter the name of the second team:");
        secondTeam = (scanner.nextLine());

        System.out.println("Enter count of the first Player`s frags of " + "'" + secondTeam + "'" + " team : ");
        if (scanner.hasNextInt()) {

            player12 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Enter count of the second Player`s frags of " + "'" + secondTeam + "'" + " team : ");
        if (scanner.hasNextInt()) {

            player22 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }
        System.out.println("Enter count of the third Player`s frags of " + "'" + secondTeam + "'" + " team : ");
        if (scanner.hasNextInt()) {

            player32 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }
        System.out.println("Enter count of the fourth Player`s frags of " + "'" + secondTeam + "'" + " team : ");
        if (scanner.hasNextInt()) {

            player42 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }
        System.out.println("Enter count of the fifth Player`s frags of " + "'" + secondTeam + "'" + " team : ");

        if (scanner.hasNextInt()) {

            player52 = scanner.nextInt();
            scanner.nextLine();


        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }


        int avgTeam1 = Math.round((player11 + player21 + player31 + player41 + player51) / 5);
        int avgTeam2 = Math.round((player12 + player22 + player32 + player42 + player52) / 5);

        if (avgTeam1 == avgTeam2) {
            System.out.println();
            System.out.println();
            System.out.println("It`s a Draw!");

        } else if (avgTeam1 > avgTeam2) {

            System.out.println();
            System.out.println();
            System.out.println(firstTeam + " wins with total " + avgTeam1 + " frags!");


        } else {

            System.out.println();
            System.out.println();
            System.out.println(secondTeam + " wins with total " + avgTeam2 + " frags!");

        }


    }
}



