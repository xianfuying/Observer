package com.seeder;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class seederTest {

    @Test
    public void should_seed_when_temperature_higher_than_7_degree() {
        Seeder seeder = new Seeder();
        Weather weather = new Weather(8, 34, 2);

        boolean seed = seeder.seed(weather);

        assertThat(seed, is(true));
    }

    @Test
    public void should_not_seed_when_temperature_lower_than_7_degree(){
        Seeder seeder = new Seeder();
        Weather weather = new Weather(6, 32, 4);

        boolean seed = seeder.seed(weather);

        assertThat(seed, is(false));
    }

    @Test
    public void should_reap_when_humidity_lower_than_65_and_temperature_higher_than_20() {
        Reaper reaper = new Reaper();
        Weather weather = new Weather(30, 55, 3);

        boolean reap = reaper.reap(weather);

        assertThat(reap, is(true));
    }

    @Test
    public void should_not_reap_when_humidity_higher_than_65() {
        Reaper reaper = new Reaper();
        Weather weather = new Weather(30, 75, 3);

        boolean reap = reaper.reap(weather);

        assertThat(reap, is(false));
    }

    @Test
    public void should_not_reap_when_temperature_lower_than_20() {
        Reaper reaper = new Reaper();
        Weather weather = new Weather(15, 35, 2);

        boolean reap = reaper.reap(weather);

        assertThat(reap, is(false));
    }

    @Test
    public void should_pour_when_temperature_higher_than_10_humidity_lower_than_55_wind_smaller_than_4() {
        Water water = new Water();
        Weather weather = new Weather(15, 35, 3);

        boolean pour = water.pour(weather);
        
        assertThat(pour, is(true));
    }

    @Test
    public void should_not_pour_when_temperature_lower_than_10() {
        Water water = new Water();
        Weather weather = new Weather(5, 35, 3);

        boolean pour = water.pour(weather);

        assertThat(pour, is(false));
    }

    @Test
    public void should_not_pour_when_humidity_higher_than_55() {
        Water water = new Water();
        Weather weather = new Weather(15, 65, 3);

        boolean pour = water.pour(weather);

        assertThat(pour, is(false));
    }

    @Test
    public void should_not_pour_when_wind_stronger_than_4() {
        Water water = new Water();
        Weather weather = new Weather(15, 45, 5);

        boolean pour = water.pour(weather);

        assertThat(pour, is(false));
    }

    @Test
    public void should_raise_when_temperature_higher_than_25_humidity_lower_than_45_wind_stranger_than_3() {
        Raiser raiser = new Raiser();
        Weather weather = new Weather(35, 35, 4);

        boolean raise = raiser.raise(weather);

        assertThat(raise, is(true));
    }

    @Test
    public void should_raise_when_temperature_lower_than_25() {
        Raiser raiser = new Raiser();
        Weather weather = new Weather(15, 35, 4);

        boolean raise = raiser.raise(weather);

        assertThat(raise, is(false));
    }

    @Test
    public void should_raise_when_humidity_higher_than_45() {
        Raiser raiser = new Raiser();
        Weather weather = new Weather(26, 55, 4);

        boolean raise = raiser.raise(weather);

        assertThat(raise, is(false));
    }

    @Test
    public void should_raise_when_wind_smaller_than_3() {
        Raiser raiser = new Raiser();
        Weather weather = new Weather(26, 35, 2);

        boolean raise = raiser.raise(weather);

        assertThat(raise, is(false));
    }
}
