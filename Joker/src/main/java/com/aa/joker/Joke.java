package com.aa.joker;

import java.util.Random;

public class Joke {

    private final String[] jokesArray =
            new String[]{
            "What's the object-oriented way to become wealthy? \n Inheritance",
            "There are 10 types of people in the world: those who understand binary, and those who don't",
            "Why was the JavaScript developer sad? \n Because he didn't Node how to Express himself",
            "There's a band called 1023MB. They haven't had any gigs yet",
            "Two bytes meet. The first byte asks, Are you ill? \n The second byte replies, No, just feeling a bit off."
    };

    public String getJoke() {

        int x=new Random().nextInt(jokesArray.length);
        return jokesArray[x];

    }
}
