package com.hillel.viarhiozov.homeworks.homework8;

import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int rows = 0;
        int columns = 0;


        while (true) {
            System.out.println("Enter the number of rows!");
            if (scanner.hasNextInt() == false) {
                System.out.println("\nWrong input! Only ints greater than '1' are allowed!");
                scanner.nextLine();
                continue;
            }

            rows = scanner.nextInt();
            if (rows < 1) {

                System.out.println("\nWrong input! Only ints from 0 to 10 are allowed!");
                continue;
            }
            scanner.nextLine();
            break;
        }

        while (true) {
            System.out.println("Enter the number of columns!");
            if (scanner.hasNextInt() == false) {

                System.out.println("\nWrong input! Only ints greater than '1' are allowed!");
                scanner.nextLine();
                continue;
            }

            columns = scanner.nextInt();
            if (columns < 1) {

                System.out.println("\nWrong input! Only ints from 0 to 10 are allowed!");
                continue;
            }
            break;
        }

        int[][] firstMatrix = new int[rows][columns];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = (int) (Math.random() * 11);
            }
        }

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] secondMatrix = new int[columns][rows];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                secondMatrix[j][i] = firstMatrix[i][j];
            }
            System.out.println();
        }


        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
