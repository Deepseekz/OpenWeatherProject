package com.example.openweathertp;

import java.util.List;

public class Weathers {
    private List<Weather> weather;

    public Weathers(List<Weather> weather) {
        this.weather = weather;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        String resultat = "";
        for (Weather weather : this.weather){
            resultat += weather.toString();
        }
        return resultat;
    }
}
