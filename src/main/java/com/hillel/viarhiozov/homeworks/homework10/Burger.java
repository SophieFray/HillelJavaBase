package com.hillel.viarhiozov.homeworks.homework10;

public class Burger {

    String bun;
    String meat;
    boolean isDoubleMeat = false;
    String salad;
    String cheese;
    String mayonnaise;

    public Burger(String bun, String meat, String salad, String cheese, String mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.salad = salad;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println();
        System.out.println("Standard composition: " + "\nMeat: " + meat + "\nBun: " + bun + "\nSalad: " + salad + "\nMayonnaise: " + mayonnaise + "\nCheese: " + cheese);

    }

    public Burger(String bun, String meat, String salad, String cheese) {
        this.bun = bun;
        this.meat = meat;
        this.salad = salad;
        this.cheese = cheese;
        System.out.println();
        System.out.println("Diet Burger composition: " + "\nMeat: " + meat + "\nBun: " + bun + "\nSalad: " + salad + "\nMayonnaise: " + "\nCheese: " + cheese);

    }

    public Burger(String bun, String meat, String salad, String cheese, String mayonnaise, boolean isDoubleMeat) {

        this.meat = meat;
        this.bun = bun;
        this.salad = salad;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.isDoubleMeat = isDoubleMeat;
        System.out.println();
        System.out.println("Double Meat composition: " + "\nMeat: " + this.meat + "\nDouble Meat: " + this.isDoubleMeat + "\nBun: " + this.bun + "\nSalad: " + salad + "\nMayonnaise: " + this.mayonnaise + "\nCheese: " + cheese);
    }


}
