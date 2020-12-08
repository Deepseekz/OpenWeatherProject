package com.example.openweathertp;

import java.io.Serializable;

public class Prevision implements Serializable {

    private Main main;
    private Weather weather;
    private Wind wind;

    public Prevision(Main main, Weather weather, Wind wind) {
        this.main = main;
        this.weather = weather;
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}