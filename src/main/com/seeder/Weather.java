package com.seeder;

public class Weather {
    private int temperature;
    private int humidity;
    private int wind;

    public Weather(int temperature, int humidity, int wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
    }

    public boolean shouldReap() {
        return temperature > 20 && humidity < 65;
    }

    public boolean shouldSeed() {
        return temperature > 7;
    }

    public boolean shouldPour() {
        return temperature > 10 && humidity < 55 && wind < 4;
    }

    public boolean shouldRaise() {
        return temperature > 25 && humidity < 45 && wind > 3;
    }
}
