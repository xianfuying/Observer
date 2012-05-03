package com.seeder;

public class Raiser {
    public boolean raise(Weather weather) {
        return weather.shouldRaise();
    }
}
