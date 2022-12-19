package com.hillel.viarhiozov.homeworks.homework12;

public class Iphones implements Smartphones, IOS {

    @Override
    public void call() {
        System.out.println("Iphones.call");
    }

    @Override
    public void sms() {
        System.out.println("Iphones.sms");
    }

    @Override
    public void internet() {
        System.out.println("Iphones.internet");
    }
}
