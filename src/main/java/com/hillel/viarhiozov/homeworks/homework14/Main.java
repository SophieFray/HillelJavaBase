package com.hillel.viarhiozov.homeworks.homework14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Drinks.DrinksMachine> orderList = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect desirable drink!\n1.Tea\n2.Coffee\n3.Lemonade\n4.Mojito\n5.Soda\n6.Coke\n7.Confirm Order\n8.Exit");
            if (scanner.hasNextInt()) {
                int userChoice = scanner.nextInt();
                if (userChoice < 1 || userChoice > 8) {
                    System.out.println("Wrong input! Only int from 1 to 8 are allowed!");
                    scanner.nextLine();
                } else {
                    switch (userChoice) {
                        case 1:
                            orderList.add(Drinks.DrinksMachine.TEA);
                            System.out.println("Tea was successfully added! \nYou have " + orderList.size() + " drink(s) ordered!");
                            break;

                        case 2:
                            orderList.add(Drinks.DrinksMachine.COFFEE);
                            System.out.println("Coffee was successfully added! \nYou have " + orderList.size() + " drink(s) ordered!");
                            break;

                        case 3:
                            orderList.add(Drinks.DrinksMachine.LEMONADE);
                            System.out.println("Lemonade was successfully added! \nYou have " + orderList.size() + " drink(s) ordered!");
                            break;

                        case 4:
                            orderList.add(Drinks.DrinksMachine.MOJITO);
                            System.out.println("Mojito was successfully added! \nYou have " + orderList.size() + " drink(s) ordered!");
                            break;

                        case 5:
                            orderList.add(Drinks.DrinksMachine.SODA);
                            System.out.println("Soda was successfully added! \nYou have " + orderList.size() + " drink(s) ordered!");
                            break;

                        case 6:
                            orderList.add(Drinks.DrinksMachine.COKE);
                            System.out.println("Coke was successfully added! \nYou have " + orderList.size() + " drink(s) ordered!");
                            break;

                        case 7:
                            for (int i = 0; i < orderList.size(); i++) {
                                Drinks.prepareDrink(orderList.get(i));
                            }
                            System.out.println("Your total drinks count: " + orderList.size() + " Pcs");
                            Drinks.check();
                            orderList.clear();
                            break;

                        case 8:
                            if (orderList.size() > 0) {
                                System.out.println("Your order is not complete! Confirm it before leaving!");

                                break;
                            }

                            return;


                    }
                }

            } else {
                System.out.println("Wrong input! Only int from 1 to 8 are allowed!");
                scanner.nextLine();

            }
        }

    }


}
