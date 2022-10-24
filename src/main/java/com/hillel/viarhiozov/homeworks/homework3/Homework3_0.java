package com.hillel.viarhiozov.homeworks.homework3;

public class Homework3_0 {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        int height = (int) ((Math.random() * (max - min + 1)) + min);
        int length = (int) ((Math.random() * (max - min + 1)) + min);
        int width = (int) ((Math.random() * (max - min + 1)) + min);

        int volume = height * length * width;

        int lengthSum = (height + length  + width) * 4;

        System.out.println("Параметри паралелепіпеда:");
        System.out.println("Висота - " + height);
        System.out.println("Ширина - " + width);
        System.out.println("Довжина - " + length);
        System.out.println();


        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println();
        System.out.println("Сумма сторін паралелепіпеда = " + lengthSum);


    }

}
