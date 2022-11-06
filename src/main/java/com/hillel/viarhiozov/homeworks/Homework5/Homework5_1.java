package com.hillel.viarhiozov.homeworks.Homework5;

import java.util.Scanner;


public class Homework5_1 {

    public static void main(String[] args) {

//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

        Scanner scanner = new Scanner(System.in);


        int guess = 0;

        int generatedNumber = (int) (Math.random() * 11);
        int misses = 3;

        while (true) {
            System.out.println("\nGuess the Number Game! \nEnter the number!");
            if (scanner.hasNextInt() == false) {

                System.out.println("\nWrong input! Only ints from 0 to 10 are allowed!");
                scanner.nextLine();
                continue;
            }

            guess = scanner.nextInt();
            if (guess < 0 || guess > 10) {

                System.out.println("\nWrong input! Only ints from 0 to 10 are allowed!");
                continue;
            }


            if (generatedNumber == guess) {


                System.out.println("You win!");
                break;


            } else {
                misses--;
                System.out.println("Nope! You have " + misses + " tries left");
            }


            if (misses == 0) {
                System.out.println("You loose! Bomb is badabumed!");
                break;
            }


        }


    }
}
