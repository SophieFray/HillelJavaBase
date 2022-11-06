package com.hillel.viarhiozov.homeworks.Homework5;

import java.util.Scanner;

public class Homework5_0 {

    public static void main(String[] args) {


//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних
//        шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.
        Scanner scanner = new Scanner(System.in);

        int shipCount = 0;

        while (true) {
            System.out.println("\nEnter Ship Count");
            if (scanner.hasNextInt()) {
                shipCount = scanner.nextInt();
                break;
            } else {
                System.out.println("\nWrong input! Only int allowed!");
                scanner.nextLine();
            }
        }

        int luckyShuttleCount = 0;


        for (int i = 1; luckyShuttleCount < shipCount; i++) {

            int ship = i;

            while (ship != 0) {


                if (ship % 10 == 4 || ship % 10 == 9) {

                    break;

                }
                ship /= 10;

            }

            if (ship == 0) {


                System.out.print(i + " ");
                luckyShuttleCount++;
                if (luckyShuttleCount % 20 == 0) {
                    System.out.println();
                }


            }


        }

    }

}
