package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Forecasts implements Serializable {
    private ArrayList<Forecast> list;
    private City city;

    public Forecasts(ArrayList<Forecast> list, City city) {
        this.list = list;
        this.city = city;
    }

    public ArrayList<Forecast> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}
