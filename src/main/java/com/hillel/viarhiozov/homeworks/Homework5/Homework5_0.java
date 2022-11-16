package com.hillel.viarhiozov.homeworks.Homework5;

import java.util.Scanner;

public class Homework5_0 {

    public static void main(String[] args) {


//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних
//        шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.

        Scanner scanner = new Scanner(System.in);

        //Желаемое колличество кораблей введенное юзером
        int shipCount = 0;

        while (true) {
            System.out.println("\nEnter Ship Count");
            if (scanner.hasNextInt()) {
                shipCount = scanner.nextInt();
                if (shipCount > 0) {
                    break;
                } else {
                    System.out.println("Ship count should be 1 or greater!");
                }

            } else {
                System.out.println("\nWrong input! Only int allowed!");
                scanner.nextLine();
            }
        }
        //колличество пронумерованных кораблей (без несчастливых цифр)
        int luckyShuttleCount = 0;

        //нумеруем пока не наберем указанное юзером количество кораблей
        for (int i = 1; luckyShuttleCount < shipCount; i++) {

            //число для анализа последней цифры в нем
            int ship = i;

            //проходимся по всему числу чтобы понять содержит ли оно нежелательные цифры
            while (ship != 0) {


                if (ship % 10 == 4 || ship % 10 == 9) {
                    // если нашли нежелательную цифру переходим к следующему числу (номеру корабля)
                    break;

                }

                //для того что бы перейти к след. цифре в числе
                ship /= 10;

            }

            //дошли до 0 - значит нежелательных цифр, нет - печатаем
            if (ship == 0) {


                System.out.print(i + " ");
                luckyShuttleCount++;
                //перенос строки на каждом 20 корабле для читабельности
                if (luckyShuttleCount % 20 == 0) {
                    System.out.println();
                }


            }


        }

    }

}
