package com.hillel.viarhiozov.homeworks.homework7;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {


//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//        Перший масив - це числа, які загадані фірмою-організатором лотереї.
//        Другий масив - це числа, які вгадав гравець.
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//        first[4] повинен дорівнювати second[4], як показано нижче.
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//        [0, 1, 4, 5, 5, 8, 9]
//        [1, 1, 2, 3, 5, 6, 9]
//        Кількість збігів: 3

        int[] lotteryNum = new int[7];
        int[] playerNum = new int[7];
        int counterMatch = 0;

        for (int i = 0; i < lotteryNum.length; i++) {
            lotteryNum[i] = (int) (Math.random() * 10);
            playerNum[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(lotteryNum);
        Arrays.sort(playerNum);


        System.out.println("Lottery ticket: " + Arrays.toString(lotteryNum));
        System.out.println("\nPlayer`s guess: " + Arrays.toString(playerNum));

        for (int i = 0; i < lotteryNum.length; i++) {
            if (lotteryNum[i] == playerNum[i]) {
                counterMatch++;
            }
        }

        System.out.println("\nTotal count of matches: " + counterMatch);

    }
}
