package com.hillel.viarhiozov.homeworks.Homework5;

public class Homework5_0 {

    public static void main(String[] args) {


//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних
//        шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.


        int luckyShuttleCount = 0;


        for (int i = 1; luckyShuttleCount < 100; i++) {

            if (i % 10 != 4 && i % 10 != 9 && (i / 10) % 10 != 4 && (i / 10) % 10 != 9) {

                System.out.print(i + " ");

                luckyShuttleCount++;

            }

        }


    }

}
