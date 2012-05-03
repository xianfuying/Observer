package com.seeder;

public class Water {
    public boolean pour(Weather weather) {
        return weather.shouldPour();
    }
}
