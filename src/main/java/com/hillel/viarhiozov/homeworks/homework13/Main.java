package com.hillel.viarhiozov.homeworks.homework13;

public class Main {

    public static void main(String[] args) {

        MusicStyles[] bands = {
                new ClassicMusic(),
                new PopMusic(),
                new RockMusic()
        };

        for (MusicStyles i : bands) {

            i.playMusic();

        }


    }
}
