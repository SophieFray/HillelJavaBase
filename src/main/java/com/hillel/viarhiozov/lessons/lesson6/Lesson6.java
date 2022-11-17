package com.hillel.viarhiozov.lessons.lesson6;

import java.util.Arrays;

public class Lesson6 {

    public static void main(String[] args) {


        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }



        boolean hasChanges;
        int temp = 0;

        do{
            hasChanges = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    hasChanges = true;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }

            }

        } while (hasChanges);

        System.out.println("Lottery ticket: " + Arrays.toString(array));

//        while (hasChanges) {
//            hasChanges = false;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    hasChanges = true;
//
//                    temp = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = temp;
//                }
//
//            }
//
//        }


    }
}




