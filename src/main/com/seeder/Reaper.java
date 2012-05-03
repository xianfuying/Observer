package com.seeder;

public class Reaper {
    public boolean reap(Weather weather) {
        return weather.shouldReap();
    }
}
