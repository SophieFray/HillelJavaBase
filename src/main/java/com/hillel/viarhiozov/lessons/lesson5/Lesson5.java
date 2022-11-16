package com.hillel.viarhiozov.lessons.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson5 {

    public static void main(String[] args) {

//        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] array = new int[10];





        for (int i = 0; i < array.length; i++){

            array[i] = (int) (Math.random() * 11);

        }

        System.out.println(Arrays.toString(array));

        int[] array1 = null;
//        NPE - Null pointer exception
        array1[0] = 10;
//        Проверять на null перед обращением к массиву

        int[] averageAgePlayersTeam = new int[] {1,2,3,4,5};


        for (int value :
             averageAgePlayersTeam) {
            System.out.println(value + "");
        }

    }

}
