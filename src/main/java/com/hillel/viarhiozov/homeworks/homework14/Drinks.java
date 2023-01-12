package com.hillel.viarhiozov.homeworks.homework14;

import java.util.ArrayList;

public class Drinks {

    static final int TEA_COST = 25;
    static final int COFFEE_COST = 35;
    static final int LEMONADE_COST = 45;
    static final int MOJITO_COST = 55;
    static final int SODA_COST = 15;
    static final int COKE_COST = 20;

    private static int CostTotal = 0;


    enum DrinksMachine {
        TEA,
        COFFEE,
        LEMONADE,
        MOJITO,
        SODA,
        COKE
    }


    private static void teaPreparation() {
        System.out.println("Tea is being prepared...");
    }

    private static void coffeePreparation() {
        System.out.println("Coffee is being prepared...");
    }

    private static void lemonadePreparation() {
        System.out.println("Lemonade is being prepared...");
    }

    private static void mojitoPreparation() {
        System.out.println("Mojito is being prepared...");
    }

    private static void sodaPreparation() {
        System.out.println("Soda is being prepared...");
    }

    private static void cokePreparation() {
        System.out.println("Coke is being prepared...");
    }


    public static void prepareDrink(DrinksMachine drinks) {

        switch (drinks) {
            case TEA:
                teaPreparation();
                CostTotal += TEA_COST;
                break;

            case COFFEE:
                coffeePreparation();
                CostTotal += COFFEE_COST;
                break;

            case LEMONADE:
                lemonadePreparation();
                CostTotal += LEMONADE_COST;
                break;

            case MOJITO:
                mojitoPreparation();
                CostTotal += MOJITO_COST;
                break;

            case SODA:
                sodaPreparation();
                CostTotal += SODA_COST;
                break;

            case COKE:
                cokePreparation();
                CostTotal += COKE_COST;
                break;

        }
    }

    public static void check() {

        System.out.println("Total cost: $" + CostTotal);
        CostTotal = 0;

    }


}



