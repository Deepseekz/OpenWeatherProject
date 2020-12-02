package com.example.openweathertp;

public class City {
    private int _id;
    private String _name;
    private Coord _coord;
    private String _country;

    public City(int _id, String _name, Coord _coord, String _country) {
        this._id = _id;
        this._name = _name;
        this._coord = _coord;
        this._country = _country;
    }
}
