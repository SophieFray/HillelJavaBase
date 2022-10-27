package com.hillel.viarhiozov.lessons.lesson4;

import java.util.Scanner;

public class Lesson4 {


    public static void main(String[] args) {

        final double COEF = 1.5;

        // константа - должна называться всегда в верхнем регистре. Это значение задается один раз и является неизменной. Такую переменную можно инициализировать лишь 1 раз.

        int a = 16;

        int b = 20;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);

//        референсные данные сравниваются по другому в случае референсных типов данных сравнивается имено ссылка на обьект в хипе при использовании ==

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1.equals(str2));
//        для референсных данных используется equals


//        Логичные операторы (управляющие конструкции)


        int q = 10;
        int w = 20;
        int e = 30;


        System.out.println((q < w) && (w < e));

//        && лоигеское "И" если получили фолс слева, то дальше даже не проверяет так как достаточно одного фалс что бы ответ был фолс.

        System.out.println((q < w) && (w < e));


//   || Логическое или если хотя бы одно условие дает тру, значит тру.


//        if(q == 10){
//
//            System.out.println("Test");
//
//        } else {
//
//
//            System.out.println("Else");
//
//
//        }

        if (q != 10) {

            System.out.println("Test");

        } else if (q != b) {


            System.out.println("Else");


        } else {

        }


        Scanner scanner = new Scanner(System.in);


        String next = scanner.next();

//        Считывает только следующее одно слово до пробела все что после пробела попадает в кеш сканнера (по факту все попадает в кеш, а оотуда считывается)
        String next1 = scanner.nextLine();

//        Считывает всю строку которую ввел пользователь до нажатия энтер (создаем /n)

        System.out.println("Enter int");
        if (scanner.hasNextInt()) {

            int number = scanner.nextInt();
            System.out.println(number);
            scanner.nextLine();
//            Используется чтобы зачистить буфер сканнера

        } else {

            System.out.println("Wrong data");
            System.exit(0);

        }
    }}
