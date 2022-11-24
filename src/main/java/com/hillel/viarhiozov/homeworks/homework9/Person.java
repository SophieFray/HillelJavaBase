package com.hillel.viarhiozov.homeworks.homework9;

public class Person {


    public static void main(String[] args) {


        System.out.println(personInfo("Стьюи","Гриффин","London","1111111"));
        System.out.println(personInfo("Мегатрон","Гриффин","Куахог","0-0-0-0-0-0-0-0"));
        System.out.println(personInfo("Глен","Квагмайр","NY","69-69-69-69"));



    }

    public static String personInfo(String name, String surname, String city, String phone) {

        return "Зателефонувати громадянину " + name + " " + surname + " iз міста " + city + " можна за номером " + phone;

    }

}
