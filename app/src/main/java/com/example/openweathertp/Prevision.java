package com.example.openweathertp;

import java.io.Serializable;

public class Prevision implements Serializable {

    private Main main;
    private Weathers weathers;
    private Wind wind;

    public Prevision(Main main, Weathers weathers, Wind wind) {
        this.main = main;
        this.weathers = weathers;
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weathers getWeathers() {
        return weathers;
    }

    public void setWeathers(Weathers weathers) {
        this.weathers = weathers;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return weathers.toString();
    }
}