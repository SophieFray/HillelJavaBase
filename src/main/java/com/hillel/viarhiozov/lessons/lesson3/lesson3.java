package com.hillel.viarhiozov.lessons.lesson3;



public class lesson3 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("result = " + (a++ + ++b + a++));
//        System.out.println("a = " + a);
//        System.out.println("b  = " + b);

//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(3.333333);
//
//        //cast double to int
//        System.out.println((int)3.3333);
//
//
//        System.out.println((double)10/3);
//
//
//        System.out.println((double)10/ (double)3);
//        System.out.println((10/ (double)3));
//        System.out.println((double)10/ (double) 3);
//
//
//        int result = 5;
//
//        result = result + 1;
//        result = result + 1;
//        result = result + 1;
//        result = result++;
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(result);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();

        int i = 5;
        int o = 10;

        i = i + o;

        i += o;

        System.out.println(i);
        System.out.println(i);

        // нельзя скастовать в уже созданную переменную, всегда сильнее имменно тип перпемменной и в него автоматически кастуется



        int r = Math.abs(-1);
    //модуль числа

        System.out.println(r);


        Math.pow(5,3);
        //Возвезедение первого числа в степень (второе число)


        Math.sqrt(25);
        // Корень квадратный из числа

        Math.random();
        //Возвращает число от 0.0 до 1.0 Квадратная скобочка значит включительно


        int min = 10;
        int max = 20;
        int resultRand = (int) ((Math.random() * (max- min + 1)) + min);

        System.out.println(resultRand);


        System.out.println(Math.round(10.6));



        int a = 700;

        int b = 2000;

        int c = 3500;

        int count10YearsMonth = 120;

        int salaryA = (int) ((a*count10YearsMonth)*0.95);
        int salaryB = (int) ((b*count10YearsMonth)*0.95);
        int salaryC = (int) ((c*count10YearsMonth)*0.95);

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Junior`s Salary: " + salaryA);
        System.out.println("Middle`s Salary: " + salaryB);
        System.out.println("Senior`s Salary: " + salaryC);





    }

}
