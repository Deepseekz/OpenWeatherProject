package com.example.openweathertp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Previsions implements Serializable {
    private List<Prevision> previsions;
    private City city;

    public Previsions(List<Prevision> previsions, City city) {
        this.previsions = previsions;
        this.city = city;


    }

    public List<Prevision> getPrevisions() {
        return previsions;
    }

    public void setPrevisions(List<Prevision> previsions) {
        this.previsions = previsions;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}